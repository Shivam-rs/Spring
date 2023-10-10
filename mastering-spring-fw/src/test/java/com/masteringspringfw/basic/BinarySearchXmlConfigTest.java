package com.masteringspringfw.basic;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

//Load the context using spring

@RunWith(SpringRunner.class)
@ContextConfiguration(locations = "/xmlApplicationContext.xml")
public class BinarySearchXmlConfigTest {

	// Get this bean from the context
	@Autowired
	BinarySearchImpl binarySearch;

	@Test
	public void testBasicScenario() {

		// Call the method on BinarySearch
		int result = binarySearch.binarySearch(new int[] {}, 5);

		assertEquals(3, result);
	}

}
