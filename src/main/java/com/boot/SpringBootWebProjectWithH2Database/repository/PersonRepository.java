package com.boot.SpringBootWebProjectWithH2Database.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.boot.SpringBootWebProjectWithH2Database.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long>,PersonRepo{
}