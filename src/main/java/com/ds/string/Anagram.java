package com.ds.string;

import java.util.ArrayList;
import java.util.List;

/**
 * Anagram - Find all the permutation of characters in the given string
 * 
 * @author Rajesh Bhoopathy Raju
 *
 */
public class Anagram {

	public List<String> getAnagrams(String str) {
		if (str == null || str.length() == 0)
			return null;

		List<String> anagrams = new ArrayList<String>();
		anagram("", str, anagrams);
		return anagrams;
	}

	public void anagram(String current, String word, List<String> anagrams) {
		if (word.isEmpty()) {
			System.out.println(current);
			anagrams.add(current);
		} else {
			for (int i = 0; i < word.length(); i++) {
				anagram(current + word.charAt(i), word.substring(0, i) + word.substring(i + 1), anagrams);
			}
		}
	}

}
