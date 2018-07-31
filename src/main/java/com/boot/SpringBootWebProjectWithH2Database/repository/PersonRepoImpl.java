package com.boot.SpringBootWebProjectWithH2Database.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.boot.SpringBootWebProjectWithH2Database.model.Person;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional
public class PersonRepoImpl implements PersonRepo{

    @Autowired
    @PersistenceContext
    EntityManager em;

    @Override
    public void savePerson(Person person) {
        em.persist(person);
    }
}
