# Step 1: Use Maven to build the project
# Use an official Maven image to build the project
FROM maven:3.8.5-openjdk-17 AS build

# Set the working directory in the container
WORKDIR /app

# Copy the Maven project files
COPY pom.xml ./
COPY src ./src

# Run Maven to build the project
RUN mvn clean package -DskipTests

# Step 2: Create a smaller image for running the application
# Use a smaller JDK image to run the application
FROM openjdk:17-jdk-slim

# Set working directory
WORKDIR /app

# Copy the built .jar file from the Maven build stage
COPY --from=build /app/target/*.jar app.jar

# Expose the port the app runs on
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]