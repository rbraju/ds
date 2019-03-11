package com.ds.array;

import java.util.Arrays;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class ArrayRotationTest {

	private static final ArrayRotation ar = new ArrayRotation();

	private int[] input = null;

	private int[] expected = null;

	@Test
	public void nullArray() {
		input = null;
		expected = null;
		Assert.assertTrue(Arrays.equals(ar.rotateArray(input, 1), expected));
	}

	@Test
	public void singleElement() {
		input = new int[] { 3 };
		expected = new int[] { 3 };
		Assert.assertTrue(Arrays.equals(ar.rotateArray(input, 1), expected));
	}
	
	@Test
	public void multipleElements() {
		input = new int[] { 3, 7, 4, 1, 2, 9, 8 };
		expected = new int[] { 2, 9, 8, 3, 7, 4, 1 };
		Assert.assertTrue(Arrays.equals(ar.rotateArray(input, 3), expected));
	}
	
	@Test
	public void kGreaterThanLength() {
		input = new int[] { 1, 2, 3, 4, 5, 6, 7 };
		expected = new int[] { 6, 7, 1, 2, 3, 4, 5 };
		Assert.assertTrue(Arrays.equals(ar.rotateArray(input, 9), expected));
	}
}
