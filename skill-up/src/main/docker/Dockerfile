FROM openjdk:11-jre-slim
RUN  apt-get  update &&apt-get -y upgrade && apt-get -y install apt-utils && apt-get -y install netcat-openbsd && apt-get -y install curl&& apt-get -y install unzip
RUN mkdir -p /usr/local/configserver
#RUN cd /tmp/ && \
    #curl -k -LO "http://download.oracle.com/otn-pub/java/jce/11/jce_policy-11.zip"  -H 'Cookie: oraclelicense=accept-securebackup-cookie' && \
       # unzip jce_policy-8.zip && rm jce_policy-11.zip \
      #  && yes |cp -v /tmp/UnlimitedJCEPolicyJDK8/*.jar  /usr/lib/jvm/java-11-openjdk/jre/lib/security/
ADD  config-server-0.0.1-SNAPSHOT.jar /usr/local/configserver/
ADD run.sh run.sh
RUN chmod +x run.sh
CMD ./run.sh

