# Use an official OpenJDK image as a base
FROM openjdk:11

# Set the working directory
WORKDIR /app

# Copy the Java file into the container
COPY MongoKerberosExample.java /app/MongoKerberosExample.java

# Install necessary dependencies
RUN apt-get update && apt-get install -y \
    wget \
    && rm -rf /var/lib/apt/lists/*

# Download MongoDB Java driver (valid version)
RUN wget https://repo1.maven.org/maven2/org/mongodb/mongodb-driver/3.12.12/mongodb-driver-3.12.12.jar -O /app/mongo-java-driver.jar

# Compile the Java file
RUN javac -cp /app/mongo-java-driver.jar MongoKerberosExample.java

# Command to run the compiled Java program
CMD ["java", "-cp", "/app/mongo-java-driver.jar:.", "MongoKerberosExample"]