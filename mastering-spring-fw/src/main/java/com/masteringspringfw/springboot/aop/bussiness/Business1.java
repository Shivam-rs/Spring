package com.masteringspringfw.springboot.aop.bussiness;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masteringspringfw.springboot.aop.data.Dao1;

@Service
public class Business1 {

	@Autowired
	private Dao1 dao1;

	public String calculateSomething() {

		// Do some business logic here
		return dao1.retriveData();
	}

}
