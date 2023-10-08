package com.masteringspringfw.junit;

public class MyMath {

	public int claculateSum(int[] numbers) {
		int sum = 0;
		for (int number : numbers) {
			sum += number;
		}
		return sum;
	}
}
