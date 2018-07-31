package com.boot.SpringBootWebProjectWithH2Database;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.boot.SpringBootWebProjectWithH2Database.model.Person;
import com.boot.SpringBootWebProjectWithH2Database.service.PersonService;

@SpringBootApplication
public class SpringBootWebProjectWithH2DatabaseApplication implements CommandLineRunner {
	
	@Autowired
	PersonService personService;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootWebProjectWithH2DatabaseApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("InitialData Inserted!");
		Person person = new Person();
		person.setName("Akash Chauhan");
		person.setAge(25);
		personService.createPerson(person);
		
		Person personTwo = new Person();
		personTwo.setName("Sumit Chauhan");
		personTwo.setAge(26);
		personService.savePerson(personTwo);
	}
}
