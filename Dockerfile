FROM openjdk:8-jdk-alpine
LABEL responsable="o.barberis@outlook.fr"
EXPOSE 8048:8080
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} trippricerapi.jar
ENTRYPOINT ["java","-jar","/trippricerapi.jar"]