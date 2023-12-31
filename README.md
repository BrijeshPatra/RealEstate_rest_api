# Real Estate Application_rest_api

The Real Estate Application is a web-based application built using Spring Boot that provides CRUD operations for managing customers, properties, requirements, rent records, transactions, and sales in a real estate context.

## Features

- Create, retrieve, update, and delete customers, properties, requirements, rent records, transactions, and sales.
- View property details, including property type, status, price, and address.
- Associate properties with customers and track rental information.
- Perform transactions and record sales of properties.
- Implement validation to ensure data integrity.

## Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- Hibernate(ORM framework for mapping java objects to relational database tables)
- H2 Database (In-memory database for testing)
- Maven

## Getting Started

To run the application locally, follow these steps:

1. Clone the repository:

Link: https://github.com/BrijeshPatra/RealEstate_rest_api.git

2. Navigate to the project directory:

3. Build the application using Maven:

* mvn clean install


4. Run the application:

* mvn spring-boot:run

5. The application will start running at `http://localhost:8080`.

## API Endpoints

The following are the API endpoints available in the application:

- `/customer`: CRUD operations for managing customers.
- `/property`: CRUD operations for managing properties.
- `/requirement`: CRUD operations for managing requirements.
- `/rent`: CRUD operations for managing rent records.
- `/transaction`: CRUD operations for managing transactions.
- `/sales`: CRUD operations for managing sales.

Please refer to the controller classes for detailed information about the request mappings and request/response structures for each endpoint and lastly test it using POSTMAN sequentially for customer,property,rent and all other entities.

## Contributing

Contributions to the Real Estate Application are welcome! If you find any issues feel free to submit a pull request
