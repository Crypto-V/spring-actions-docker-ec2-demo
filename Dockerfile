FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
COPY target/springboot-actions-docker-ec2-demo.jar springboot-actions-docker-ec2-demo.jar
EXPOSE 8080
CMD ["java", "jar", "springboot-actions-docker-ec2-demo.jar"]