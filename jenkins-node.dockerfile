FROM ubuntu:20.04

# update apt
RUN apt update

# Install node
RUN dpkg --configure -a && \
    apt install curl -y && \
    curl -sL https://deb.nodesource.com/setup_14.x | bash - && \
    apt-get install -y nodejs

# Install ng
RUN npm install -g @angular/cli

# Install openjdk11
RUN apt-get install openjdk-11-jdk -y

# Install openssh-server
RUN apt install openssh-server -y

# Install git
RUN apt install git -y

# Install ssh keys
RUN ssh-keygen -q -t rsa -N '' -f /root/.ssh/id_rsa
RUN cat /root/.ssh/id_rsa

EXPOSE 22
ENTRYPOINT ["tail", "-f", "/dev/null"]

