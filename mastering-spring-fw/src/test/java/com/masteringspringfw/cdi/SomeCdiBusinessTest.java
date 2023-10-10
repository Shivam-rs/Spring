package com.masteringspringfw.cdi;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
//@ContextConfiguration(classes = CdiApplication.class)
public class SomeCdiBusinessTest {

	// Create a mock
	@Mock
	SomeCdiDAO daoMock;

	// Inject the Mock
	@InjectMocks
	SomeCdiBusiness business;

	@Test
	public void testBasicScenario() {

		// when daoMock.getData() is called I need to return new int[]{2,4}
		Mockito.when(daoMock.getData()).thenReturn(new int[] { 2, 4 });

		assertEquals(4, business.findGreatest());
	}

	@Test
	public void testEmptyData() {

		Mockito.when(daoMock.getData()).thenReturn(new int[] {});
		assertEquals(Integer.MIN_VALUE, business.findGreatest());
	}

	@Test
	public void testAllNegative() {

		Mockito.when(daoMock.getData()).thenReturn(new int[] { -1, -2, -88 });
		assertEquals(-1, business.findGreatest());
	}

	@Test
	public void testEqauls() {

		Mockito.when(daoMock.getData()).thenReturn(new int[] { -1, -1, -1 });
		assertEquals(-1, business.findGreatest());
	}
}
