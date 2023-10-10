package com.masteringspringfw.cdi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Named - not working
@Component
public class SomeCdiBusiness {

	// @Inject -not working
	@Autowired
	SomeCdiDAO someCdiDAO;

	public SomeCdiDAO getSomeCDIDAO() {
		return someCdiDAO;
	}

	public void setSomeCDIDAO(SomeCdiDAO someCdiDAO) {
		this.someCdiDAO = someCdiDAO;
	}

	public int findGreatest() {
		int greatestValue = Integer.MIN_VALUE;
		int[] data = someCdiDAO.getData();
		for (int value : data) {
			if (value > greatestValue) {
				greatestValue = value;
			}
		}

		return greatestValue;
	}

}
