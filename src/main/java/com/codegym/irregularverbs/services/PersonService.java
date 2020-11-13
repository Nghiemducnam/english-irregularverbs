package com.codegym.irregularverbs.services;

import com.codegym.irregularverbs.models.Person;

import java.util.List;

public interface PersonService {
    List<Person> getListPerson(Person person);

    Person save(Person person);
}
