FROM docker-images.artifactory.danskenet.net/db/eclipse-temurin:23-jdk

WORKDIR /deployment

COPY target/Api-0.0.1-SNAPSHOT.jar /deployment/

CMD ["java", "-jar", "Api-0.0.1-SNAPSHOT.jar"]