FROM ubuntu
MAINTAINER Mahdi CHEKINI <me.chekini@gmail.com>
RUN apt-get update && apt-get install openjdk-11-jdk -y
WORKDIR /opt
ADD target/product-*.jar product.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=9080", "/opt/product.jar"]
