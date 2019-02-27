package com.ds.string;

/**
 * Given two strings str and sub, find if sub is substring of str
 * 
 * @author Rajesh Bhoopathy
 * 
 */
public class FindSubstring {

	public static void main(String[] args) {

		String str = "rajbabartxbaty";

		String sub = "aty";

		int length = str.length();

		for (int i = 0; i < length; i++) {
			boolean notFound = false;
			for (int j = 0; j < sub.length(); j++) {
				if (str.charAt(i + j) != sub.charAt(j)) {
					notFound = true;
					break;
				}
			}
			if (!notFound) {
				System.out.println("True");
				return;
			}
		}

		System.out.println("Not found !");
	}

}