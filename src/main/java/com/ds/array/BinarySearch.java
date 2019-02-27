package com.ds.array;

/**
 * Given a sorted integer array, find the index of a given number from the
 * array. Return -1 if the element is not present.
 * 
 * @author Rajesh Bhoopathy Raju
 *
 */
public class BinarySearch {

	public int getIndex(int[] a, int n) {

		if (a == null || n < a[0] || n > a[a.length - 1]) {
			return -1;
		}

		int mid = 0, start = 0, end = a.length - 1;
		boolean flag = false;

		while (start <= end) {
			mid = (start + end) / 2;
			if (a[mid] == n) {
				flag = true;
				break;
			}
			if (a[mid] > n)
				end = mid - 1;
			else
				start = mid + 1;
		}

		if (flag)
			return mid;
		else
			return -1;
	}

	public static void main(String[] args) {
		BinarySearch search = new BinarySearch();
		int[] a = { 10, 12, 14, 18, 22, 29, 32, 55, 74, 85, 91 };
		System.out.println(search.getIndex(a, 29));
	}
}