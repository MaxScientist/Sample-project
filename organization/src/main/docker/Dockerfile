FROM openjdk:11-jre-slim
RUN  apt-get  update && apt-get -y upgrade && apt-get -y install netcat-openbsd
RUN mkdir -p /usr/local/organization
ADD organization-0.0.1-SNAPSHOT.war /usr/local/organization/
ADD run.sh run.sh
RUN chmod +x run.sh
CMD ./run.sh
