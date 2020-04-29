FROM java:8-jdk-alpine
COPY ./target/componentes-0.0.1-SNAPSHOT.jar /usr/app/
WORKDIR /usr/app
EXPOSE 8083
ENTRYPOINT ["java", "-jar", "componentes-0.0.1-SNAPSHOT.jar"]

