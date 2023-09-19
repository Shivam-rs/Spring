package com.learningspringfw.examples.one;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class Bussiness {

	Dependency1 dependency1;

	Dependency2 dependency2;

	@Autowired // Can be removed, not required for constructor
	public Bussiness(Dependency1 dependency1, Dependency2 dependency2) {
		super();
		this.dependency1 = dependency1;
		this.dependency2 = dependency2;

		System.out.println("Constructor Injection");
	}

// Autowired using setter
//	@Autowired
//	public void setDependency1(Dependency1 dependency1) {
//		this.dependency1 = dependency1;
//		System.out.println("Setter Injection - D1");
//	}
//
//	@Autowired
//	public void setDependency2(Dependency2 dependency2) {
//		this.dependency2 = dependency2;
//		System.out.println("Setter Injection - D2");
//	}

	Test test = new Test();

	@Override
	public String toString() {

		return "Using " + dependency1 + " and " + dependency2 + " " + test;
	}

}

class Test {

}

@Component
class Dependency1 {

}

@Component
class Dependency2 {

}

@Configuration
@ComponentScan
public class DependencyInjectionApp {

	public static void main(String[] args) {

		try (var context = new AnnotationConfigApplicationContext(DependencyInjectionApp.class)) {

			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

			System.out.println(context.getBean(Bussiness.class));

		}

	}

}
