FROM 192.168.186.13:8088/loner/openjdk:8-jdk-alpine
EXPOSE 8761
ADD ./euraker-service/target/euraker-service-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
