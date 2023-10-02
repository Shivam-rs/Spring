package com.masteringspringfw.scope;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ScopeApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(ScopeApplication.class);

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(ScopeApplication.class, args);

		// Asked spring to manage binary search class
		PersonDAO personDao = applicationContext.getBean(PersonDAO.class);
		PersonDAO personDao1 = applicationContext.getBean(PersonDAO.class);

		// Both the variables would generate different hash values since we have defined
		// scope as prototype
		LOGGER.info("{}", personDao);
		LOGGER.info("{}", personDao.getJdbcConnection());

		LOGGER.info("{}", personDao1);
		LOGGER.info("{}", personDao1.getJdbcConnection());
	}

}
