# Google Cloud Functions with Kotlin example project
This is a template for creating a Google Cloud Function written in Kotlin.  
It contains a simple function that listens to standard HTTP request, responds with a simple message and logs it to console.

## Requirements
You need some tooling installed and configured to make this work:
* Java
* Google Cloud SDK

Note: Make sure to have your Google Cloud SDK configured to the project where you want the cloud function to be deployed.

## Clone the project
Clone the project to your desired workspace:
```bash
git clone git@github.com:rodob/google-cloud-kotlin-functions.git
```
Note: The project uses maven and the takari maven-wrapper is included in the project

## Compile with Maven
```bash
./mvnw compile
```

## Test the function locally
```bash
./mvnw function:run
```

## Deploy the function to your current Google Cloud Project
```bash
gcloud functions deploy helloFunction --entry-point HelloFunction --runtime java11 --trigger-http
```
If the function is successfully deployed you should see a url to where you can access the function.