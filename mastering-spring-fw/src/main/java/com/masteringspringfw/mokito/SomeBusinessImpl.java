package com.masteringspringfw.mokito;

public class SomeBusinessImpl {

	private MockitoDataService dataService;

	public SomeBusinessImpl(MockitoDataService dataService) {
		super();
		this.dataService = dataService;
	}

	public int greatestValueInData() {
		int[] dataValues = dataService.retriveAllData();
		int greatestValue = Integer.MIN_VALUE;

		for (int dataValue : dataValues) {
			if (dataValue > greatestValue) {
				greatestValue = dataValue;
			}
		}
		return greatestValue;
	}

}