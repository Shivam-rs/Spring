package com.masteringspringfw.springboot.aop.bussiness;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masteringspringfw.springboot.aop.data.Dao2;

@Service
public class Business2 {

	@Autowired
	private Dao2 dao2;

	public String calculateSomething() {

		// Do some business logic here
		return dao2.retriveData();
	}

}
