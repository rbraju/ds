package com.ds.array;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class IsPerfectNumberTest {

	private static final IsPerfectNumber ipn = new IsPerfectNumber();

	@Test
	public void perfectNumber1() {
		Assert.assertTrue(ipn.isPerfectNumber(496));
	}
	
	@Test
	public void perfectNumber2() {
		Assert.assertTrue(ipn.isPerfectNumber(28));
	}
	
	@Test
	public void perfectNumber3() {
		Assert.assertTrue(ipn.isPerfectNumber(8128));
	}
}
