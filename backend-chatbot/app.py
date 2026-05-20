from flask import Flask, request, jsonify
import requests

app = Flask(__name__)

OLLAMA_URL = "http://localhost:11434/api/generate"
MODEL_NAME = "llama3.2:3b"

@app.route("/", methods=["GET"])
def home():
    return jsonify({"status": "Server running"})

@app.route("/chat", methods=["POST"])
def chat():
    try:
        data = request.get_json()
        user_message = data.get("message", "")

        payload = {
            "model": MODEL_NAME,
            "prompt": user_message,
            "stream": False
        }

        response = requests.post(OLLAMA_URL, json=payload)

        result = response.json()

        return jsonify({
            "reply": result.get("response", "")
        })

    except Exception as e:
        return jsonify({
            "error": str(e)
        }), 500

if __name__ == "__main__":
    app.run(host="0.0.0.0", port=5000, debug=True)