FROM adoptopenjdk:14-jre-hotspot
ARG JAVA_PATH=target/*.jar
COPY ${JAVA_PATH} app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]