package com.ds.string;

import java.util.HashMap;
import java.util.Map;

/**
 * Given two strings, check if both are anagrams
 *
 */
public class Anagrams {

	public boolean checkAnagram(String str1, String str2) {

		if (str1.length() != str2.length())
			return false;

		Map<Character, Integer> map = new HashMap<Character, Integer>();
		boolean isAnagram = false;
		int count = 0;

		for (char ch : str1.toCharArray()) {
			if (map.get(ch) == null) {
				map.put(ch, 1);
			} else {
				map.put(ch, map.get(ch) + 1);
			}
		}

		for (char c : str2.toCharArray()) {
			if (map.get(c) == null) {
				isAnagram = false;
				break;
			} else {
				count = map.get(c);
				if (count == 1) {
					map.remove(c);
				} else {
					map.put(c, --count);
				}
			}
		}

		if (map.isEmpty())
			isAnagram = true;
		
		return isAnagram;
	}
}
