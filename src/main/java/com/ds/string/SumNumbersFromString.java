package com.ds.string;

public class SumNumbersFromString {

	public int process(String str) {
		// String str = "raj--esh--86+rajesh86-jp84+ravi-84+x-2-8-";

		char[] ch = str.toCharArray();

		String temp = "";

		int result = 0;

		System.out.println(str);
		for (int i = 0; i < ch.length; i++) {
			if (Character.isDigit(ch[i])) {
				temp += ch[i];
			} else if (ch[i] == '-') {
				if (!temp.equals("") && !temp.equals("-"))
					result += Integer.parseInt(temp);
				temp = "-";
			} else {
				if (!temp.equals("") && !temp.equals("-"))
					result += Integer.parseInt(temp);
				temp = "";
			}
		}
		if (!temp.equals("") && !temp.equals("-"))
			result += Integer.parseInt(temp);

		return result;
	}
}
