![Logo1](https://github.com/mhmmdshiddiq/voyage_education/assets/114437804/37cee9b7-9ebc-476e-8907-5da91a43604b)
# VoyEdu (Voyage Education)

VoyEdu is an app that aims to help high school students determine their future by providing recommendations based on their abilities. The app provides classification tests using artificial intelligence (AI) to help identify students' potential and interests.

## Key Features

### 1. Classification Test
This app provides tests that will help identify students' abilities and interests. The test is powered by artificial intelligence algorithms that will classify the test results accurately.

### 2. Career Recommendations
Based on the test results, VoyEdu will provide career recommendations that match the student's abilities and interests. This helps students make more informed decisions about their future.

### 3. Education Information
The app also provides educational information related to the recommended career, including the level of education required, suitable universities or vocational schools, and career opportunities in the field.

## How to use

1. ***Account Registration***
   - Students need to register for an account using their email to access tests and recommendations.

2. ***Test Filling***
   - After logging in, students will fill out a test that covers various aspects of ability and interest.

3. ***Results and Recommendations***
   - After completing the test, students can view the results and career recommendations that match their profile.
<br><br><br>
## VoyEdu: Revolutionizing Career Decision-Making for High School Students

### Project Overview:
VoyEdu is an AI-powered application designed to assist high school students (SMA/SMK) in making informed decisions about their future careers. Leveraging artificial intelligence algorithms, the project addresses the challenges students face in determining their career paths. The goal is to bridge the gap between academic assessment and career decision-making by providing personalized recommendations based on individual abilities.

### Implementation Steps:
#### a. Training the Model (`train.py`):
- Purpose: The `train.py` script is responsible for training the AI model.
- Data Source: The script reads data from a CSV file (`data_tes_career.csv`) containing features and career recommendations.
- Data Preprocessing: Outlines steps for normalizing features and encoding labels.
- Model Architecture: Describes the architecture of the neural network model created using TensorFlow/Keras.
- Model Saving: Highlights the use of `joblib` to save the scaler, label encoder, and the trained model.
- Customization: Encourages users to replace the example CSV file with their own dataset.

#### b. Model Prediction (`main.py`):
- Purpose: Introduces the `main.py` script for making predictions using the trained model.
- Prediction Function: Provides a clear function (`make_prediction`) that loads the saved model, scaler, and label encoder for predictions.
- Sample Input: Includes a sample input (`new_input`) and demonstrates how to use the function for prediction.
- Customization: Encourages users to replace the sample input with their own data for predictions.

#### c. Flask API for Prediction (`app.py`):
- Purpose: Explains the Flask application (`route.py`) responsible for serving predictions via an API.
- Running the App: Outlines how to run the Flask app, including dependencies (`Flask`, `numpy`, `scikit-learn`, `tensorflow`).
- API Endpoint: Highlights the `/predict` endpoint that receives JSON input and returns a JSON response with predictions.
- Deployment: Specifies how to run the Flask app, either locally or deploying it on a cloud platform.

### Instructions for Replication:
- Virtual Environment: Encourages users to set up a virtual environment to manage dependencies.
- Dependency Installation: Provides information on installing required packages using a `requirements.txt` file.
- External Dependencies: Mentions any external dependencies, such as the Flask application needing an environment variable for the port.
- Version Control: Suggests using a tool like Git for version control and collaborative development.

### Documentation and Collaboration:
- Documentation Emphasis: Highlights the importance of documentation, including comments within code and a README file.
- Collaboration Guide: Encourages collaboration by explaining how team members can contribute to different aspects of the project.

### Ethical Considerations:
- Reminder: Reminds users to consider ethical aspects, such as fairness in AI recommendations and clear communication of model limitations.

By following this guide, users can replicate and build upon the VoyEdu project, making it easier to understand and contribute to its development.
<br><br><br>
## Developer Team Contribution
### Machine Learning Team
- Firdaus Nuur Rhamadhan(M446BSY1157)
- Syah Rizan Nazri Muhammad (M312BSY1285)
- Tulus Toto Raharjo (M312BSY1360)

### Cloud Computing Team
- Muhammad Shiddiq Wicahyo (C015BSY3129)
- Wahyu Ariyadi (C312BSY3972)

### Mobile Development Team
- Ardianto Ramadhan (A008BSY2978)
- Mustika Jagad Gumelar (A463BSY2920)
