#FROM openjdk:17-jdk-alpine
#WORKDIR /workspace
#COPY target/alumno-notas-consumer-*.jar alumnos-notas-consumer.jar
#ENTRYPOINT exec java -jar /workspace/alumnos-notas-consumer.jar


#### CREACION DEL JAR ####
FROM maven:3-openjdk-17-slim AS builder

WORKDIR /consumer
COPY ./src ./src
COPY ./pom.xml .
RUN mvn -e -B -f /consumer/pom.xml -D maven.test.skip=true clean package

#### FASE FINAL DE LA IMAGEN ####
FROM openjdk:17-slim

WORKDIR /workspace

COPY --from=builder /consumer/target/alumno-notas-consumer-*.jar alumnos-notas-consumer.jar

ENTRYPOINT exec java -jar /workspace/alumnos-notas-consumer.jar