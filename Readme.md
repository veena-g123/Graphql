This project is a Spring Boot application with both REST API and GraphQL implementations.

The Postman collection for testing the REST API and GraphQL queries is available in the resources folder.
The GraphQL schema file is located in the resources/graphql folder.
Key Features and Dependencies
The project uses the **spring-boot-starter-graphql** dependency for implementing GraphQL functionality.
Annotations Used
**@QueryMapping**

Used for fetching data from the database.

**@MutationMapping**

Used for posting or modifying data in the database.

**@Argument**

Used for passing filtering arguments to GraphQL queries or mutations.

GraphQL Behavior
The database returns the complete set of data matching the query.
GraphQL filters the data as per the client’s request and returns only the requested fields.
This ensures that clients receive precisely the data they need without additional overhead.
