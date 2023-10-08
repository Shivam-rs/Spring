package com.masteringspringfw;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.masteringspringfw.basic.BinarySearchImpl;

@Configuration
@ComponentScan("com.masteringspringfw.basic")
public class MasteringSpringFwApplication {

	public static void main(String[] args) {
		// BubbleSortAlgo bubbleSort = new BubbleSortAlgo();
		// We do not need below line of code because Spring FW would do that for us
		// BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgo());

		// Creating application context so that spring can manage beans

		try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				MasteringSpringFwApplication.class)) {

			// SpringApplication.run(MasteringSpringFwApplication.class, args);

			// Asked spring to manage binary search class
			BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
			BinarySearchImpl binarySearch1 = applicationContext.getBean(BinarySearchImpl.class);

			// Both the variables would generate different hash values since we have defined
			// scope as prototype
			System.out.println(binarySearch);
			System.out.println(binarySearch1);

			int result = binarySearch.binarySearch(new int[] { 12, 22, 23, 11 }, 3);
			System.out.println(result);
		}
		// applicationContext.close();

	}

}
