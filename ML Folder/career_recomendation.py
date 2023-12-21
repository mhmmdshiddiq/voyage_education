# -*- coding: utf-8 -*-
"""Career Recomendation.ipynb

Automatically generated by Colaboratory.

Original file is located at
    https://colab.research.google.com/drive/1KmV1TMvmqyCgyhCzDxto1oliKOIeTbr2
"""

import pandas as pd
import numpy as np
from sklearn.model_selection import train_test_split
from sklearn.preprocessing import LabelEncoder, StandardScaler
from tensorflow.keras.models import Sequential
from tensorflow.keras.layers import Dense

from google.colab import drive
drive.mount('/content/drive')

data_tes_df = pd.read_csv('/content/drive/MyDrive/data_tes_career.csv')

label_encoder = LabelEncoder()
data_tes_df['Career Recommendation'] = label_encoder.fit_transform(data_tes_df['Career Recommendation'])

X_train, X_test, y_train, y_test = train_test_split(
    data_tes_df.drop('Career Recommendation', axis=1),
    data_tes_df['Career Recommendation'],
    test_size=0.2, random_state=42
)

scaler = StandardScaler()
X_train_normalized = scaler.fit_transform(X_train)
X_test_normalized = scaler.transform(X_test)

model = Sequential()
model.add(Dense(64, input_dim=X_train.shape[1], activation='relu'))
model.add(Dense(32, activation='relu'))
model.add(Dense(len(data_tes_df['Career Recommendation'].unique()), activation='softmax'))

model.compile(optimizer='adam', loss='sparse_categorical_crossentropy', metrics=['accuracy'])

model.fit(X_train_normalized, y_train, epochs=50, batch_size=2, validation_data=(X_test_normalized, y_test))

"""....

Tes Input nilai user baru
"""

new_user_data = np.array([4, 4, 4, 2, 2, 5, 5, 5]).reshape(1, -1)

new_user_data_normalized = scaler.transform(new_user_data)

new_user_prediction = model.predict(new_user_data_normalized)

predicted_class_index = np.argmax(new_user_prediction, axis=1)
predicted_class = label_encoder.inverse_transform(predicted_class_index)[0]

print("\nCareer recommendation :", predicted_class)

model.save('model.h5')