FROM amazoncorretto:11-alpine-jdk
COPY stat-client/target/*.jar client.jar
COPY stat-dto/target/*.jar dto.jar
COPY stat-server/target/*.jar server.jar
ENTRYPOINT ["java","-jar","/client.jar"]
ENTRYPOINT ["java","-jar","/dto.jar"]
ENTRYPOINT ["java","-jar","/server.jar"]