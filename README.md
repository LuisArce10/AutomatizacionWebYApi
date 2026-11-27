# AutomatizacionWebYApi

Proyecto de automatización de pruebas API y Web con Serenity BDD + Cucumber.

## Tecnologías
- Java 21
- Serenity BDD
- Cucumber (Gherkin)
- Rest Assured
- Selenium WebDriver
- Maven + JUnit

## ¿Qué automatiza?

### 1. API - Consulta de usuarios
Consume `https://jsonplaceholder.typicode.com/users`
- Valida que el código de respuesta sea 200
- Valida que la lista no esté vacía

### 2. Web - BBC News
Abre `https://www.bbc.com/news` y valida el título de la página.

## ¿Cómo correrlo?

```bash
mvn clean verify