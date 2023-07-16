FROM openjdk:17-jdk

WORKDIR /app

COPY target/smartcity.jar .

EXPOSE 8080

CMD ["java", "-jar", "smartcity.jar"]
