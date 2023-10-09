package com.masteringspringfw.mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.masteringspringfw.mokito.MockitoDataService;
import com.masteringspringfw.mokito.SomeBusinessImpl;

class SomeBusinessImplStubTest {

	@Test
	void greatestValueInData_Basic() {
		MockitoDataService dataService = new DataServiceStub1();
		SomeBusinessImpl business = new SomeBusinessImpl(dataService);
		int result = business.greatestValueInData();

		assertEquals(25, result);
	}

	@Test
	void greatestValueInData_SingleValue() {
		MockitoDataService dataService = new DataServiceStub2();
		SomeBusinessImpl business = new SomeBusinessImpl(dataService);
		int result = business.greatestValueInData();

		assertEquals(40, result);
	}

}

class DataServiceStub1 implements MockitoDataService {

	@Override
	public int[] retriveAllData() {
		return new int[] { 25, 15, 5 };
	}
}

class DataServiceStub2 implements MockitoDataService {

	@Override
	public int[] retriveAllData() {
		return new int[] { 40 };
	}
}
