package com.ds.array;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StockMarketTest {

	private StockMarket market = new StockMarket();

	@Test
	public void noProfit() {
		int[] a = { 5, 4, 3, 2, 1 };
		assertEquals(-1, market.getMaxProfit(a));
	}

	@Test
	public void nullArray() {
		assertEquals(-1, market.getMaxProfit(null));
	}

	@Test
	public void validArray() {
		int[] a = { 5, 9, 12, 9, 6, 1, 13, 18 };
		assertEquals(17, market.getMaxProfit(a));
	}
}
