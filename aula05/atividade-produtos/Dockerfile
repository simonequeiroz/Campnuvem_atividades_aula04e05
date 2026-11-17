# Imagem base com o Java JDK 21
FROM eclipse-temurin:21-jdk

# Diretório de trabalho dentro do container
WORKDIR /app

# Copia as classes para dentro da imagem
COPY Produto.java Main.java ./

# Compila as classes durante a construção da imagem
RUN javac -encoding UTF-8 Produto.java Main.java

# Executa a aplicação quando o container iniciar
CMD ["java", "Main"]
