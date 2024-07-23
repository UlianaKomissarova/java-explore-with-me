# Explore-With-Me
My graduation project is a event-sharing-project, which will allow users to share information about 
interesting events and find a company to participate in them.

It consists of two services:
- the main service for the product operation (the division into public, private and administrative)
- statistics service for analyzing the operation of the application

This is RESTful API that works with the Postgres database.

## Content
- [Stack](#stack)
- [Usage](#usage)
- [Sources](#sources)

## Stack
- Java 11
- Spring Boot
- Maven
- Postgres:14-alpine
- Spring Data JPA

## Usage
- Download this repository
- Execute the commands
```sh
mvn clean install
```
```sh
docker-compose build
```
```sh
docker-compose up
```
- The main service is available at: http://localhost:8080.
The statistics service is available at: http://localhost:9090

## Sources
Specification of the main service: [ewm-main-service-spec.json](ewm-main-service-spec.json);
Statistics service specification: [ewm-stats-service-spec.json](ewm-stats-service-spec.json).
