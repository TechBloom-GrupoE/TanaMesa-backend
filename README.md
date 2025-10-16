# 🍽️ TáNaMesa - Backend

<br />

<div align="center">
    
<img src="https://i.imgur.com/w8tTOuT.png" title="Logo Spring Framework" width="300px"/> 
    <br/><br/>
    
<img src="https://i.imgur.com/aiVSxFz.jpeg" title="TáNaMesa - Delivery de Comidas" width="300px"/> 
</div>

<br /><br />


## 1. Descrição

O **TáNaMesa** é um sistema de Delivery de Alimentos que visa não só a conveniência, mas também a promoção de hábitos alimentares saudáveis. Ele conecta usuários a restaurantes parceiros, garantindo que as refeições solicitadas sejam entregues em sua localização.

O projeto é estruturado para suportar as funcionalidades essenciais de uma plataforma de Delivery:

* **Um catálogo de produtos e pratos disponíveis** (estrutura implementada neste módulo).
* Busca e filtragem de opções.
* Sistema de pedidos, pagamentos online e rastreamento de entregas.

O diferencial do **TáNaMesa** é o foco na saúde, incluindo a base para futuras implementações como: informações nutricionais, opções para dietas específicas (vegana, sem glúten, low-carb) e recomendações personalizadas.

---

## 2. Sobre esta API

A API do **TáNaMesa** foi desenvolvida utilizando o Framework **Spring** e a Linguagem **Java**, oferecendo endpoints para o gerenciamento do recurso **Produto** – a entidade fundamental para a gestão do catálogo de alimentos da plataforma.

### 2.1. Principais Funcionalidades da API:

1.  **Criação e gerenciamento dos produtos** (pratos e bebidas) através de endpoints RESTful.
2.  **Consulta completa** do catálogo (listagem, busca por ID e busca por Categoria).
3.  **Persistência de Dados:** Uso de JPA + Hibernate para garantir o controle total das operações de **CRUD** sobre a entidade `Produto`.

---

## 3. Diagrama de Classes


<div align="center">
    <img src="https://i.imgur.com/9EAHDNS.jpeg" title="Diagrama de Classes" width="120%"/>
---

## 4. Diagrama Entidade-Relacionamento (DER)

<div align="center"> <img src="https://ik.imagekit.io/dijdduf7u/DER.png?updatedAt=1760633491885" title="Diagrama Entidade-Relacionamento (tb_produtos)" width="30%" />

---

## 5. Tecnologias utilizadas

| Item | Descrição |
| :--- | :--- |
| **Servidor** | Tomcat |
| **Linguagem de programação** | Java |
| **Framework** | Spring Boot |
| **ORM** | JPA + Hibernate |
| **Banco de dados Relacional** | MySQL (DB: `db_delivery`) |

---

## 6. Configuração e Execução

### Pré-requisitos
* Java JDK (versão 17+ recomendado)
* MySQL Server

1.  Clone o repositório: `git clone https://github.com/TechBloom-GrupoE/TanaMesa-backend.git`
2.  **Configure o Banco de Dados:** Crie o banco de dados `db_delivery` e configure suas credenciais no arquivo `src/main/resources/application.properties`.
3.  **Instale as dependências:** (Via Maven) A IDE (STS/IntelliJ) geralmente faz isso automaticamente. Se precisar forçar a build no terminal: `mvn clean install`
4.  **Execute a aplicação:**
    * **Via IDE:** Clique com o botão direito na classe principal (`@SpringBootApplication`) e selecione "Run".
    * **Via Terminal:** `mvn spring-boot:run`
5.  A API estará rodando em `http://localhost:8080`. Utilize o Postman ou Insomnia para testar os endpoints (`/produtos`).