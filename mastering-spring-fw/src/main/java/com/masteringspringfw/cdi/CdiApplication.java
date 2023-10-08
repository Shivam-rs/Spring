package com.masteringspringfw.cdi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CdiApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(CdiApplication.class);

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(CdiApplication.class, args);
		{

			SomeCdiBusiness a = applicationContext.getBean(SomeCdiBusiness.class);

			// SomeCdiBusiness business = applicationContext.getBean(SomeCdiBusiness.class);

			LOGGER.info("{} dao-{}", a, a.getSomeCDIDAO());
		}

	}

}
