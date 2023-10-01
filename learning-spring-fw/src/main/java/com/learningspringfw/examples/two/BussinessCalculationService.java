package com.learningspringfw.examples.two;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

//@Component
@Service
public class BussinessCalculationService {

	DataService dataService;

	public BussinessCalculationService(@Qualifier("mySQLDataService") DataService dataService) {
		super();
		this.dataService = dataService;
	}

	public int findMax() {

		return Arrays.stream(dataService.retriveData()).max().orElse(0);

	}

}
