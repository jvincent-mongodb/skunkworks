# Use an official OpenJDK runtime as a parent image
FROM openjdk:17-jdk-slim

# Set the working directory in the container
WORKDIR /app

# Copy the current directory contents into the container at /app
COPY . /app

# Download and install dependencies
RUN apt-get update && apt-get install -y \
    wget \
    && rm -rf /var/lib/apt/lists/*

# Download MongoDB Java Driver
RUN wget https://repo1.maven.org/maven2/org/mongodb/mongodb-driver-sync/4.10.2/mongodb-driver-sync-4.10.2.jar -P /app

# Compile the Java program
RUN javac -cp .:/app/mongodb-driver-sync-4.10.2.jar MongoDBExample.java

# Command to run the application
CMD ["java", "-cp", ".:/app/mongodb-driver-sync-4.10.2.jar", "MongoDBExample"]