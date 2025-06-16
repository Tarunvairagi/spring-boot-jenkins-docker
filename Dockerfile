# BASE IMAGE
FROM openjdk:17
# expose port outside the container
EXPOSE 8080
# add jar spring boot to docker
ADD target/spring-boot-maven-docker.jar spring-boot-maven-docker.jar
# RUN THE JAR
ENTRYPOINT ["java","-jar", "/spring-boot-maven-docker.jar"]