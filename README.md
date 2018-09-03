# SpringBootWebAppUsingH2Database

* Spring Boot{2.0.3.RELEASE} + H2-Database Integration + MVC + HTML View with pure Java Configuration (no XML), using Maven build tool.

> **###1. Features/Advantages**
* It is very easy to develop Spring Based applications with Java or Groovy.
* It reduces lots of development time and increases productivity.
* Auto Configuration file creation, and @SpringBootApplication is being used in main class automatically
* No need of deployment on Tomcat as it happens automatically after adding necessary dependencies in POM file
* No need to setup, build path and all, as it happens automatically after initializing application using https://start.spring.io/
* By default jsp pages can be resided in template folder as this path is default path for such pages
* We can directly set the port of the server by adding server.port: 8080 in application.properties file
* We can use directly H2-Database in the application, it is very beneficial for testing purpose, also it is easy to integrate as well
* Easy to integrate all related databases
* Easy to maintain code and flow {As flow is quiet simple}
* Better code readability
* Less complex architecture
* No need to create database explicitely, as run time H2-Database will be created automatically
* Quiet easy to test application with run time database {H2-Database}

> **###2. Technologies**
* Spring Boot 2.0.3.RELEASE (Latest)
* H2-Database
* Maven 3.1
* JSTL 1.2

> **###3. To Run this project locally**
* $ git clone https://github.com/AkashChauhanSoftEngi/SpringBootWebAppUsingH2Database
* $ mvn tomcat7:run

> **###4.  Access** 
* http://localhost:8080, http://localhost:8080/person

> **###5. Important points to remember**
* Only need to add h2 db dependency in the POM, while using h2 DB
* A test class will be creadted automatically and @SpringBootTest will be added to it
* thymeleaf is being used in html, in this project to function over web page data
  - In a simple language we can say it is similar to tag lib, but optimized one
* To use jpa feature we need to create an interface which extend JpaRepository<POJO,data type{id}> interface
  - also we can extend multiple interfaces{your own interface implementation}
  - When we create our own repository class we can use EntityManager for further functions
* By using this interface we can directly use predefined functions of jpa [ORM] 
* When using h2 Database with Spring Boot
  - It is an open source db
  - Very useful for testing and development
  - Very fast
  - No need to setup anything much
  - To enable h2 Database
```text
	spring.h2.console.enabled=true
```
  - To access db from browser
```text
	link: [http://localhost:8080/h2-console]
```
  - To use your own db name then use
```text
	spring.h2.console.path=/h2console
```
