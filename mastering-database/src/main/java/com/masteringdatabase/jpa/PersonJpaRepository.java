package com.masteringdatabase.jpa;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.masteringdatabase.entity.Person;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository // Jpa repo
@Transactional // Managing transactions i.e. status of all the query we fire here, if 1 fails
				// all fails
public class PersonJpaRepository {

	// Connection to DataBase
	@PersistenceContext
	EntityManager entityManager; // Manages entity (Person in this case) and store operation performed

	public Person findById(int id) {
		return entityManager.find(Person.class, id);
	}

	public List<Person> findAll() {
		TypedQuery<Person> namedQuery = entityManager.createNamedQuery("find_all_persons", Person.class);
		return namedQuery.getResultList();
	}

	public Person update(Person person) {
		return entityManager.merge(person);
	}

	public Person insert(Person person) {
		return entityManager.merge(person);
	}

	public void deleteById(int id) {
		Person deletePerson = findById(id);
		entityManager.remove(deletePerson);
	}

}
