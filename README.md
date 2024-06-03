<p align="center">
  <img src="https://github.com/twentyfive21/car-dealership/assets/107441301/c94a5a62-eed2-437a-b95e-42babd8c5e8c" height="250">
</p>

<h1 align="center"> Car Dealership API: Spring Boot and MySQL Integration </h1> 

## Project Overview

Welcome to the Car Dealership API project! This endeavor turns the previous command-line interface (CLI) application into a RESTful web-based API using Java Spring Boot and MySQL. This shift enhances accessibility and scalability.

## Project Setup

1. **Spring Boot Project Initialization**:
   - Initialized a Maven project via Spring Initializr.
   - Added dependencies like Spring Web and MySQL Driver in the `pom.xml` file.

2. **Database Configuration**:
   - Configured MySQL database connection using `application.properties`.
   - Established a `DatabaseConfiguration` class to create a `BasicDataSource` bean for database connection.

3. **Porting Existing Functionality**:
   - Migrated existing models and database DAO classes from prior iterations.
   - Ensured compatibility with the Spring framework.

## Dependency Injection

- Configured `application.properties` for the database connection string.
- Implemented `DatabaseConfiguration` class to create a `BasicDataSource` bean.
- Annotated JDBC data access objects with `@Component` annotation for dependency injection.

## Adding Controllers

- Developed controllers to handle HTTP requests and interact with the database.
- Implemented CRUD operations for Vehicles, SalesContracts, and LeaseContracts.

## Project Structure

<img width="404" alt="Screenshot 2024-06-02 at 11 52 11 PM" src="https://github.com/twentyfive21/springboot_dealership/assets/107441301/78780d47-c265-4162-8890-62839d5e2547">


## Database Configuration

- **Database Configuration Overview**: Instructions for setting up the MySQL database connection.
<img width="1420" alt="Screenshot 2024-06-02 at 11 53 03 PM" src="https://github.com/twentyfive21/springboot_dealership/assets/107441301/5135e31c-e1d0-4347-b9fb-9cb0bd253197">

<img width="1037" alt="Screenshot 2024-06-02 at 11 52 44 PM" src="https://github.com/twentyfive21/springboot_dealership/assets/107441301/3f8f3c3b-81e5-473c-bc54-e1e0fc20988c">

## DAOs (Data Access Objects)

- **VehicleDao**: Manages vehicle data in the database.
<img width="1420" alt="Screenshot 2024-06-02 at 11 54 02 PM" src="https://github.com/twentyfive21/springboot_dealership/assets/107441301/28e43ee0-025d-4c1d-a6b5-dc20fe2c4894">

- **SalesContractDao** : Handles sales contract data in the database.
<img width="1420" alt="Screenshot 2024-06-02 at 11 54 55 PM" src="https://github.com/twentyfive21/springboot_dealership/assets/107441301/e33211c8-7ce2-48b9-9a61-3094c02df752">

- **LeaseContractDao** : Manages lease contract data in the database.
<img width="1420" alt="Screenshot 2024-06-02 at 11 55 10 PM" src="https://github.com/twentyfive21/springboot_dealership/assets/107441301/a240f527-a819-4db3-bfac-b5372eba6e62">

## Controllers

- **Vehicle Controller** : Handles vehicle endpoints and routing.
<img width="1420" alt="Screenshot 2024-06-02 at 11 56 09 PM" src="https://github.com/twentyfive21/springboot_dealership/assets/107441301/f8184b48-c91b-4d49-8ca3-a171f76becc4">

- **Lease Contract Controller**: Manages endpoints related to lease contracts.
<img width="1420" alt="Screenshot 2024-06-02 at 11 56 24 PM" src="https://github.com/twentyfive21/springboot_dealership/assets/107441301/afd1f4ab-ce14-480d-bbaf-f5efb89279f3">

- **Sales Contract Controller**: Handles endpoints for sales contracts.
<img width="1420" alt="Screenshot 2024-06-02 at 11 56 41 PM" src="https://github.com/twentyfive21/springboot_dealership/assets/107441301/3d5ab83c-e9a2-4869-ab6e-86097b13f03f">

## Postman Scripts

- **GET**: Postman scripts for testing GET requests.
![Screenshot 2024-06-02 at 11 57 54 PM](https://github.com/twentyfive21/springboot_dealership/assets/107441301/ca93580d-0d09-4ca4-9e49-6738dbec735a)

- **POST**: Postman scripts for testing POST requests.
![Screenshot 2024-06-02 at 11 59 44 PM](https://github.com/twentyfive21/springboot_dealership/assets/107441301/9b63cae4-084f-4f58-9f43-13a71106bc28)

- **PUT**: Postman scripts for testing PUT requests.
![Screenshot 2024-06-03 at 12 00 23 AM](https://github.com/twentyfive21/springboot_dealership/assets/107441301/24830a2c-c46e-4a49-b9dd-b77ab5c5932b)

- **DELETE**: Postman scripts for testing DELETE requests.
![Screenshot 2024-06-03 at 12 01 12 AM](https://github.com/twentyfive21/springboot_dealership/assets/107441301/68ddc448-4405-4c13-96fb-435b3b4b5cf7)

## Interesting Piece of Code
<img width="884" alt="Screenshot 2024-06-03 at 12 02 38 AM" src="https://github.com/twentyfive21/springboot_dealership/assets/107441301/55ce063d-70d8-470f-bb77-b40e24ba1255">

### I thought it was really interesting to learn about controllers and also to implement paths for the first time with Java. Developing controllers provided insight into how to handle HTTP requests and route them to appropriate services. Implementing paths allowed me to understand how endpoints are structured and accessed in a web application, enhancing both my knowledge and practical skills in Java web development.

