FROM openjdk:17
WORKDIR /app
COPY target/spring-docker-ec2-pipeline.jar spring-docker-ec2-pipeline.jar
EXPOSE 8080
ENTRYPOINT  ["java", "-jar", "spring-docker-ec2-pipeline.jar"]