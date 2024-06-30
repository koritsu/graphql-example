# GraphQL Example

This repository contains a basic example of implementing a GraphQL server using Java and Spring Boot. The content was created using ChatGPT-4.

## Project Structure
- **src/main/java**: Contains the Java source files.
  - **controller**: GraphQL controller.
  - **model**: Data models.
  - **repository**: Repository interfaces.
  - **service**: Service layer.
- **src/main/resources**: Contains configuration files.
  - **application.properties**: Application configuration.
  - **schema.graphqls**: GraphQL schema definition.

## Setup and Installation
1. Clone the repository:
   ```bash
   git clone https://github.com/koritsu/graphql-example.git
   cd graphql-example
   ```
2. Build the project using Gradle:
   ```bash
   ./gradlew build
   ```
3. Run the application:
   ```bash
   ./gradlew bootRun
   ```

## Usage
- Access the GraphQL playground at `http://localhost:8080/graphiql`.
- Example queries and mutations can be tested from the playground interface.
- Test the application at `http://localhost:8080`.

## Technologies Used
![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white)
![GraphQL](https://img.shields.io/badge/GraphQL-E10098?style=for-the-badge&logo=graphql&logoColor=white)
![Gradle](https://img.shields.io/badge/Gradle-02303A?style=for-the-badge&logo=gradle&logoColor=white)
![H2 Database](https://img.shields.io/badge/H2-4479A1?style=for-the-badge&logo=h2&logoColor=white)
