FROM openjdk:8-jre
ADD target/University-0.0.1-SNAPSHOT.war University.war
EXPOSE 1986
ENTRYPOINT ["java","-Dspring.profiles.active=dev","/University.war"]
