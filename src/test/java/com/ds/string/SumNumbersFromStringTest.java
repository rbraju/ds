package com.ds.string;

import static org.junit.Assert.assertEquals;

import org.testng.annotations.Test;

public class SumNumbersFromStringTest {

	private static final SumNumbersFromString sum = new SumNumbersFromString();

	@Test
	public void validString() {
		String str = "abc6xyz4";
		assertEquals(sum.process(str), 10);
	}

	@Test
	public void validStringWithNegativeValues() {
		String str = "-abc-30xyz28x";
		assertEquals(sum.process(str), -2);
	}

	@Test
	public void validLongString() {
		String str = "bar--xyz--86+test86-jp84+foo-84+x-2-8-";
		assertEquals(sum.process(str), -10);
	}

	@Test
	public void nullString() {
		assertEquals(sum.process(null), 0);
	}
}
