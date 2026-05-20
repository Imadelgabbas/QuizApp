from fastapi import FastAPI, UploadFile, File, Form, HTTPException
from fastapi.middleware.cors import CORSMiddleware
import firebase_admin
from firebase_admin import credentials, firestore
from deepface import DeepFace
import numpy as np
from PIL import Image
import io
import os
import tempfile
import uuid

# Initialize Firebase
cred = credentials.Certificate("firebase_key.json")

if not firebase_admin._apps:
    firebase_admin.initialize_app(cred)
db = firestore.client()

# Create FastAPI app
app = FastAPI()

# Add CORS middleware
app.add_middleware(
    CORSMiddleware,
    allow_origins=["*"],
    allow_credentials=True,
    allow_methods=["*"],
    allow_headers=["*"],
)


def cosine_similarity(a: list, b: list) -> float:
    """
    Calculate cosine similarity between two embeddings.
    Returns a float between 0 and 1.
    """
    a = np.array(a)
    b = np.array(b)
    
    dot_product = np.dot(a, b)
    norm_a = np.linalg.norm(a)
    norm_b = np.linalg.norm(b)
    
    similarity = dot_product / (norm_a * norm_b)
    return float(similarity)


@app.post("/register")
async def register(email: str = Form(...), photo: UploadFile = File(...)):
    """
    Register a new user with face recognition.
    Stores the face embedding in Firestore.
    """
    tmp_path = None
    try:
        # Save uploaded file to temporary location
        file_content = await photo.read()
        temp_filename = f"{uuid.uuid4()}.jpg"
        tmp_path = os.path.join(tempfile.gettempdir(), temp_filename)
        
        with open(tmp_path, "wb") as f:
            f.write(file_content)
        
        # Extract embedding using DeepFace
        try:
            result = DeepFace.represent(
                img_path=tmp_path,
                model_name="Facenet",
                enforce_detection=True
            )
        except Exception as e:
            raise HTTPException(
                status_code=400,
                detail="No face detected in the image"
            )
        
        embedding = result[0]["embedding"]
        
        # Store in Firestore
        db.collection("users").document(email).set({
            "email": email,
            "embedding": embedding
        })
        
        return {
            "success": True,
            "message": "Utilisateur enregistré"
        }
    
    finally:
        # Clean up temporary file
        if tmp_path and os.path.exists(tmp_path):
            os.remove(tmp_path)


@app.post("/login")
async def login(photo: UploadFile = File(...)):
    """
    Login using face recognition.
    Compares the uploaded face with all stored embeddings.
    """
    tmp_path = None
    try:
        # Save uploaded file to temporary location
        file_content = await photo.read()
        temp_filename = f"{uuid.uuid4()}.jpg"
        tmp_path = os.path.join(tempfile.gettempdir(), temp_filename)
        
        with open(tmp_path, "wb") as f:
            f.write(file_content)
        
        # Extract embedding using DeepFace
        try:
            result = DeepFace.represent(
                img_path=tmp_path,
                model_name="Facenet",
                enforce_detection=True
            )
        except Exception as e:
            raise HTTPException(
                status_code=400,
                detail="No face detected in the image"
            )
        
        login_embedding = result[0]["embedding"]
        
        # Fetch all users from Firestore
        users = db.collection("users").stream()
        
        best_match = None
        best_similarity = 0
        
        # Compare with all stored embeddings
        for user in users:
            user_data = user.to_dict()
            stored_embedding = user_data.get("embedding")
            
            if stored_embedding:
                similarity = cosine_similarity(login_embedding, stored_embedding)
                
                if similarity > best_similarity:
                    best_similarity = similarity
                    best_match = user_data.get("email")
        
        # Check if best match meets threshold
        if best_similarity >= 0.6:
            return {
                "success": True,
                "email": best_match
            }
        else:
            raise HTTPException(
                status_code=404,
                detail={
                    "success": False,
                    "message": "Visage non reconnu"
                }
            )
    
    finally:
        # Clean up temporary file
        if tmp_path and os.path.exists(tmp_path):
            os.remove(tmp_path)


@app.get("/health")
async def health():
    """
    Health check endpoint.
    """
    return {"status": "ok"}


if __name__ == "__main__":
    import uvicorn
    uvicorn.run("main:app", host="0.0.0.0", port=8000, reload=True)
