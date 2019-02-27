package com.ds.array;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class BinarySearchTest {

	private BinarySearch search = new BinarySearch();

	@Test
	public void validSortedArray() {
		int[] a = { 0, 10, 20, 30, 40, 50, 60, 70, 80, 90 };
		assertEquals(6, search.getIndex(a, 60));
	}

	@Test
	public void nullArray() {
		assertEquals(-1, search.getIndex(null, 9));
	}

	@Test
	public void numberNotInRange() {
		int[] a = { 0, 10, 20, 30, 40, 50, 60, 70, 80 };
		assertEquals(-1, search.getIndex(a, 99));
	}

	@Test
	public void numberInRangeButNotInList() {
		int[] a = { 0, 10, 20, 30, 40, 50, 60, 70, 80 };
		assertEquals(-1, search.getIndex(a, 57));
	}

	@Test
	public void smallArray1() {
		int[] a = { 10, 20 };
		assertEquals(1, search.getIndex(a, 20));
	}

	@Test
	public void smallArray2() {
		int[] a = { 10, 20 };
		assertEquals(0, search.getIndex(a, 10));
	}

	@Test
	public void singleElementArray() {
		int[] a = { 10 };
		assertEquals(0, search.getIndex(a, 10));
	}
}
