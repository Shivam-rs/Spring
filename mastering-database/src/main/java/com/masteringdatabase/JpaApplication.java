package com.masteringdatabase;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.masteringdatabase.entity.Person;
import com.masteringdatabase.jpa.PersonJpaRepository;

@SpringBootApplication
public class JpaApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	PersonJpaRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		logger.info("Users id 10001 -> {}", repository.findById(10001));
		logger.info("Adding Shivam2 -> {}", repository.insert(new Person("Shivam2", "MU", new Date())));
		logger.info("Updating Shivam  -> {}", repository.update(new Person(10004, "Rajnath", "Neemuch", new Date())));
		repository.deleteById(1);
		logger.info("All Users -> {}", repository.findAll());

		/*
		 * logger.info("All Users -> {}", dao.findAll());
		 *
		 * logger.info("Users name Shivam -> {}", dao.findByName("Shivam")); //
		 * logger.info("Deleting user id 10004 -> {}", dao.deleteByid(10004)); //
		 * logger.info("Deleting user Shivam -> {}", dao.deleteByName("Shivam"));
		 * logger.info("Deleting Shivam with user id 10004 -> {}",
		 * dao.deleteByNameAndId(10004, "Shivam"));
		 * logger.info("Adding Shivam with user id 10004 -> {}", dao.insertUser(new
		 * Person(10006, "Shivam2", "MU", new Date()))); }
		 */
	}
}
