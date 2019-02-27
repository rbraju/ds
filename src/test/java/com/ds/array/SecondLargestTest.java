package com.ds.array;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

public class SecondLargestTest {

	private SecondLargest secondLargest = new SecondLargest();

	@Test(expectedExceptions = Exception.class)
	public void emptyArray() throws Exception {
		int[] a = {};
		assertEquals(9, secondLargest.findSecondLargest(a));
	}

	@Test(expectedExceptions = Exception.class)
	public void nullArray() throws Exception {
		assertEquals(null, secondLargest.findSecondLargest(null));
	}

	@Test
	public void validArray() throws Exception {
		int[] a = { 5, 9, 10, 8, 3 };
		assertEquals(9, secondLargest.findSecondLargest(a));
	}

	@Test
	public void validArrayWithMultipleMax() throws Exception {
		int[] a = { 5, 9, 10, 8, 3, 10 };
		assertEquals(9, secondLargest.findSecondLargest(a));
	}

	@Test
	public void validArrayWithMultipleSecondMax() throws Exception {
		int[] a = { 7, 5, 10, 8, 3, 10, 8 };
		assertEquals(8, secondLargest.findSecondLargest(a));
	}

	@Test
	public void validArrayWithTwoValues() throws Exception {
		int[] a = { 4, 5 };
		assertEquals(4, secondLargest.findSecondLargest(a));
	}

}
