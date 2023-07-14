# WESTERN GOVERNORS UNIVERSITY
## D387 – ADVANCED JAVA
### By Daniel Kenney

## Part A:
- Created pipeline in Gitlab and replicated code in IDE with git
- Branched off main with working_branch for all changes

## Part B:
### 1. 
- Updated README.md file for changelog and descriptions of each change made in the code
### 2. 
- https://gitlab.com/wgu-gitlab-environment/student-repos/dken115/d387-advanced-java/-/tree/working_branch?ref_type=heads

## Part C:
### 1.a.
- Created Resource Bundle under main folder
- (languages_en_US.properties) added Line 1 welcome message variable in English
- (languages_fr_CA.properties) added Line 1 welcome message variable in French
### b.
- Created directory il8n for the internationalization of the program and adding french functionality, conversion and such
- Created DisplayMessage class in il8n folder for the getWelcomeMessage method to pull the locale and load each resource bundle for each locale, returns the welcomeMessage
- Created GreetingController.java for the mapping and crossorigin support of the greeting and retrieving an API endpoint for the frontend
- (D387SampleCodeApplication.java) Lines 16-27 created the two instances of the displaymessage as well as two threads that will call the respective displaymessage
- (app.component.ts) added Lines 17-19 to create HTTP GET request
- (app.component.html) added Lines 25-28 to call the GET request from the app.component.ts in a h2 format
- Failing to appear in frontend, need to bug fix the app.component.ts
- (app.component.ts) found problem where I wasn't using the get request with the proper baseURL
- fixed issue with message not return new in the controller, now appears in the localhost:4200
### 2.
- (app.component.ts) Lines 110-111 added for the Canadian price and the european price to be added for frontend conversion of money
- (app.component.ts) Lines 57-65 added the conversion for each price variable on each difference currency and then applied the conversion to each room price and assigned
- (app.component.html) Lines 80-84 changed to represent the different types of pricing offered and displayed with HTML strong attribute
### 3.a.
- Created ConvertTime.java for the sake of performing the conversions of the time zones
- (ConvertTime.java) Lines 14-21 define the format for the time zones and the time zones that need to be converted
- (ConvertTime.java) Lines 23-31 convert the time zones and formats each of the objects to the necessary string input for return
- (ConvertTime.java) Line 34 return the string with formatting with all listed time zones
- Created ConvertTimeController.java to create the REST controller and gives the API endpoint for the strings and conversions of time zones
- (ConvertTimeController.java) Lines 13-16 simple RestController to return the converted times as strings
### b.
- (app.component.ts) Line 33 initializes the empty string
- (app.component.ts) Lines 99-103 added the getConvertedtimes method for the get request to the API endpoint
- (app.component.ts) Line 39 calls the method in the ngOnInIt() function
- (app.component.html) Lines 28-31 add the html for the insert of the times and their respective time zones
## Part D:
### 1.
- Run mvn clean package to create the jar image file for the docker container
- (Dockerfile) Lines 1-14 create Dockerfile with all the necessary info such as the jar file location and the image information for running in docker
### 2.
- Failed to build docker image got error: Exception in thread "main" java.lang.UnsupportedClassVersionError: edu/wgu/d387_sample_code/D387SampleCodeApplication has been compiled by a more recent version of the Java Runtime (class file version 61.0), this version of the Java Runtime only recognizes class file versions up to 52.0
- (Dockerfile) fixed it by adding the correct jdk to : openjdk:17-jdk-alpine Line 2
- Screenshot attached with name of container running and full application functioning
### 3. Cloud Deployment Writeup
If I were entrusted with deploying this current multithreaded Spring application to the cloud I would use the Google Cloud platform and deploy it through their Google App Engine.
The steps I would take would go as follows: 
- 1. Take my depoloyable JAR file through the maven clean package command
- 2. Install the Google Cloud SDK to set up the tools necessary for deploying my application to the Google Cloud, such as gcloud and gsutil
- 3. App Engine uses an app.yaml file to describe an application's deployment configuration, therefore I would set the runtime environment as well as the instance class
- 4. From there, I could deploy the app with the "gcloud app browse" and explore my app on the web

The reason I chose Google Cloud Platforms is because it is a great option for deploying any Spring Boot application because of its scalability, robustness, and the range of other services it offers that integrate well with Google App Engine. These include Google Cloud SQL for databases, Google Cloud Storage for file storage, Google Kubernetes Engine for containerized applications, and Google Cloud Functions for serverless computing.