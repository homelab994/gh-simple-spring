# -------- BUILD STAGE --------
FROM maven:3.9.6-eclipse-temurin-17 AS build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

# -------- PACKAGE STAGE --------
FROM eclipse-temurin:21-jdk-jammy
WORKDIR /app
COPY --from=build /app/target/*.jar gh-simple-spring.jar
EXPOSE 9000
ENTRYPOINT ["java","-jar","gh-simple-spring.jar"]
