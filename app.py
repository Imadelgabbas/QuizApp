from flask import Flask, request, jsonify
import requests

app = Flask(__name__)

OLLAMA_URL = "http://localhost:11434/api/generate"

@app.route("/chat", methods=["POST"])
def chat():
    try:
        data = request.get_json()
        user_message = data.get("message", "")

        payload = {
            "model": "llama3.2:3b",
            "prompt": user_message,
            "stream": False
        }

        # Appeler Ollama
        response = requests.post(OLLAMA_URL, json=payload)

        if response.status_code == 200:
            result = response.json()
            # La clé interne d'Ollama est "response"
            bot_reply = result.get("response", "")
        else:
            bot_reply = f"Erreur Ollama (Code: {response.status_code})"

        # On retourne TOUJOURS un JSON avec la clé "reply" pour correspondre au code Android
        return jsonify({
            "reply": bot_reply
        })

    except Exception as e:
        return jsonify({
            "reply": f"Erreur serveur Flask : {str(e)}"
        })

if __name__ == "__main__":
    app.run(host="0.0.0.0", port=5000, debug=True)
