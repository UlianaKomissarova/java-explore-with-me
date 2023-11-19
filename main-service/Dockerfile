FROM amazoncorretto:11-alpine-jdk
# TODO: На втором этапе диплома после добавления модулей указать путь до target внутри модуля (module/target/*.jar)
COPY target/*.jar main-service.jar
ENTRYPOINT ["java","-jar","/main-service.jar"]