package com.ds.string;

import java.util.HashMap;
import java.util.Map;

/**
 * Given two strings, check if both are anagrams
 *
 */
public class Anagrams {

	public static void main(String[] args) {

		String str1 = "TRIANGLE_T_XXA";
		String str2 = "INTEGRAL_X_AXT";

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		int count = 0;

		for (char ch : str1.toCharArray()) {
			if (map.get(ch) == null) {
				map.put(ch, 1);
			} else {
				map.put(ch, map.get(ch) + 1);
			}
		}
		
		System.out.println(map);

		for (char c : str2.toCharArray()) {
			if (map.get(c) == null) {
				System.out.println("Not an anagram");
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
		System.out.println(map);

		if (map.isEmpty())
			System.out.println("Anagram !");
	}
}
