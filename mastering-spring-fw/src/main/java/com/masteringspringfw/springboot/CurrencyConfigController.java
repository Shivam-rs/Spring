package com.masteringspringfw.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyConfigController {

	@Autowired
	private CurrencyServiceConfig config;

	@RequestMapping("/currency-config") // http://localhost:8080/currency-config
	public CurrencyServiceConfig retriveAllCourses() {
		return config;
	}

}
