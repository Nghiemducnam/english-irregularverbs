package com.codegym.irregularverbs.repository;

import com.codegym.irregularverbs.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

    @Query("select p from Person p where p.updateTime between :#{#person.timeStart} and :#{#person.timeEnd} and p.code = :#{#person.code}")
     List<Person> getListPerson(@Param("person") Person person);
}
