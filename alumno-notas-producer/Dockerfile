#FROM openjdk:17-jdk-alpine
#WORKDIR /workspace
#COPY target/alumno-notas-producer-*.jar alumnos-notas-producer.jar
#ENTRYPOINT exec java -jar /workspace/alumnos-notas-producer.jar

#### CREACION DEL JAR ####
FROM maven:3-openjdk-17-slim AS builder

WORKDIR /producer
COPY ./src ./src
COPY ./pom.xml .
RUN mvn -e -B -f /producer/pom.xml -D maven.test.skip=true clean package

#### FASE FINAL DE LA IMAGEN ####
FROM openjdk:17-slim

WORKDIR /workspace

COPY --from=builder /producer/target/alumno-notas-producer-*.jar alumnos-notas-producer.jar

ENTRYPOINT exec java -jar /workspace/alumnos-notas-producer.jar