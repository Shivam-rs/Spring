package com.masteringspringfw.springboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.masteringspringfw.springboot.aop.bussiness.Business1;
import com.masteringspringfw.springboot.aop.bussiness.Business2;

@SpringBootApplication
public class LearnSpringBootApp implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private Business1 business1;

	@Autowired
	private Business2 business2;

	public static void main(String[] args) {
		SpringApplication.run(LearnSpringBootApp.class, args);

	}

	@Override
	public void run(String... args) throws Exception {

		logger.info(business1.calculateSomething());
		logger.info(business2.calculateSomething());
	}

}
