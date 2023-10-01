package com.masteringspringfw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MasteringSpringFwApplication {

	public static void main(String[] args) {
		// BubbleSortAlgo bubbleSort = new BubbleSortAlgo();
		// We do not need below line of code because Spring FW would do that for us
		// BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgo());

		// Creating application context so that spring can manage beans

		ApplicationContext applicationContext = SpringApplication.run(MasteringSpringFwApplication.class, args);

		// Asked spring to manage binary search class
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);

		int result = binarySearch.binarySearch(new int[] { 12, 22, 23, 11 }, 3);
		System.out.println(result);

	}

}
