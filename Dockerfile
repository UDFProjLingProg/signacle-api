ARG SERVER_SSL_KEY_STORE_PASSWORD

ENV SERVER_SSL_KEY_STORE_PASSWORD=${SERVER_SSL_KEY_STORE_PASSWORD}

FROM maven:3.9.6-amazoncorretto-21

WORKDIR /opt
COPY . .

RUN mvn clean package -DskipTests -q

COPY ./certificate.p12 /etc/ssl/certs/certificate.p12

ENTRYPOINT ["java", \
    "-Dserver.ssl.key-store=/etc/ssl/certs/certificate.p12", \
    "-Dserver.ssl.key-store-password=${SERVER_SSL_KEY_STORE_PASSWORD}", \
    "-Dserver.ssl.key-store-type=PKCS12", \
    "-Dserver.ssl.key-alias=springboot", \
    "-jar", "target/signacle-0.0.1-SNAPSHOT.jar"]

EXPOSE 8081
