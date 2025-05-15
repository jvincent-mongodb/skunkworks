# Use an official OpenJDK image as a parent image
FROM openjdk:11-jdk-slim

# Set the working directory in the container
WORKDIR /app

# Copy the Java file into the container
COPY MongoDBExample.java /app/MongoDBExample.java

# Install Maven to manage dependencies
RUN apt-get update && apt-get install -y maven && rm -rf /var/lib/apt/lists/*

# Create a Maven project structure
RUN mkdir -p /app/src/main/java && mv /app/MongoDBExample.java /app/src/main/java/MongoDBExample.java

# Create a basic Maven pom.xml file with MongoDB Java Driver dependency
RUN echo '<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">\n' > /app/pom.xml \
    && echo '  <modelVersion>4.0.0</modelVersion>\n' >> /app/pom.xml \
    && echo '  <groupId>com.example</groupId>\n' >> /app/pom.xml \
    && echo '  <artifactId>MongoDBExample</artifactId>\n' >> /app/pom.xml \
    && echo '  <version>1.0-SNAPSHOT</version>\n' >> /app/pom.xml \
    && echo '  <dependencies>\n' >> /app/pom.xml \
    && echo '    <dependency>\n' >> /app/pom.xml \
    && echo '      <groupId>org.mongodb</groupId>\n' >> /app/pom.xml \
    && echo '      <artifactId>mongodb-driver-sync</artifactId>\n' >> /app/pom.xml \
    && echo '      <version>4.10.2</version>\n' >> /app/pom.xml \
    && echo '    </dependency>\n' >> /app/pom.xml \
    && echo '  </dependencies>\n' >> /app/pom.xml \
    && echo '</project>\n' >> /app/pom.xml

# Build the project using Maven
RUN mvn -f /app/pom.xml clean compile

# Command to run the Java program
CMD ["java", "-cp", "target/classes:/root/.m2/repository/org/mongodb/mongodb-driver-sync/4.10.2/mongodb-driver-sync-4.10.2.jar", "MongoDBExample"]