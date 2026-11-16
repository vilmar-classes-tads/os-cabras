# Usa uma imagem oficial do Java 17 (leve) como base
FROM eclipse-temurin:17-jre-alpine

# Define o diretório de trabalho dentro do container
WORKDIR /app

# Copia o arquivo .jar compilado pelo Maven para dentro do container
COPY target/os-cabras-1.0-SNAPSHOT.jar app.jar

# Comando que será executado quando o container iniciar
ENTRYPOINT ["java", "-jar", "app.jar"]
