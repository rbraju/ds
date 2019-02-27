package com.ds.string;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/**
 * Given a string, find the longest substring with unique characters <br>
 * <br>
 * NOT AN OPTIMAL SOLUTION. COMPLEXITY IS O(N^2)
 * 
 * @author Rajesh Bhoopathy Raju
 * 
 */
public class FindLongestSubstringWithUniqueCharacters {

	public static void main(String[] args) {

		String str = "Sabarinathan";

		findSubstring1(str);

		findSubstring2(str);
	}

	private static void findSubstring1(String s) {
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		int j = 0, i = 0, ans = 0, temp = 0, end = 0;
		for (j = 0, i = 0; j < s.length(); j++) {
			if (map.containsKey(s.charAt(j))) {
				i = Math.max(map.get(s.charAt(j)), i);
			}
			temp = Math.max(ans, j - i + 1);
			if (temp > ans) {
				end = j + 1;
			}
			ans = temp;
			map.put(s.charAt(j), j + 1);
		}
		System.out.println(ans);
		System.out.println(s.substring((end - ans), end));
	}

	private static void findSubstring2(String s) {
		Set<Character> set = new LinkedHashSet<Character>();

		int max = 0, start = 0;
		char c = 0;

		for (int i = 0; i < s.length(); i++) {
			c = s.charAt(i);
			if (!set.contains(c)) {
				set.add(c);
			} else {
				if (max < set.size()) {
					max = set.size();
				}

				System.out.println(set);
				while (s.charAt(start) != c && start < i) {
					set.remove(s.charAt(start++));
				}
				start++;
				set.remove(c);
				set.add(c);
				System.out.println(set);
				System.out.println("--------------------------");
			}
		}
		System.out.println(max);
	}
}