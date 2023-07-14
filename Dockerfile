# base image containing Java runtime
FROM openjdk:17-jdk-alpine

# Make port 8080 available to the world outside this container
EXPOSE 8080

# assign application's jar file location
ARG JAR_FILE=target/D387_sample_code-0.0.2-SNAPSHOT.jar

# Add application's jar to the container
ADD ${JAR_FILE} app.jar

# Run the jar file 
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
