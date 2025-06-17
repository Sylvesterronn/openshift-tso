FROM docker-images.artifactory.danskenet.net/db/eclipse-temurin:23-jdk

WORKDIR /deployments

COPY target/Api-0.0.1-SNAPSHOT.jar /deployments/

CMD ["java", "-jar", "Api-0.0.1-SNAPSHOT.jar"]