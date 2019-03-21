package com.ds.java.maps;

import java.util.HashMap;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SortMapByValueTest {

	private static final SortMapByValue sort = new SortMapByValue();
	
	@Test
	public void nullMap() {
		Assert.assertNull(sort.sortByValue(null));
	}

	@Test
	public void test1() {
		Map<Integer, Player> players = new HashMap<Integer, Player>();
		players.put(1002, new Player("Smriti", 27, 'F'));
		players.put(1004, new Player("Dhawan", 33, 'M'));
		players.put(1005, new Player("Sharma", 32, 'M'));
		players.put(1006, new Player("Sachin", 43, 'M'));
		players.put(1008, new Player("Misbah", 43, 'M'));
		players.put(1009, new Player("Poonam", 22, 'F'));
		players.put(1011, new Player("Pant", 22, 'M'));

		Map<Integer, Player> sortedMap = sort.sortByValue(players);
		System.out.println("\nResult map: \n" + sortedMap);
	}
}
