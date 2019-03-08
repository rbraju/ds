package com.ds.array;

import org.testng.Assert;
import org.testng.annotations.Test;

public class EquilibriumIndexTest {

	private static final EquilibriumIndex ei = new EquilibriumIndex();

	@Test
	public void verifySumPrecedingAndSucceeding() {

		int[] a = { -3, -2, 5, 0 };
		Assert.assertEquals(ei.getIndex(a), -1);

		a = new int[] { 1, 1, 1 };
		Assert.assertEquals(ei.getIndex(a), 1);

		a = new int[] { 1, 1, 2 };
		Assert.assertEquals(ei.getIndex(a), -1);

		a = new int[] { -12, -13, 25, 0, 25, -15, -10 };
		Assert.assertEquals(ei.getIndex(a), 3);

		a = new int[] { 1, 2, 3, 5, 11, 22, 7, 2, 3, 2, 4, 1, 2, 1 };
		Assert.assertEquals(ei.getIndex(a), 5);

		a = new int[] { 1, 2 };
		Assert.assertEquals(ei.getIndex(a), -1);
}

}
