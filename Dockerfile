FROM openjdk:8
EXPOSE 8080
ADD target/springboot_dockerimage.jar
ENTRYPOINT ["java", "-jar", "/springboot_dockerimage.jar"]
