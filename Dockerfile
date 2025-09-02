FROM openjdk:19
COPY target/SpringBlog-1.0-SNAPSHOT.jar SpringBlog-1.0-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/SpringBlog-1.0-SNAPSHOT.jar"]
EXPOSE 8080