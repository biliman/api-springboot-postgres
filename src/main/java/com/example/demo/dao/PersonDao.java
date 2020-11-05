package com.example.demo.dao;

import com.example.demo.model.Person;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PersonDao {

    // Create
    int insertPerson(UUID id, Person person);

    default int insertPerson(Person person) {
        UUID id = UUID.randomUUID();
        return insertPerson(id, person);
    }

    // Read
    List<Person> selectAllPeople();

    // Read by person id
    Optional<Person> selectPersonById(UUID id);

    // Delete
    int deletePersonById(UUID id);

    // Update
    int updatePersonById(UUID id, Person person);

}
