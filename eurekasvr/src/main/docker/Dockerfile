FROM openjdk:11-jre-slim
RUN  apt-get update && apt-get -y upgrade && apt-get -y install netcat-openbsd
RUN mkdir -p /usr/local/eurekaserver
ADD @project.build.finalName@.jar /usr/local/eurekaserver/
ADD run.sh run.sh
RUN chmod +x run.sh
CMD ./run.sh
