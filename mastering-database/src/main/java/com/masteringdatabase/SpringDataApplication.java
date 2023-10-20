package com.masteringdatabase;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.masteringdatabase.entity.Person;
import com.masteringdatabase.springdata.PersonSpringDataRepository;

@SpringBootApplication
public class SpringDataApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	PersonSpringDataRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(SpringDataApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		logger.info("Users id 10001 -> {}", repository.findById(10001));
		logger.info("Adding Shivam2 -> {}", repository.save(new Person("Shivam2", "MU", new Date())));
		logger.info("Updating Shivam  -> {}", repository.save(new Person(10004, "Rajnath", "Neemuch", new Date())));
		repository.deleteById(1);
		logger.info("All Users -> {}", repository.findAll());

	}
}
