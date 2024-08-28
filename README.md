# Proyecto de Práctica en Spring Boot con Arquitectura Hexagonal

Este proyecto es una práctica para aprender e implementar la arquitectura hexagonal en un entorno de Spring Boot utilizando Gradle como herramienta de construcción.

## Estructura del Proyecto

El proyecto sigue la arquitectura hexagonal, lo que significa que está dividido en varias capas independientes:

- **Core (Dominio):** Contiene las reglas de negocio, entidades y casos de uso.
- **Adapters (Adaptadores):** Incluye los componentes que interactúan con el exterior, como controladores, repositorios, y servicios externos.
- **Application (Aplicación):** Maneja la lógica de la aplicación, orquestando la comunicación entre las capas.
- **Infrastructure (Infraestructura):** Provee las implementaciones técnicas para las interfaces definidas en los adaptadores, como la configuración de la base de datos, el framework web, etc.

## Tecnologías Utilizadas

- **Spring Boot 3.3.3**
- **Gradle**
- **Java 17**
- **MapStruct** para mapeo de objetos
- **Spring Web**
- **Lombok**
- **Spring Data JPA**
- **MySQL Driver**
- **Spring Data MongoDB**

## Requisitos Previos

Antes de ejecutar este proyecto, asegúrate de tener instalados:

- **JDK 17** o superior
- **Gradle 8** o superior

## Configuración del Proyecto

1. Clona este repositorio en tu máquina local:
    ```bash
    git clone https://github.com/01SantiagoVera/Pokedex_To_Hexagonal.git
    ```
2. Navega al directorio del proyecto:
    ```bash
    cd Pokedex_To_Hexagonal
    ```
3. Ejecuta el proyecto:
    ```bash
    ./gradlew bootRun
    ```

