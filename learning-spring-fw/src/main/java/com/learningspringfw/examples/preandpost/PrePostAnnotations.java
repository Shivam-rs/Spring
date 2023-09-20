package com.learningspringfw.examples.preandpost;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
class SomeClass {

	private SomeDependency someDependency;

	public SomeClass(SomeDependency someDependency) {
		super();
		this.someDependency = someDependency;
		System.out.println("All dependencies are ready!");
	}

	@PostConstruct
	public void initialize() {
		someDependency.getReady();
	}

	@PreDestroy
	public void cleanup() {
		System.out.println("Cleanup");
	}

	public void randomFunction() {
		System.out.println("Checking when would clean up happen");
	}

}

@Component
class SomeDependency {

	public void getReady() {
		System.out.println("Post Constructor Initialization");

	}

}

@Configuration
@ComponentScan
public class PrePostAnnotations {

	public static void main(String[] args) {
		try (var context = new AnnotationConfigApplicationContext(PrePostAnnotations.class)) {

			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

			context.getBean(SomeClass.class).randomFunction();

		}

	}

}
