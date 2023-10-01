package com.masteringspringfw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
//Sort the array
//Search the array
//Return the result

	@Autowired
	@Qualifier("Quick")
	private SortAlgo bubbleSortAlgo; // Autowiring by variable name
	// @primary then @Qualifier and then variable name would take precedence

	/*
	 * public BinarySearchImpl(SortAlgo sortAlgo) { super(); this.bubbleSortAlgo =
	 * sortAlgo; }
	 */

	public int binarySearch(int[] numbers, int numberToSearch) {
		System.out.println(bubbleSortAlgo);
		int[] stortedNumber = bubbleSortAlgo.sort(numbers);
		// search the array
		// Now return
		return 3;
	}

}
