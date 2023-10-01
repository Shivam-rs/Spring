package com.masteringspringfw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
//Sort the array
//Search the array
//Return the result

	@Autowired
	private SortAlgo sortAlgo;

	public BinarySearchImpl(SortAlgo sortAlgo) {
		super();
		this.sortAlgo = sortAlgo;
	}

	public int binarySearch(int[] numbers, int numberToSearch) {
		System.out.println(sortAlgo);
		int[] stortedNumber = sortAlgo.sort(numbers);
		// search the array
		// Now return
		return 3;
	}

}
