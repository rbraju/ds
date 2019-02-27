package com.ds.string;

import java.util.HashMap;
import java.util.Map;

/**
 * You are playing the following Bulls and Cows game with your friend: You write
 * down a number and ask your friend to guess what the number is. Each time your
 * friend makes a guess, you provide a hint that indicates how many digits in
 * said guess match your secret number exactly in both digit and position
 * (called "bulls") and how many digits match the secret number but locate in
 * the wrong position (called "cows"). Your friend will use successive guesses
 * and hints to eventually derive the secret number.<br>
 * <br>
 * 
 * For example: Secret number: "1807" Friend's guess: "7810"<br>
 * <br>
 * 
 * Hint: 1 bull and 3 cows. (The bull is 8, the cows are 0, 1 and 7.) Write a
 * function to return a hint according to the secret number and friend's guess,
 * use A to indicate the bulls and B to indicate the cows. In the above example,
 * your function should return "1A3B".
 * 
 * @author m808414
 *
 */
public class BullAndCow {

	public static void main(String[] args) {

		String number = "67809";

		String guess = "96807";

		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < number.length(); i++) {
			map.put(number.charAt(i), i);
		}

		System.out.println(map);
		int bulls = 0, cows = 0;
		for (int index = 0; index < guess.length(); index++) {
			if (map.get(guess.charAt(index)) != null) {
				if (index == map.get(guess.charAt(index))) {
					bulls++;
				} else {
					cows++;
				}
			}
		}
		System.out.println("Bulls: " + bulls + ", Cows: " + cows);
	}
}
