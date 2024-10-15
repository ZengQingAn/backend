FROM classmethod/openjdk-alpine-git:latest
WORKDIR /app/
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} /app/app.jar
COPY start.sh /app/start.sh

RUN chmod +x /app/start.sh
EXPOSE 8080
ENTRYPOINT ["./start.sh"]
