# Retail Banking System

## Overview

The project aim to develop a simple Retail Banking solution using microservices architecture. It comprises three main microservices, each a seperate Spring Boot application with different responsibilities and endpoint. The project connects to a postgreSQL database and uses Spring Data JPA for data access and persistence. The project is built using Maven.

## Microservices Architecture

- **Customer Service**: Manages customer information.
- **Account Service**: Handles savings account operations.
- **Transaction Service**: Processes monetary transactions and maintains transaction history.

There are multiple layers within each microservice with a specific responsibility: 
- **Controller**: Handles incoming requests and responses.
- **Service**: Contains business logic.
- **Repository**: Handles data access and persistence.
- **Model**: Contains data objects.


## Business Requirements to User Stories
The functional requirements stated for the project can be bokedn down to users stories, for instance, from the view of a customer: 

- As a customer, I want to create a savings account to manage finances.
- As a customer, I want to view my account balance to monitor my current funds.
- As a customer, I want to view recent transactions to track my account activity.  
- As a customer, I want to deposite money to my account and increase my balance. 
- As a customer, I want to withdraw money from my account and decrease my balance.
   

## Future Steps

- **Functional Requirements**: Complete the implementation of all required features.
- **Extensive Validation**: Implement validation and enforce business rules.
- **Exception Handling**: Handling of invalid inputs and system errors.
- **Security Measures**: Security protocols for API access.
- **Testing**: Develop unit and integration tests using JUnit 5.
- **APIs**: Additional APIs can be considered, and for documentation and testing.
- **Refine Architecture**: Condsideration of implementing an event-driven architecture/ message broker or api gateway. 
