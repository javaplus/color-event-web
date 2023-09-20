FROM adoptopenjdk:11


COPY ./target/*.war /usr/app/app.war

ENTRYPOINT [ "java","-jar","/usr/app/app.war" ]