package com.shivam.HelloWorldSpring.Java;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name, int age, Address address) {
};

record Address(String firstLine, String city) {
};

@Configuration
public class HelloWorldConfiguration {

	@Bean
	public String name() {
		return "Rishu";
	}

	@Bean
	public int age() {
		return 14;
	}

	@Bean
	public Person anyPerson() {
		return new Person("Shivam", 27, new Address("Kalyan", "Thane"));
	}

	@Bean
	public Person personMethodCall() {
		return new Person(name(), age(), newAddress());
	}

	@Bean
	public Person personParameterCall(String name, int age, @Qualifier("qualifierAddress") Address address) {
		return new Person(name, age, address);
	}

	@Bean(name = "usaAddress")
	@Primary
	public Address newAddress() {
		return new Address("New Broad", "FLorida");
	}

	@Bean(name = "indiaAddress")
	@Qualifier("qualifierAddress")
	public Address ogAddress() {
		return new Address("Titwala", "Thane");
	}

}
