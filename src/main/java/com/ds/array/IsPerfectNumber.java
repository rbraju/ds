package com.ds.array;

public class IsPerfectNumber {

	public static void main(String[] args) {
		int n = 50000;
		// Prints the list of perfect numbers from 1 to n
		int sum = 1;
		for (int j = 1; j <= n; j++) {
			sum = 1;
			for (int i = 2; i <= j / 2; i++) {
				if (j % i == 0)
					sum += i;
			}
			if (sum == j)
				System.out.println(j + " is a Perfect Number");
		}

	}
}
