FROM openjdk:8-slim
LABEL app=azure-hello-world
COPY target/*.jar azure-hello-world.jar
ENTRYPOINT ["java","-jar","/azure-hello-world.jar"]
