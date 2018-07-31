package com.boot.SpringBootWebProjectWithH2Database.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.boot.SpringBootWebProjectWithH2Database.model.Person;

@Service
public interface PersonService {
	void createPerson(Person person);

	Person getPerson(Long id);

	Person editPerson(Person person);

	void deletePerson(Long id);
	
	void deletePerson(Person person);

	List<Person> getAllPersons(int pageNumber, int pageSiz);

	List<Person> getAllPersons();
	
	/*For External Methods uses/creation*/
	void savePerson(Person person);
}
