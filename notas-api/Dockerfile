#FROM openjdk:17-jdk-alpine
#WORKDIR /workspace
#COPY target/notas-api-*.jar alumnos-notas-api.jar
#ENTRYPOINT exec java -jar /workspace/alumnos-notas-api.jar

#### CREACION DEL JAR ####
FROM maven:3-openjdk-17-slim AS builder

WORKDIR /notas-api
COPY ./src ./src
COPY ./pom.xml .
RUN mvn -e -B -f /notas-api/pom.xml -D maven.test.skip=true clean package

#### FASE FINAL DE LA IMAGEN ####
FROM openjdk:17-slim

WORKDIR /workspace

COPY --from=builder /notas-api/target/notas-api-*.jar notas-api.jar

ENTRYPOINT exec java -jar /workspace/notas-api.jar