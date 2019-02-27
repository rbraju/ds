package com.ds.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given an integer array, find the list of 3 numbers whose sum is equal to zero
 * <br> <br>
 * Yahoo onsite interview
 * 
 * @author Rajesh Bhoopathy Raju
 *
 */
public class SumIsZero {
	public static void main(String[] args) {
		int[] a = { -4, -2, -2, -2, 0, 1, 2, 2, 2, 3, 3, 4, 4, 6, 6 };
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		List<List<Integer>> result = printNumbers(a, 0);
		for (List<Integer> list : result) {
			System.out.println(list);
		}
	}

	public static List<List<Integer>> printNumbers(int[] nums, int val) {

		int i = 0, j = 0, sum = 0, n = 0;
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		List<Integer> temp = null;

		while (n < nums.length) {
			i = n + 1;
			j = nums.length - 1;

			while (i < j) {
				sum = nums[n] + nums[i] + nums[j];
				if (sum < val) {
					i++;
				} else if (sum > val) {
					j--;
				} else {
					temp = new ArrayList<Integer>();
					temp.add(nums[n]);
					temp.add(nums[i]);
					temp.add(nums[j]);
					if (!result.contains(temp))
						result.add(temp);
					j--;
				}
			}
			n++;
		}
		return result;
	}
}
