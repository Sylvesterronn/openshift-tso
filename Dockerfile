FROM docker-images.artifactory.danskenet.net/db/eclipse-temurin:23-jdk
WORKDIR /app

COPY . /app

CMD ["java", "-cp", "your-aAapplication.jar", "YourMainClass"]
