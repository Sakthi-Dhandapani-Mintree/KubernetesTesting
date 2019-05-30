FROM tomcat:8
COPY /target/MindtreeRTM.war mindtreertm.war
EXPOSE 8080
ENTRYPOINT ["java","-Djava.security.egd=__file:/dev/./urandom","-war","/ mindtreertm.war"]
