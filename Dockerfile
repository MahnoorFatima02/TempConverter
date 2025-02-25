#FROM ubuntu:latest
#LABEL authors="mahnoorfatima"
#
#ENTRYPOINT ["top", "-b"]

# Use an official Maven image to build the project
FROM maven:3.9.9-eclipse-temurin-17 AS build

# Set the working directory
WORKDIR /app

# Copy the pom.xml and download dependencies
COPY pom.xml .
RUN mvn dependency:go-offline

# Copy the source code and build the project
COPY src ./src
RUN mvn clean package

# Use an official OpenJDK image to run the application
FROM eclipse-temurin:17-jdk

# Set the working directory
WORKDIR /app

# Copy the built JAR file from the build stage
COPY --from=build /app/target/TempConverter.jar /app/TempConverter.jar

# Specify the entry point for the application
ENTRYPOINT ["java", "-jar", "TempConverter.jar"]