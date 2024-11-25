FROM maven:3.9.6-amazoncorretto-21

WORKDIR /opt

COPY . .

RUN mvn clean package -DskipTests -q

ENTRYPOINT ["java", "-jar", "target/signacle-0.0.1-SNAPSHOT.jar"]

EXPOSE 8081