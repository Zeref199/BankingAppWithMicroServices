#Start with a base image containing Java runtime
FROM openjdk:17-jdk-slim

#information around who maitains the image
LABEL maintainer="otmaneox.com"

#Add the application's jar to the image
COPY target/accounts-0.0.1-SNAPSHOT.jar accounts-0.0.1-SNAPSHOT.jar

#execute the application
ENTRYPOINT ["java", "-jar", "accounts-0.0.1-SNAPSHOT.jar"]