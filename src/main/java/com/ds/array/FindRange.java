package com.ds.array;

/**
 * Given a sorted integer array, with or without duplicates, and a given number
 * k, Find the start and end index for k.
 */
public class FindRange {

	public int[] getRange(int[] a, int k) {
		if (a == null || k < a[0] || k > a[a.length - 1]) {
			return null;
		}

		int start = -1, end = -1;
		int length = a.length;
		int mid = -1, low = 0, high = length - 1;
		boolean flag = false;

		while (low <= high) {
			mid = (low + high) / 2;
			if (a[mid] < k) {
				// Traverse to the right side
				low = mid + 1;
			} else if (a[mid] > k) {
				// Traverse to the left side
				high = mid - 1;
			} else {
				flag = true;
				break;
			}
		}

		if (flag) {
			System.out.println("Element found at index " + mid);
			while (a[mid] == k) {
				if (mid == 0)
					break;
				mid = mid - 1;
			}
			if (mid == 0)
				start = mid;
			else
				start = ++mid;

			while (a[mid] == k) {
				if (mid == a.length - 1)
					break;
				mid = mid + 1;
			}

			if (mid != a.length - 1)
				end = --mid;
			else
				end = mid;
		} else {
			start = end = -1;
			System.out.println("Element not found");
		}

		System.out.println("\nStart : " + start + ", End : " + end);
		return new int[] { start, end };
	}
}
