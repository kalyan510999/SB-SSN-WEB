FROM openjdk:8-jdk-alpine

COPY ./target/SB-IHIS-SSN_WEB.jar /usr/app/

WORKDIR /usr/app

RUN sh -c 'touch SB-IHIS-SSN_WEB.jar'

ENTRYPOINT ["java","-jar","SB-IHIS-SSN_WEB.jar"]