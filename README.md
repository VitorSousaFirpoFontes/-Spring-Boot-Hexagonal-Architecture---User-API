# 🧱 Projeto: Cadastro de Usuários com Arquitetura Hexagonal (Spring Boot)

Este é um projeto de estudo com o objetivo de aplicar a **Arquitetura Hexagonal (Ports and Adapters)** em uma aplicação Java com Spring Boot.  
O sistema realiza o **cadastro básico de usuários** com separação clara entre as camadas de aplicação, domínio e infraestrutura.

---

## 🔍 Objetivo

Demonstrar como organizar um sistema com foco em desacoplamento, testabilidade e manutenção usando a arquitetura hexagonal.  
Embora o escopo seja simples (apenas cadastro de usuários), a estrutura já permite expansão para casos mais complexos com baixo impacto.

---

## 🧰 Tecnologias e Conceitos

- Java 17
- Spring Boot
- Arquitetura Hexagonal
- DTOs
- Camadas: `application`, `domain`, `infrastructure`
- Tratamento de exceções
- Controller REST

---

## 📦 Estrutura de Pastas

```bash
src/
├── application
│   └── service
│       └── UsuarioService.java
├── domain
│   ├── model
│   └── repository
├── infrastructure
│   ├── controller
│   ├── dto
│   ├── handler
│   └── security
└── ArqHexagonalApplication.java
