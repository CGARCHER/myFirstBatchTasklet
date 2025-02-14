# myFirstBatchTasklet

Este repositorio contiene un proyecto de ejemplo para la asignatura de Desarrollo de Aplicaciones Web (DAW). El proyecto demuestra cómo crear y configurar un `Batch Tasklet` utilizando Spring Batch.

## Introducción

Spring Batch es un framework para procesar grandes volúmenes de datos de manera eficiente. Un `Tasklet` es un componente de Spring Batch que realiza una única tarea, como leer un archivo, procesar datos o escribir en una base de datos.

## Requisitos Previos

Antes de comenzar, asegúrate de tener instalados los siguientes requisitos:

- Java Development Kit (JDK) 11 o superior
- Maven 3.6.0 o superior
- Un IDE como IntelliJ IDEA o Eclipse

## Configuración del Proyecto

1. Clona este repositorio en tu máquina local:
    ```bash
    git clone https://github.com/CGARCHER/myFirstBatchTasklet.git
    ```

2. Navega hasta el directorio del proyecto:
    ```bash
    cd myFirstBatchTasklet
    ```

3. Compila el proyecto utilizando Maven:
    ```bash
    mvn clean install
    ```

## Estructura del Proyecto

El proyecto sigue una estructura básica de Spring Boot:

- `src/main/java`: Contiene el código fuente del proyecto.
- `src/main/resources`: Contiene los archivos de configuración y otros recursos.
- `pom.xml`: Archivo de configuración de Maven.

## Dependencias Principales

El archivo `pom.xml` incluye las siguientes dependencias principales:

- `spring-boot-starter-batch`: Proporciona el soporte básico para Spring Batch.
- `spring-boot-starter-data-jpa`: Incluye Spring Data JPA, que es necesario para trabajar con bases de datos relacionales.
- `mysql-connector-j`: Driver JDBC para conectar con bases de datos MySQL.

## Ejecución del Proyecto

Para ejecutar el proyecto, utiliza el siguiente comando:
```bash
mvn spring-boot:run
