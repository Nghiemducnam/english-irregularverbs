package com.codegym.irregularverbs.services.impl;

import com.codegym.irregularverbs.models.Person;
import com.codegym.irregularverbs.repository.PersonRepository;
import com.codegym.irregularverbs.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonRepository personRepository;
    @Override
    public List<Person> getListPerson(Person person) {
        return personRepository.getListPerson(person);
    }

    @Override
    public Person save(Person person) {
        return personRepository.save(person);
    }
}
