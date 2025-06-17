FROM docker-images.artifactory.danskenet.net/db/eclipse-temurin:23-jdk

WORKDIR /app

COPY target/Api-0.0.1-SNAPSHOT.jar /app/

CMD ["java", "-jar", "Api-0.0.1-SNAPSHOT.jar"]