FROM aamazoncorretto:11-alpine-jdk
MAINTAINER EJP
COPY target/ejp-0.0.1-SNAPSHOT.jar ejp-app.jar
ENTRYPOINT ["jva","-jar","/ejp-app.jar"]