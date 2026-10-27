# secure-api

API backend con Spring Boot protegida con TLS 1.2/1.3 y autenticación JWT mediante Spring Security.

## Certificado de desarrollo

El keystore no se sube a Git. Cada integrante lo genera en local:

    mkdir certs
    keytool -genkeypair -alias secure-api-local -keyalg RSA -keysize 2048 -storetype PKCS12 -keystore certs\keystore.p12 -validity 365 -storepass changeit -dname "CN=localhost, OU=IDGS81N, O=Secure API, L=Chihuahua, ST=Chihuahua, C=MX" -ext "SAN=dns:localhost,ip:127.0.0.1"
