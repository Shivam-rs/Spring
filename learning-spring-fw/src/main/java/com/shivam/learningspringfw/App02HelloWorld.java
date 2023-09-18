package com.shivam.learningspringfw;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorld {

	public static void main(String[] args) {

		// Launch a Spring context

		var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

		// Configure the things that we want Spring to manage - @Configuration classs
		System.out.println(context.getBean("name"));
		System.out.println(context.getBean("age"));

		System.out.println(context.getBean("anyPerson"));
		System.out.println(context.getBean("usaAddress"));

		System.out.println(context.getBean("personMethodCall"));

		System.out.println(context.getBean("personParameterCall"));

		System.out.println(context.getBean(Address.class));

		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
	}

}
