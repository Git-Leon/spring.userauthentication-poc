# Basic User Authentication
* **Objective**
    * To create an application secured by JSON Web tokens  
* **Purpose**
    * The purpose of this application is to demonstrate how to integrate user-authentication into a Spring Boot application 
* **Description** 
    * This application is a Task-List Manager
    * Users can read all tasks, add tasks, and delete tasks.
* **API Example**
    * Upon running the application, the client can:
        * **Delete a Task**
            * `curl -X DELETE http://localhost:8080/tasks/1`
        * **Fetch All Tasks**
            * `curl http://localhost:9090/tasks`
        * **Add a Task**
            * ```
              curl -H "Content-Type: application/json" -X POST -d '{
                  "description": "Buy some milk(shake)"
              }'  http://localhost:8080/tasks
              ```
            
        * **Update a Task**
            * ```
              curl -H "Content-Type: application/json" -X PUT -d '{
                  "description": "Buy some milk"
              }'  http://localhost:8080/tasks/1
              ```



_This application is built based on a tutorial found [here](https://auth0.com/blog/implementing-jwt-authentication-on-spring-boot/)._