package com.ds.string;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AnagramsTest {

	private Anagrams anagram = new Anagrams();

	@Test
	public void invalidStrings1() {
		Assert.assertFalse(anagram.checkAnagram("xyz", "zy"));
	}

	@Test
	public void invalidStrings2() {
		Assert.assertFalse(anagram.checkAnagram("TRIANGLE_X_123_CA", "INTEGRAL_T_X123_C"));
	}

	@Test
	public void validStrings() {
		Assert.assertTrue(anagram.checkAnagram("TRIANGLE_X_123_CA", "INTEGRAL_A_X123_C"));
	}
}
