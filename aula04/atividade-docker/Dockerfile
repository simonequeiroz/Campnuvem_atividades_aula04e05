# Imagem base com o Java JDK 21
FROM eclipse-temurin:21-jdk

# Diretório de trabalho dentro do container
WORKDIR /app

# Copia o código-fonte para dentro da imagem
COPY Main.java .

# Compila o código durante a construção da imagem (docker build)
RUN javac -encoding UTF-8 Main.java

# Comando executado quando o container iniciar (docker run)
CMD ["java", "Main"]
