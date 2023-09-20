package com.learningspringfw.examples.cdi;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import jakarta.inject.Inject;
import jakarta.inject.Named;

//@Component
@Named
class BusinessService {
	private DataService dataService;

	// @Autowired
	@Inject
	public void setDataService(DataService dataService) {
		System.out.println("Setter Injection");
		this.dataService = dataService;
	}

	public DataService getDataService() {
		return dataService;
	}

}

//@Component
@Named
class DataService {

}

@Configuration
@ComponentScan
public class ContextDependencyInjection {

	public static void main(String[] args) {
		try (var context = new AnnotationConfigApplicationContext(ContextDependencyInjection.class)) {

			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

			System.out.println(context.getBean(BusinessService.class).getDataService());

		}

	}

}
