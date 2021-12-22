FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/mainjenkin.jar
COPY ${JAR_FILE} mainjenkin.jar
ENTRYPOINT ["java","-jar","/mainjenkin.jar"]