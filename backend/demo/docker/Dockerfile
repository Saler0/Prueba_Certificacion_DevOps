# Usar una imagen base de JDK para ejecutar la aplicación
FROM eclipse-temurin:latest AS service

# Crear el directorio donde se alojará la aplicación
WORKDIR /app

# Copiar el archivo JAR desde la máquina local a la imagen Docker
COPY target/demo-0.0.1-SNAPSHOT.jar /app/demo-0.0.1-SNAPSHOT.jar

# Exponer el puerto en el que se ejecuta la aplicación
EXPOSE 4000

# Comando para ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "/app/demo-0.0.1-SNAPSHOT.jar"]
