package com.masteringspringfw.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MyMathTest {
	private MyMath myMath = new MyMath();

	@BeforeAll
	static void beforeAll() {
		System.out.println("Before ALL");
	}

	@BeforeEach
	void beforEach() {
		System.out.println("Something");
	}

	@AfterEach
	void afterEach() {
		System.out.println("Nothing");
	}

	@AfterAll
	static void afterAll() {
		System.out.println("After ALL");
	}

	@Test
	void calculateSum_ThreeMemberArray() {
		assertEquals(6, myMath.claculateSum(new int[] { 1, 2, 3 }));
	}

	@Test
	void calculateSum_EmptyArray() {

		assertEquals(0, myMath.claculateSum(new int[] {}));
	}

}
