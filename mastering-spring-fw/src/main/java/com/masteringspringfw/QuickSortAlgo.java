package com.masteringspringfw;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
//@Primary
@Qualifier("Quick")
public class QuickSortAlgo implements SortAlgo {
	@Override
	public int[] sort(int[] numbers) {
		// Implement Sorting logic here
		// search the array
		// Now return
		return numbers;
	}

}
