package com.ds.array;

import java.util.Arrays;

/**
 * Given an unsorted array with integers, find the array index or position where
 * sum of numbers preceding the index is equals to sum of numbers succeeding the
 * index.
 * 
 * @author Rajesh Bhoopathy Raju
 *
 */
public class EquilibriumIndex {

	public int getIndex(int[] a) {
		int index = -1;
		if (a.length < 3) {
			return index;
		}

		int sumBefore = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] == sumBefore && i != a.length - 1) {
				int sumAfter = 0;
				int j = i + 1;
				while (j < a.length) {
					sumAfter += a[j];
					++j;
				}
				if (sumAfter == sumBefore) {
					index = i;
				} else {
					sumBefore += a[i];
				}
			} else {
				sumBefore += a[i];
			}
		}
		return index;
	}
}
