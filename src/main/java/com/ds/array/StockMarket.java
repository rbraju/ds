package com.ds.array;

/**
 * Given a list of stock prices, find when to buy and sell for a maximum profit.
 * 
 * @author Rajesh Bhoopathy Raju
 *
 */
public class StockMarket {

	public int getMaxProfit(int[] price) {
		if (price == null || price.length < 2)
			return -1;

		/*
		 * Not deleting buy and sell variables. Might need in future if buy and
		 * sell prices are required.
		 */
		int buy = 0, sell = 0, min = 0, diff = 0, profit = 0;
		min = price[0];
		for (int i = 1; i < price.length; i++) {
			if (price[i] < min) {
				min = price[i];
			} else {
				diff = price[i] - min;

				if (diff > profit) {
					profit = diff;
					buy = min;
					sell = price[i];
				}
			}
		}
		if (profit > 0) {
			return profit;
		} else {
			return -1;
		}
	}
}
