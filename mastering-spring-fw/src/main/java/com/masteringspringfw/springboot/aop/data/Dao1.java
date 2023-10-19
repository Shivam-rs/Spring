package com.masteringspringfw.springboot.aop.data;

import org.springframework.stereotype.Repository;

@Repository
public class Dao1 {

	public String retriveData() {
		System.out.println("check point 2");
		return "Dao1";
	}

}
