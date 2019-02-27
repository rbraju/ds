package com.ds.string;

public class ReverseWords {

	public static void main(String[] args) {

		String str = "Reverse all the words in a string";
		
		char[] input = str.toCharArray();
		
		int i = 0;
		
		// Reverse entire array
		reverse(input, 0, input.length - 1);

		// Reverse each word
		for (int k = 0; k < input.length; k++) {
			if (input[k] == ' ') {
				reverse(input, i, k - 1);
				i = k + 1;
			}
		}

		// Reverse last word
		reverse(input, i, input.length - 1);
		
		System.out.println(String.valueOf(input));
	}

	private static void reverse(char[] input, int start, int end) {
		char temp = 0;
		while (start < end) {
			temp = input[start];
			input[start] = input[end];
			input[end] = temp;
			start++;
			end--;
		}
	}
}
