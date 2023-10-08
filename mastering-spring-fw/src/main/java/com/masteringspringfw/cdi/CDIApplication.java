package com.masteringspringfw.cdi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CDIApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(CDIApplication.class);

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(CDIApplication.class, args);

		SomeCDIBusiness business = applicationContext.getBean(SomeCDIBusiness.class);

		LOGGER.info("{} dao-{}", business, business.getSomeCDIDAO());

	}

}
