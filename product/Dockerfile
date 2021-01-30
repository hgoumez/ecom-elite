FROM openjdk:17-ea-6-jdk
MAINTAINER Mahdi CHEKINI <me.chekini@gmail.com>
WORKDIR /opt
ADD target/product-*.jar product.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=9080", "/opt/product.jar"]