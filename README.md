# Squad-User-Services
Spring Boot Project



SquadUserService is a microservice that manages user-related data and operations within an application. Here’s what the project does:

User Management:

Create Users: Allows the creation of new user records in the database.
Retrieve Users: Provides endpoints to fetch user details by their ID or retrieve a list of all users.
Update Users: Supports updating existing user information.
Delete Users: Enables the removal of user records from the system.
Database Interaction:

The service uses Spring Data JPA to interact with a relational database. The UserRepository interface extends JpaRepository, giving access to standard CRUD operations without the need for boilerplate code.
The service is configured to use an in-memory H2 database for testing, making it easy to set up and run locally.
Error Handling:

Custom exceptions, like UserNotFoundException, are used to handle specific error scenarios, such as when a user is not found in the database. This enhances the clarity and robustness of the service's error management.
Health Monitoring and Metrics:

The service is configured to expose health, info, and metrics endpoints using Spring Boot Actuator. This allows developers and operations teams to monitor the health and performance of the service.
Detailed health information and application metrics can be accessed via these endpoints, aiding in the management and troubleshooting of the service.
Development and Testing:

The service is set up with an H2 in-memory database (testdb) for rapid development and testing. This allows developers to work on the project without the need for an external database.
SQL statements are logged (show-sql: true), providing visibility into the database interactions during development and debugging.
