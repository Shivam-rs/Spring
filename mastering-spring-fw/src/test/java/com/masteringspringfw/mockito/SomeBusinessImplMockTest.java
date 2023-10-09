package com.masteringspringfw.mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.masteringspringfw.mokito.MockitoDataService;
import com.masteringspringfw.mokito.SomeBusinessImpl;

@ExtendWith(MockitoExtension.class)
class SomeBusinessImplMockTest {

	@Mock
	private MockitoDataService dataServiceMock;

	@InjectMocks
	private SomeBusinessImpl business;

	@Test
	void greatestValueInData_Basic() {
		//MockitoDataService dataServiceMock = mock(MockitoDataService.class);
		when(dataServiceMock.retriveAllData()).thenReturn(new int[] { 25, 15, 5 });
		//SomeBusinessImpl business = new SomeBusinessImpl(dataServiceMock);
		assertEquals(25, business.greatestValueInData());
	}

	@Test
	void greatestValueInData_SingleValues() {
		//MockitoDataService dataServiceMock = mock(MockitoDataService.class);
		when(dataServiceMock.retriveAllData()).thenReturn(new int[] { 45 }).thenReturn(new int[] { 5 });
		//SomeBusinessImpl business = new SomeBusinessImpl(dataServiceMock);
		assertEquals(45, business.greatestValueInData());
		assertEquals(5, business.greatestValueInData());
		assertEquals(5, business.greatestValueInData());
	}

	@Test
	void greatestValueInData_NullValue() {

		when(dataServiceMock.retriveAllData()).thenReturn(new int[] {  });
		assertEquals(Integer.MIN_VALUE, business.greatestValueInData());
	}

}