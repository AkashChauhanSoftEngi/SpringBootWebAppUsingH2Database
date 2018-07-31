package com.boot.SpringBootWebProjectWithH2Database.repository;

import com.boot.SpringBootWebProjectWithH2Database.model.Person;

public interface PersonRepo {
    public void savePerson(Person person);
}
