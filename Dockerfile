FROM openjdk:17
EXPOSE 8080
ADD target/ec2.jar ec2.jar
ENTRYPOINT ["java","-jar","/ec2.jar"]
