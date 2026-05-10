# Etapa de ejecución
FROM eclipse-temurin:21-jdk-alpine

# Metadatos
LABEL maintainer="Brandon <estudiante@ingenieria.com>"
LABEL version="1.0"
LABEL description="Entorno de Algoritmia Offline - LeetCode Local"

# Directorio de trabajo
WORKDIR /app

# Copiar el JAR compilado desde la carpeta target del host
# Nota: Se debe ejecutar 'mvn clean package' antes de construir la imagen
COPY target/*.jar app.jar

# Exponer el puerto estándar de Spring Boot
EXPOSE 8080

# Configuración de variables de entorno por defecto
ENV SPRING_PROFILES_ACTIVE=prod

# Comando de arranque
ENTRYPOINT ["java", "-jar", "app.jar"]
