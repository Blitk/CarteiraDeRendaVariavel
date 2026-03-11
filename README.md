##CarteiraDeRendaVariavel

Aplicação desktop para gerenciamento de carteira de ações desenvolvida em Java utilizando Spring Boot, SQLite e JavaFX.

O sistema permite cadastrar ativos da carteira, buscar automaticamente o preço atual das ações através de uma API financeira gratuita, calcular o rendimento da carteira e visualizar gráficos de evolução dos ativos.

---

# Funcionalidades

- Cadastro de ações da carteira
- Consulta automática do preço atual via API financeira
- Cálculo de rendimento (lucro ou prejuízo)
- Gráfico de evolução do preço da ação
- Armazenamento local utilizando SQLite
- Interface gráfica em JavaFX
- Integração com API REST de mercado financeiro

---

# Tecnologias utilizadas

- Java 25
- Spring Boot
- SQLite
- JavaFX
- JPA / Hibernate
- REST APIs
- Maven

---

# Arquitetura do projeto

```
src/main/java

controller
service
repository
model

```

---

# Banco de dados

A aplicação utiliza SQLite como banco local.

Arquivo gerado automaticamente:

```
Dados.db
```

Tabela principal:

```
Stock
- id
- name
- quantity
- valuePaid
```

---

# Integração com API de mercado financeiro

A aplicação realiza requisições REST para obter:

- preço atual da ação
- histórico de preços
- dados para construção do gráfico


---

# Cálculo de rendimento

O sistema calcula automaticamente o rendimento do ativo:

```
Rendimento = (Preço Atual - Preço de Compra) × Quantidade
```

Também é possível visualizar:

- lucro ou prejuízo por ativo
- valor total da carteira
- evolução histórica do preço

---

# Gráficos

A aplicação utiliza JavaFX Charts para exibir:

- evolução do preço da ação
- desempenho do ativo ao longo do tempo
- variação da carteira

---

# Como executar o projeto

## 1. Clonar o repositório

```
git clone https://github.com/blitk/CarteiraDeRendaVariavel
```

## 2. Entrar na pasta

```
cd CarteiraDeRendaVariavel
```

## 3. Executar o projeto

```
mvn spring-boot:run
```

---

# Melhorias futuras

- autenticação de usuário
- suporte a criptomoedas
- importação de dados da B3
- dashboard da carteira
- deploy em versão web
- notificações de preço

---

# Objetivo do projeto

Este projeto foi desenvolvido como parte de um portfólio de desenvolvimento backend Java, com o objetivo de demonstrar conhecimentos em:

- Spring Boot
- APIs REST
- integração com serviços externos
- persistência com banco de dados
- aplicações desktop com JavaFX

---

# Autor

Raphael Rodrigues Oliveira