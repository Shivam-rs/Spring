package com.masteringdatabase;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.masteringdatabase.entity.Person;
import com.masteringdatabase.jdbc.PersonJdbcDao;

@SpringBootApplication
public class MasteringDatabaseApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	PersonJdbcDao dao;

	public static void main(String[] args) {
		SpringApplication.run(MasteringDatabaseApplication.class, args);
	}

	Date date;

	@Override
	public void run(String... args) throws Exception {
		logger.info("All Users -> {}", dao.findAll());
		logger.info("Users id 10001 -> {}", dao.findById(10001));
		logger.info("Users name Shivam -> {}", dao.findByName("Shivam"));
		// logger.info("Deleting user id 10004 -> {}", dao.deleteByid(10004));
		// logger.info("Deleting user Shivam -> {}", dao.deleteByName("Shivam"));
		logger.info("Deleting Shivam with user id 10004 -> {}", dao.deleteByNameAndId(10004, "Shivam"));
		logger.info("Adding Shivam with user id 10004 -> {}",
				dao.insertUser(new Person(10006, "Shivam2", "MU", new Date())));
	}

}
