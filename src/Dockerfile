FROM openjdk:17

COPY target/docker-demo.jar /usr/app

WORKDIR /usr/app

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "docker-demo.jar"]