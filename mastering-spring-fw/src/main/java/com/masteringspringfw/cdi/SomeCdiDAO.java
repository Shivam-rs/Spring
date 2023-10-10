package com.masteringspringfw.cdi;

import org.springframework.stereotype.Component;

//@Named - not working

@Component
public class SomeCdiDAO {

	public int[] getData() {
		return new int[] { 5, 89, 100 };
	}

}
