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
