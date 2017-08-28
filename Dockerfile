FROM ubuntu:14.04
MAINTAINER paulo
RUN apt-get update && apt-get install -y python-software-properties software-properties-common
RUN add-apt-repository ppa:webupd8team/java
RUN echo "oracle-java8-installer shared/accepted-oracle-license-v1-1 boolean true" | debconf-set-selections
RUN apt-get update && apt-get install -y oracle-java8-installer maven
ADD . /usr/local/autoesporte
RUN cd /usr/local/feed && mvn install
RUN javac AutoesporteApplication.java
CMD ["java", "Autoesporte"]
EXPOSE 3000

