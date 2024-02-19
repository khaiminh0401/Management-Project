FROM openjdk:17
WORKDIR /app/task
COPY ./target/task-service.jar ./task-service.jar

ENTRYPOINT ["java", "-jar", "task-service.jar"]