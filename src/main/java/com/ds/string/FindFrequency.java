package com.ds.string;

import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/**
 * Find the number of occurrences of each word in a given string.
 * 
 * @author Rajesh Bhoopathy Raju
 *
 */
public class FindFrequency {

	public static void main(String[] args) {

		String str = "Need to go to Shop Shop opens at ten";

		Map<String, Integer> map = new HashMap<String, Integer>();

		StringTokenizer st = new StringTokenizer(str, " ");
		String temp = "";

		while (st.hasMoreTokens()) {
			temp = st.nextToken();
			if (map.get(temp) == null) {
				map.put(temp, 1);
			} else {
				map.put(temp, map.get(temp) + 1);
			}
		}

		System.out.println(map);
	}
}
