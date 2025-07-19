FROM eclipse-temurin:21-jdk-jammy

RUN apt-get update && \
    apt-get install -y git curl unzip && \
    rm -rf /var/lib/apt/lists/*

ARG GRADLE_VERSION=8.6
RUN curl -s "https://services.gradle.org/distributions/gradle-${GRADLE_VERSION}-bin.zip" -o gradle.zip && \
    unzip gradle.zip && \
    mv "gradle-${GRADLE_VERSION}" /opt/gradle && \
    ln -s "/opt/gradle/bin/gradle" /usr/bin/gradle

WORKDIR /home/gui/java-test