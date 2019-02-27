package com.ds.array;

/**
 * Array utility class to perform different sorting algorithms
 * 
 * @author Rajesh Bhoopathy Raju
 * 
 */
public class ArrayUtil {

	private static int[] temp;

	/**
	 * Bubble sort algorithm
	 * 
	 * @param a
	 *            - Input array
	 */
	public static void bubbleSort(int[] a) {
		int length = a.length;
		for (int i = 0; i < length; i++) {
			for (int j = i + 1; j < length; j++) {
				if (a[i] > a[j])
					swap(a, i, j);
			}
		}
	}

	/**
	 * Selection sort algorithm
	 * 
	 * @param a
	 *            - Input array
	 */
	public static void selectionSort(int[] a) {
		int length = a.length;
		int min = 0;
		for (int i = 0; i < length; i++) {
			min = i;
			for (int j = i + 1; j < length; j++) {
				if (a[min] > a[j]) {
					min = j;
				}
			}
			swap(a, i, min);
		}
	}

	/**
	 * Swaps two elements in the array
	 * 
	 * @param a
	 *            - Input array
	 * @param i
	 *            - Index 1
	 * @param j
	 *            - Index 2
	 */
	private static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	/**
	 * Insertion sort algorithm
	 * 
	 * @param a
	 *            - Input array
	 */
	public static void insertionSort(int[] a) {
		int i = 0, j = 0, temp = 0;
		int length = a.length;
		for (j = 1; j < length; j++) {
			temp = a[j];
			i = j;
			while (i > 0 && a[i - 1] >= temp) {
				a[i] = a[i - 1];
				--i;
			}
			a[i] = temp;
		}
	}

	/**
	 * Quick sort algorithm
	 * 
	 * @param a
	 *            - Input array
	 */
	public static void quickSort(int[] a) {
		int length = a.length;
		quickSort(a, 0, length - 1);
	}

	private static void quickSort(int[] a, int low, int high) {
		int i = low, j = high;

		int pivot = a[low + (high - low) / 2];

		while (i <= j) {

			while (a[i] < pivot) {
				i++;
			}

			while (a[j] > pivot) {
				j--;
			}

			if (i <= j) {
				swap(a, i, j);
				i++;
				j--;
			}
		}
		if (low < j)
			quickSort(a, low, j);
		if (i < high)
			quickSort(a, i, high);
	}

	/**
	 * Merge sort algorithm
	 * 
	 * @param a
	 *            - Input array
	 */
	public static void mergeSort(int[] a) {
		int length = a.length;
		temp = new int[length];
		mergeSort(a, 0, length - 1);
	}

	private static void mergeSort(int[] a, int low, int high) {
		if (low < high) {
			int mid = low + (high - low) / 2;
			mergeSort(a, low, mid);
			mergeSort(a, mid + 1, high);
			mergeParts(a, low, mid, high);
		}
	}

	private static void mergeParts(int[] a, int low, int mid, int high) {
		for (int i = low; i <= high; i++) {
			temp[i] = a[i];
		}

		int i = low;
		int j = mid + 1;
		int k = low;
		while (i <= mid && j <= high) {
			if (temp[i] < temp[j]) {
				a[k] = temp[i];
				i++;
			} else {
				a[k] = temp[j];
				j++;
			}
			k++;
		}
		while (i <= mid) {
			a[k] = temp[i];
			k++;
			i++;
		}
	}
}
