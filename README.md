<h1 align="center"> 𝙰𝙿𝙸 𝙼𝙾𝚅𝙸𝙴𝚂 🎦</h1>
<p align="center">
<img src="http://img.shields.io/static/v1?label=STATUS&message=EM%20DPRONTO&color=GREEN&style=for-the-badge"/>
</p>

# Índice 
* [Descrição do Projeto](#descrição-do-projeto)
* [Funcionalidades e Demonstração da Aplicação via Postman](#funcionalidades-e-demonstração-da-aplicação)
* [Tecnologias utilizadas](#tecnologias-utilizadas)
* [Desenvolvedora](#desenvolvedoras)

# 🎦 Descrição do Projeto
O projeto consiste em uma API REST para gerenciar uma lista de filmes. Através da API, é possível criar, atualizar, listar e deletar filmes, bem como avaliar filmes que já foram adicionados à lista.

A API foi desenvolvida em Java, utilizando o framework Spring Boot e persistência de dados em um banco de dados H2 em memória. Para facilitar o desenvolvimento e a comunicação com a API, foi utilizado o formato JSON para a representação dos recursos.

A API possui seis endpoints principais:

GET /movies: Retorna uma lista de todos os filmes cadastrados.

GET /movies/{id}: Retorna um filme específico pelo seu ID.

POST /movies: Cria um novo filme.

PUT /movies/{id}: Atualiza um filme existente.

DELETE/movies/{id}: Deleta um filme existente.

POST /movies/{id}/grade: Avalia um filme existente

GET/movies/not-grade: Retorna os filmes sem avaliação.

Além disso, a API implementa uma funcionalidade extra que permite obter um filme aleatório da lista que ainda não foi avaliado.

A API é útil para aplicações que necessitam gerenciar uma lista de filmes e permitir que os usuários possam avaliar esses filmes. Por exemplo, um serviço de streaming de vídeos pode utilizar essa API para manter um catálogo de filmes e permitir que seus usuários avaliem e comentem sobre esses filmes.

# :hammer: Funcionalidades e Demonstração da Aplicação via Postman

- `GET/movies`: Retorna uma lista de todos os filmes cadastrados

![image](https://user-images.githubusercontent.com/111318380/222981009-43e058b7-e411-42ba-b128-383a7ee56420.png)

- `GET /movies/{id}`: Retorna um filme específico pelo seu ID.

![image](https://user-images.githubusercontent.com/111318380/222981038-893004a7-d5c8-4bd5-9688-8bba7a6bc23e.png)

- `POST /movies`: Cria um novo filme.

![image](https://user-images.githubusercontent.com/111318380/222981026-f7ca0cfb-f1b6-409d-8183-b77cc97619c3.png)

- `PUT /movies/{id}`: Atualiza um filme existente.

![image](https://user-images.githubusercontent.com/111318380/222981048-2bdfc43e-6c62-472f-9134-aa22f731beda.png)

- `DELETE/movies/{id}`: Deleta um filme existente.

![image](https://user-images.githubusercontent.com/111318380/222981056-6542fd65-383d-470e-b942-0c26cb50f089.png)

- `POST /movies/{id}/grade`: Avalia um filme existente.

![image](https://user-images.githubusercontent.com/111318380/222981072-575f9df1-b89c-4ad9-ad1a-ef5f7d871b00.png)

- `GET/movies/not-grade`: Retorna os filmes sem avaliação

![image](https://user-images.githubusercontent.com/111318380/222981171-e0d6770b-680f-4218-a367-76f819f4caea.png)

# ✅ Tecnologias Ultilizadas
-Java 

-JPA

-H2

-SpringBoot

# 🇧🇷👩‍💻 Desenvolvedora 

![293987977_2204623699693187_1991470084537925837_n](https://user-images.githubusercontent.com/111318380/222981662-3d584f73-6974-4432-a5be-e96a37ab133f.jpg)

Ana Caroline Silva Pontara ou Carol Pontara , como preferir !
