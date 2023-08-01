FROM openjdk:19-jdk-alpine

WORKDIR /app

COPY target/*-SNAPSHOT.jar /app/app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]

