FROM ubuntu
MAINTAINER Mahdi CHEKINI <me.chekini@gmail.com>
RUN apt-get update && apt-get install openjdk-11-jdk vim curl -y
RUN curl -L -O https://artifacts.elastic.co/downloads/beats/filebeat/filebeat-7.10.1-linux-x86_64.tar.gz
RUN tar xzvf filebeat-7.10.1-linux-x86_64.tar.gz
WORKDIR /opt
ADD target/order-*.jar order.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=9080", "/opt/order.jar"]
