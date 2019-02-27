package com.ds.array;

public class MergeSortedArrays {

	/**
	 * Merge two sorted integer arrays
	 * 
	 * @param a
	 *            First integer array
	 * @param b
	 *            Second integer array
	 * @return result
	 */
	public static int[] mergeArrays(int[] a, int[] b) {

		if (a.length == 0) {
			return b;
		}

		if (b.length == 0) {
			return a;
		}

		int i = 0, j = 0, count = 0;

		int[] result = new int[a.length + b.length];

		while (i < a.length && j < b.length) {
			if (a[i] < b[j]) {
				result[count++] = a[i];
				i++;
			} else {
				result[count++] = b[j];
				j++;
			}
		}

		/*
		 * Add the remaining elements to the result. Only one of the below while
		 * loops will be executed.
		 */
		while (i < a.length) {
			result[count++] = a[i];
			i++;
		}

		while (j < b.length) {
			result[count++] = b[j];
			j++;
		}

		return result;
	}
}
