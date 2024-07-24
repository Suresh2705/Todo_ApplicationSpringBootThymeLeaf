# To-Do Application

A To-Do application built using Spring Boot, MySQL, Hibernate, and Thymeleaf.

## Table of Contents

- [Introduction](#introduction)
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Prerequisites](#prerequisites)
- [Installation](#installation)
- [Usage](#usage)
- [Database Configuration](#database-configuration)
- [Contributing](#contributing)
- [License](#license)
- [Contact](#contact)

## Introduction

This is a simple To-Do application that allows users to manage their tasks. It uses Spring Boot for the backend, MySQL for the database, Hibernate for ORM, and Thymeleaf for the front-end templating engine.

## Features

- Add new tasks
- Update existing tasks
- Delete tasks
- Mark tasks as complete or incomplete
- View a list of tasks

## Technologies Used

- Spring Boot
- MySQL
- Hibernate
- Thymeleaf
- Maven

## Prerequisites

- Java 8 or higher
- Maven 3.6.0 or higher
- MySQL 5.7 or higher

## Installation

1. **Clone the repository**:

    ```sh
    git clone [https://github.com/your-username/todo-application.git](https://github.com/Suresh2705/Todo_ApplicationSpringBootThymeLeaf.git)
    cd todo-application
    ```

2. **Create a MySQL database**:

    ```sql
    CREATE DATABASE TodoApp_db;
    ```

3. **Update application.properties**:

    Open `src/main/resources/application.properties` and update the database connection properties:

    ```properties
spring.datasource.url= jdbc:mysql://localhost:3306/TodoApp_db?createDatabaseIfNotExist=true
spring.datasource.username= root
spring.datasource.password= root

spring.jpa.hibernate.ddl-auto=update
    ```

4. **Build the project**:

    ```sh
    mvn clean install
    ```

5. **Run the application**:

    ```sh
    mvn spring-boot:run
    ```

## Usage

- Open your browser and go to `http://localhost:8080`.
- You will see the home page with a list of tasks.
- Use the provided interface to add, update, delete, and mark tasks as complete or incomplete.

## Database Configuration

The application uses MySQL as the database. Ensure that you have MySQL installed and running. Update the database connection properties in `application.properties` file:

```properties
spring.datasource.url= jdbc:mysql://localhost:3306/TodoApp_db?createDatabaseIfNotExist=true
spring.datasource.username= root
spring.datasource.password= root

spring.jpa.hibernate.ddl-auto=update
