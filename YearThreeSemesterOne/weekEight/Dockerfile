# Use the official Eclipse Temurin JDK 21 image as the base image
FROM eclipse-temurin:21-jdk-ubi9-minimal

# Copy the JAR file from the target directory into the container
COPY target/*.jar app.jar

# Expose port 8080 (default for Spring Boot applications)
EXPOSE 8080

# Define the entry point to run the JAR file with Java
ENTRYPOINT ["java", "-jar", "app.jar"]