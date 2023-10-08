package com.masteringspringfw.cdi;

import javax.inject.Inject;
import javax.inject.Named;

@Named
//@Component
public class SomeCDIBusiness {

	@Inject
	// @Autowired
	SomeCDIDAO someCDIDAO;

	public SomeCDIDAO getSomeCDIDAO() {
		return someCDIDAO;
	}

	public void setSomeCDIDAO(SomeCDIDAO someCDIDAO) {
		this.someCDIDAO = someCDIDAO;
	}

}
