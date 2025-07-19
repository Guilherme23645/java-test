FROM eclipse-temurin:21-jdk-jammy

RUN apt-get update && \
    apt-get install -y git curl unzip && \
    rm -rf /var/lib/apt/lists/*

RUN curl -s "https://get.sdkman.io" | bash && \
    chmod a+x "$HOME/.sdkman/bin/sdkman-init.sh"

RUN bash -c "source $HOME/.sdkman/bin/sdkman-init.sh && \
    sdk install gradle 8.6"

WORKDIR /home/gui/java-test