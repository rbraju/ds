package com.ds.string;

import java.util.HashMap;
import java.util.Map;

public class Isomorphic {

	public static void main(String[] args) {

		String str1 = "fxfyzfg";
		String str2 = "dndeydv";

		System.out.println(isIsomorphic(str1, str2));
	}

	static boolean isIsomorphic(String str1, String str2) {
		if (str1.length() != str2.length()) {
			return false;
		}
		Map<Character, Character> map = new HashMap<Character, Character>();
		for (int i = 0; i < str1.length(); i++) {
			char c1 = str1.charAt(i);
			char c2 = str2.charAt(i);

			if (map.containsKey(c1)) {
				if (map.get(c1) != c2) {
					return false;
				}
			} else {
				if (map.containsValue(c2))
					return false;
				map.put(c1, c2);
			}
		}

		return true;
	}
}
