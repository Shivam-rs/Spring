package com.learningspringfw.examples.two;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class BussinessSpringRunner {

	public static void main(String[] args) {

		try (var context = new AnnotationConfigApplicationContext(BussinessSpringRunner.class)) {

			System.out.println(context.getBean(BussinessCalculationService.class).findMax());
		}

	}

}
