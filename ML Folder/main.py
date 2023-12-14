import numpy as np
from sklearn.preprocessing import StandardScaler, LabelEncoder
from tensorflow.keras.models import load_model
import joblib

def make_prediction(new_input):
    # Load model from file
    model = load_model('quiz_model.h5')

    # Load scaler and label_encoder from files
    scaler = joblib.load('scaler.save')
    label_encoder = joblib.load('label_encoder.save')
    
    # Normalisasi input baru
    new_input_normalized = scaler.transform(new_input)
    
    # Prediksi
    predictions = model.predict(new_input_normalized)
    predicted_class_index = np.argmax(predictions, axis=1)
    predicted_class = label_encoder.inverse_transform(predicted_class_index)[0]

    return predicted_class



# Baca input baru (contoh)
new_input = np.array([[5,4,5,4,5,5,4,4]])

# Lakukan prediksi
predicted_class = make_prediction(new_input)

print("Prediction for Career Recommendations:", predicted_class)
