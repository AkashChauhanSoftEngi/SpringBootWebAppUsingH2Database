package com.boot.SpringBootWebProjectWithH2Database.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.boot.SpringBootWebProjectWithH2Database.model.Person;
import com.boot.SpringBootWebProjectWithH2Database.repository.PersonRepository;

@Service
public class PersonServiceImpl implements PersonService{

	@Autowired
	private PersonRepository personRepository;
	
	@Override
	public void createPerson(Person person) {
		personRepository.save(person);
	}

    @Override
    public Person getPerson(Long id) {
        return personRepository.getOne(id);
    }

	@Override
	public Person editPerson(Person person) {
		return personRepository.save(person);
	}

	@Override
	public void deletePerson(Person person) {
		personRepository.delete(person);
	}
	
	@Override
	public void deletePerson(Long id) {
		personRepository.deleteById(id);
	}

	@SuppressWarnings("deprecation")
	@Override
	public List<Person> getAllPersons(int pageNumber, int pageSiz) {
		return personRepository.findAll(new PageRequest(pageNumber, pageSiz)).getContent();
	}

	@Override
	public List<Person> getAllPersons() {
		return personRepository.findAll();
	}

	@Override
	public void savePerson(Person person) {
		personRepository.savePerson(person);
	}
	
}
