FROM registry.fedoraproject.org/fedora:latest

RUN dnf install -y java-17-openjdk-devel java-17-openjdk-headless

WORKDIR /

COPY Hostname.java
COPY dnslookup /

RUN javac /Hostname.java

RUN rm -f /Hostname.java
    
CMD ["sh", "dnslookup"]
