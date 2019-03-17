package com.ds.array;

public class IsPerfectNumber {

	public boolean isPerfectNumber(int n) {
		boolean isPerfectNumber = false;
		int sum = 1;
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0)
				sum += i;
		}
		if (sum == n)
			isPerfectNumber = true;

		return isPerfectNumber;
	}
}