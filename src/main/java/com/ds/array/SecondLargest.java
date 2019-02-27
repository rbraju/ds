package com.ds.array;

/**
 * Find the second largest number from the given list <br>
 * <br>
 * 
 * <b>Amazon - Telephonic interview</b>
 * 
 * @author Rajesh Bhoopathy Raju
 *
 */
public class SecondLargest {

	public int findSecondLargest(int[] a) throws Exception {

		if (a == null || a.length < 2) {
			throw new Exception("Invalid array");
		}

		int largest = 0, second = 0;
		if (a[0] > a[1]) {
			largest = a[0];
			second = a[1];
		} else {
			largest = a[1];
			second = a[0];
		}

		for (int i = 2; i < a.length; i++) {
			if (a[i] > largest) {
				second = largest;
				largest = a[i];
			} else if (a[i] > second) {
				if (a[i] != largest)
					second = a[i];
			}
		}

		return second;
	}
}
