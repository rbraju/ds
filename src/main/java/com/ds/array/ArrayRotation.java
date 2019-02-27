package com.ds.array;

import java.util.Arrays;

/**
 * Given a and k as integer array and an integer respectively, rotate the array
 * k times <br>
 * 
 * Approach:<br>
 * Split the array into two, reverse them separately and reverse the entire
 * array once
 * 
 * @author Rajesh Bhoopathy Raju
 *
 */
public class ArrayRotation {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int length = a.length;

		int k = 4;
		if (k > length) {
			k = k % length;
		}

		System.out.println("Original array : " + Arrays.toString(a));
		System.out.println("No. of times to rotate : " + k);
		reverse(a, 0, length - k - 1);
		reverse(a, length - k, length - 1);
		reverse(a, 0, a.length - 1);
		System.out.println(Arrays.toString(a));
	}

	static void reverse(int[] a, int start, int end) {
		int temp = 0;
		while (start < end) {
			temp = a[start];
			a[start] = a[end];
			a[end] = temp;
			start++;
			end--;
		}
	}
}
