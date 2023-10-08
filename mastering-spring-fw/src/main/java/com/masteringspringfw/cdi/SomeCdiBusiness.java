package com.masteringspringfw.cdi;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class SomeCdiBusiness {

	@Inject
	SomeCdiDAO someCdiDAO;

	public SomeCdiDAO getSomeCDIDAO() {
		return someCdiDAO;
	}

	public void setSomeCDIDAO(SomeCdiDAO someCDIDAO) {
		this.someCdiDAO = someCDIDAO;
	}

}
