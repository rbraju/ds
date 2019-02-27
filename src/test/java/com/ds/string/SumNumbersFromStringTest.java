package com.ds.string;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SumNumbersFromStringTest {

	private SumNumbersFromString instance = new SumNumbersFromString();

	@Test
	public void validString() {
		String str = "abc6xyz4";
		assertEquals(instance.process(str), 10);
	}

	@Test
	public void validStringWithNegativeValues() {
		String str = "-abc-30xyz28";
		assertEquals(instance.process(str), -2);
	}

	@Test
	public void validLongString() {
		String str = "bar--xyz--86+test86-jp84+foo-84+x-2-8-";
		assertEquals(instance.process(str), -10);
	}

	@Test
	public void nullString() {
		assertEquals(instance.process(null), Integer.MIN_VALUE);
	}
}
