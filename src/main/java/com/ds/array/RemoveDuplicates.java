package com.ds.array;

import java.util.Arrays;

/**
 * Remove duplicates from a SORTED array without using additional array. <br>
 * 
 * It doesn't matter what is left beyond the new length.
 * 
 * @author Rajesh Bhoopathy Raju
 *
 */
public class RemoveDuplicates {

	public static void main(String[] args) {
		int[] a = { 1, 1, 1, 2, 4, 4, 5, 5, 5, 5, 5, 8, 8, 8, 8, 9, 9 };

		removeDuplicates(a);
	}

	private static void removeDuplicates(int[] a) {
		int i = 0;
		for (int j = 1; j < a.length; j++) {
			if (a[i] != a[j]) {
				a[++i] = a[j];
			}
		}
		for (int k = i + 1; k < a.length; k++) {
			a[k] = -0;
		}
		System.out.println(Arrays.toString(a));
	}
}
