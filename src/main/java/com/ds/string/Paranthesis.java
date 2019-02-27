package com.ds.string;

public class Paranthesis {

	public static void main(String[] args) {
		int n = 3;
		printParanthesis(n, 0, "");
	}

	static void printParanthesis(int open, int close, String value) {
		//System.out.println(open + " -- " + close + " -- " + value);
		if (open == 0 && close == 0) {
			System.out.println(value);
			return;
		}

		if (open > 0) {
			printParanthesis(open - 1, close + 1, value + "{");
		}

		if (close > 0) {
			printParanthesis(open, close - 1, value + "}");
		}
	}
}
