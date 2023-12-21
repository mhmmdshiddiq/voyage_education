import os
from flask import Flask, jsonify, request
import numpy as np
from sklearn.preprocessing import StandardScaler, LabelEncoder
from tensorflow.keras.models import load_model
import joblib

app = Flask(__name__)

# Load model from file
model = load_model('quiz_model.h5')

# Load scaler and label_encoder from files
scaler = joblib.load('scaler.save')
label_encoder = joblib.load('label_encoder.save')

@app.route('/predict', methods=['POST'])
def predict():
    data = request.get_json()
    new_input = np.array(data['input'])

    # Normalization of new input
    new_input_normalized = scaler.transform(new_input.reshape(1, -1))

    # Prediction
    predictions = model.predict(new_input_normalized)
    predicted_class_index = np.argmax(predictions, axis=1)
    predicted_class = label_encoder.inverse_transform(predicted_class_index)[0]

    return jsonify({'prediction': predicted_class})

if __name__ == '__main__':
    app.run(debug=True, port=int(os.environ.get('PORT', 8080)))
