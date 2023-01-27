FROM adoptopenjdk:16-jre-hotspot
ADD target/*.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]