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

	public int[] rotateArray(int[] a, int k) {

		if (a == null || a.length == k) {
			return a;
		}
		
		int length = a.length;

		if (k > length) {
			k = k % length;
		}
		
		System.out.println("Before rotation: " + Arrays.toString(a));
		reverse(a, 0, length - k - 1);
		reverse(a, length - k, length - 1);
		reverse(a, 0, a.length - 1);
		System.out.println("After rotation : " + Arrays.toString(a));

		return a;
	}

	void reverse(int[] a, int start, int end) {
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
