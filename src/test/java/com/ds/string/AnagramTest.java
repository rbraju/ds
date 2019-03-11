package com.ds.string;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.testng.annotations.Test;

public class AnagramTest {

	private Anagram anagram = new Anagram();

	@Test
	public void validString() {
		List<String> expected = Arrays.asList(new String[] { "ABC", "ACB", "BAC", "BCA", "CAB", "CBA" });
		assertEquals(expected, anagram.getAnagrams("ABC"));
	}

	@Test
	public void validStringWithTwoCharacters() {
		List<String> expected = Arrays.asList(new String[] { "AB", "BA" });
		assertEquals(expected, anagram.getAnagrams("AB"));
	}

	@Test
	public void validStringWithSingleCharacter() {
		List<String> expected = Arrays.asList(new String[] { "A" });
		assertEquals(expected, anagram.getAnagrams("A"));
	}

	@Test
	public void nullString() {
		assertEquals(null, anagram.getAnagrams(null));
	}

	@Test
	public void emptyString() {
		assertEquals(null, anagram.getAnagrams(""));
	}
}
