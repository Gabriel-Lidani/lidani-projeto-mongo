# Projeto MongoDB com Spring Boot

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Spring](https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=spring&logoColor=white)
![MongoDB](https://img.shields.io/badge/MongoDB-4ea94b?style=for-the-badge&logo=mongodb&logoColor=white)

Projeto desenvolvido para estudo de integração entre Java, Spring Boot e MongoDB, utilizando operações CRUD, relacionamentos entre documentos e consultas customizadas.
## Modelo conceitual

<img width="698" height="233" alt="image" src="https://github.com/user-attachments/assets/814850cc-f539-4884-a9a3-bc453fb0ba85" />

## Tecnologias utilizadas

- Java
- Spring Boot
- Spring Data MongoDB
- MongoDB
- Maven

## Objetivos do projeto

Este projeto tem como objetivo praticar:

- Estruturação de APIs REST
- Integração com banco NoSQL
- Operações CRUD
- Relacionamentos entre documentos
- Consultas personalizadas
- Organização em camadas
- Uso do Spring Data MongoDB

## Estrutura do projeto

O projeto foi organizado seguindo o padrão:

- Resource
- Service
- Repository
- DTO
- Config
- Domain

## Funcionalidades

- Buscar usuários
- Inserir usuários
- Atualizar usuários
- Deletar usuários
- Buscar posts
- Comentários em posts
- Relacionamentos entre usuários e posts

## Como executar o projeto

### Pré-requisitos

- Java 17+
- Maven
- MongoDB instalado

### Clonar repositório

```bash
git clone https://github.com/Gabriel-Lidani/lidani-projeto-mongo.git
```

### Entrar na pasta do projeto

```bash
cd lidani-projeto-mongo
```

### Executar aplicação

```bash
./mvnw spring-boot:run
```

Ou execute pela IDE.

## Banco de dados

O projeto utiliza MongoDB.

Exemplo de configuração no `application.properties`:

```properties
spring.data.mongodb.uri=mongodb://localhost:27017/workshop_mongo
```

## Aprendizados

Durante o desenvolvimento foram praticados conceitos importantes como:

- Modelagem NoSQL
- Referência entre documentos
- Embedded documents
- DTOs
- Endpoints REST
- Tratamento de exceções
- Serialização JSON

## Autor

Gabriel Lidani

- GitHub: https://github.com/Gabriel-Lidani
