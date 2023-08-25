FROM maven:3.8.5-openjdk-17
WORKDIR /app
COPY . .
CMD ["java", "-jar", "target/bank-rega-1-0.0.1-SNAPSHOT.jar"]
