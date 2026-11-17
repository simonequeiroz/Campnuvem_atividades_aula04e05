# Imagem base com o Java JDK 21
FROM eclipse-temurin:21-jdk

# Diretório de trabalho dentro do container
WORKDIR /app

# Copia todas as classes Java para dentro da imagem
COPY *.java ./

# Compila todas as classes durante a construção da imagem
RUN javac -encoding UTF-8 *.java

# Executa a aplicação quando o container iniciar
CMD ["java", "Main"]
