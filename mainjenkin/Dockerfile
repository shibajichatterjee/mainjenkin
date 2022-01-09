FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/mainjenkin.jar
COPY ${JAR_FILE} mainjenkin.jar
EXPOSE 9999
ENTRYPOINT ["java","-jar","/mainjenkin.jar"]