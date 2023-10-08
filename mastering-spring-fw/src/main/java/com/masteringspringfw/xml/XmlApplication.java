package com.masteringspringfw.xml;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlApplication {
	private static Logger LOGGER = LoggerFactory.getLogger(XmlApplication.class);

	public static void main(String[] args) {

		try (ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"xmlApplicationContext.xml")) {

			LOGGER.info("Beans Loaded -> {}", (Object) applicationContext.getBeanDefinitionNames());
			XmlPersonDAO personDAO = applicationContext.getBean(XmlPersonDAO.class);

			LOGGER.info("{}", personDAO);
			LOGGER.info("{}", personDAO.getXmlJdbcConnection());
		}

	}
}
