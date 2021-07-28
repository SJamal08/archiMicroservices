
FROM maven:3.6.0-jdk-11-slim AS build
#COPY target/spring-boot-docker.jar spring-boot-docker.jar
#COPY target/spring-boot-docker.jar spring-boot-docker.jar
#RUN mvn clean package
#EXPOSE 8080
#ENTRYPOINT ["java","-jar","/spring-boot-docker.jar"]
ARG JAR_FILE=target/spring-boot-security-jwt-0.0.1-SNAPSHOT.jar

# cd /opt/app
WORKDIR /opt/app

# cp target/spring-boot-web.jar /opt/app/app.jar
COPY ${JAR_FILE} app.jar

# java -jar /opt/app/app.jar
ENTRYPOINT ["java","-jar","app.jar"]