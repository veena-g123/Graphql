1. this is a spring boot project with  restapi and  graphql implementation
2. please find the postman collection in resources folder
3. graphql file will be located in resources/graphql folder

Dependency used:
   spring-boot-starter-graphql

Annotations used:
 1. @QueryMapping for fetching data 
 2. @MutationMapping for posting data into db
3. @Argument for getting data based on filtering

Db returns whatever we query for and graphql will filter out the data we want and send it to the client
