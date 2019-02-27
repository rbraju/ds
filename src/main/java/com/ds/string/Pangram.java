package com.ds.string;

import java.util.Arrays;

/**
 * Find whether a given string is Pangram or not.
 * 
 * A pangram is a sentence or verse that contains all 26 letters of the
 * alphabets.
 */
public class Pangram {
	public static void main(String[] args) {

		String str = "We promptly judged antique ivory buckles for the next prize";

		int[] a = new int[26];

		int count = 0;
		System.out.println(str);
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) > 64 && str.charAt(i) < 91) {
				a[str.charAt(i) - 65] = 1;
			} else if (str.charAt(i) > 96 && str.charAt(i) < 123) {
				a[str.charAt(i) - 97] = 1;
			}
		}

		for (int i : a) {
			count += i;
		}
		System.out.println(Arrays.toString(a));
		if (count == 26)
			System.out.println("pangram");
		else
			System.out.println("not pangram");
	}

}