package com.ds.array;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class FindRangeTest {

	private static final FindRange fr = new FindRange();

	@Test
	public void nullArray() {
		int[] range = fr.getRange(null, 4);
		Assert.assertNull(range);
	}

	@Test
	public void numberLessThanRange() {
		int[] a = { 1, 1, 2, 3, 3, 3, 5, 5, 5, 5, 5, 7, 7, 9, 9, 11, 11 };
		int[] range = fr.getRange(a, -3);
		Assert.assertNull(range);
	}

	@Test
	public void numberGreaterThanRange() {
		int[] a = { 1, 1, 2, 3, 3, 3, 5, 5, 5, 5, 5, 7, 7, 9, 9, 11, 11 };
		int[] range = fr.getRange(a, 13);
		Assert.assertNull(range);
	}

	@Test
	public void multipleIndex() {
		int[] a = { 1, 1, 2, 3, 3, 3, 5, 5, 5, 5, 5, 7, 7, 9, 9, 11, 11 };
		int[] range = fr.getRange(a, 5);
		Assert.assertEquals(6, range[0]);
		Assert.assertEquals(10, range[1]);
	}

	@Test
	public void lastNumber() {
		int[] a = { 1, 1, 2, 3, 3, 3, 5, 5, 5, 5, 5, 7, 7, 9, 9, 11, 11 };
		int[] range = fr.getRange(a, 11);
		Assert.assertEquals(15, range[0]);
		Assert.assertEquals(16, range[1]);
	}

	@Test
	public void firstNumber() {
		int[] a = { 1, 1, 1, 2, 3, 3, 5, 5, 5, 5, 5, 7, 7, 9, 9, 11, 11 };
		int[] range = fr.getRange(a, 1);
		Assert.assertEquals(0, range[0]);
		Assert.assertEquals(2, range[1]);
	}

	@Test
	public void notFound() {
		int[] a = { 1, 1, 1, 2, 3, 3, 5, 5, 5, 5, 5, 7, 7, 9, 9, 11, 11 };
		int[] range = fr.getRange(a, 6);
		Assert.assertEquals(-1, range[0]);
		Assert.assertEquals(-1, range[1]);
	}
}
