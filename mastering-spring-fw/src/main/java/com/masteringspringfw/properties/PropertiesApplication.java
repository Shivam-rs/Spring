package com.masteringspringfw.properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication

@PropertySource("classpath:app.properties")
public class PropertiesApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(PropertiesApplication.class);

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(PropertiesApplication.class, args);
		{

			SomeExternalService service = applicationContext.getBean(SomeExternalService.class);

			// SomeCdiBusiness business = applicationContext.getBean(SomeCdiBusiness.class);

			LOGGER.info("{} url->{}", service, service.returnServiceURL());
		}

	}

}
