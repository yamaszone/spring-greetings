FROM maven:3.9-eclipse-temurin-11 as builder

WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

FROM openjdk:23-jdk-slim
WORKDIR /app

COPY --from=builder /app/target/*-SNAPSHOT.jar ./app.jar

CMD ["java", "-jar", "app.jar"]
