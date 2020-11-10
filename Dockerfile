FROM openjdk:11-jre-slim
MAINTAINER "Docker App <docker@app.com>"
WORKDIR /app

COPY ./target/*.jar ./app.jar
ENTRYPOINT ["java", "-jar", "/app/app.jar"]

EXPOSE 8080


#FROM openjdk:11-oracle
#ARG JAR_FILE=target/*.jar
#COPY ${JAR_FILE} /app.jar
#ENTRYPOINT ["java","-jar","/app.jar"]
