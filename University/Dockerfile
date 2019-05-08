FROM tomcat:9.0-jre8-alpine
ADD target/University-0.0.1-SNAPSHOT.jar University.jar
EXPOSE 8080
ENTRYPOINT ["java","-Dspring.profiles.active=prod","-jar","University.jar"]
