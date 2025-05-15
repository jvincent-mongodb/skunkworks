# Use an official OpenJDK runtime as a parent image
FROM openjdk:11

# Set the working directory
WORKDIR /app

# Copy the Java file into the container
COPY MongoDBExample.java /app/MongoDBExample.java

# Install dependencies
RUN apt-get update && apt-get install -y wget && \
    wget https://repo1.maven.org/maven2/org/mongodb/mongodb-driver-sync/4.10.2/mongodb-driver-sync-4.10.2.jar && \
    mv mongodb-driver-sync-4.10.2.jar /app/mongodb-driver-sync.jar

# Compile the Java program
RUN javac -cp .:/app/mongodb-driver-sync.jar MongoDBExample.java

# Command to run the Java program
CMD ["java", "-cp", ".:/app/mongodb-driver-sync.jar", "MongoDBExample"]