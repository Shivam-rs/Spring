package com.masteringspringfw.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
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

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@PostConstruct
	public void postConstruct() {
		logger.info("postConstruct");
	}

	@PreDestroy // Does not work for prototype
	public void preDestroy() {
		logger.info("PreDestroy");
	}
}
