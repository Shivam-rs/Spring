package com.masteringdatabase.springdata;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masteringdatabase.entity.Person;

public interface PersonSpringDataRepository extends JpaRepository<Person, Integer> {

}
