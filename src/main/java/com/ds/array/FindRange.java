package com.ds.array;

/**
 * Given a sorted integer array, with or without duplicates, and a given number n,
 * Find the start and end index for n.
 */
public class FindRange {

	static int[] a = { 1, 1, 2, 3, 3, 3, 5, 5, 5, 5, 5, 7, 7, 9, 9, 11, 11 };

	static int start = -1;

	static int end = -1;

	public static void main(String[] args) {

		int length = a.length;

		int n = 5, mid = 0;

		int low = 0, high = length - 1;

		boolean flag = false;

		while (low <= high) {
			mid = (low + high) / 2;

			if (a[mid] < n) {
				// Traverse to the right side
				low = mid + 1;
			} else if (a[mid] > n) {
				// Traverse to the left side
				high = mid - 1;
			} else {
				flag = true;
				break;
			}
		}

		if (flag) {
			System.out.println("Element found at index " + mid);
		} else {
			System.out.println("Element not found");
		}

		while (a[mid] == n) {
			if (mid == 0)
				break;
			mid = mid - 1;
		}
		if (mid == 0)
			start = mid;
		else
			start = ++mid;

		while (a[mid] == n) {
			if (mid == a.length - 1)
				break;
			mid = mid + 1;
		}

		if (mid != a.length - 1)
			end = --mid;
		else
			end = mid;

		System.out.println("\nStart : " + start + ", End : " + end);
	}
}
