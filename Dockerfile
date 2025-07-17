FROM openjdk:24-jdk
WORKDIR /app
COPY target/SafePassword-1.0.0.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]