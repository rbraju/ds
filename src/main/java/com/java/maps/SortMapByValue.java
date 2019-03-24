package com.java.maps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Sort a given map based on values. Return a new map with sorted values.
 * 
 * @author Rajesh Bhoopathy Raju
 */
public class SortMapByValue {

	public Map<Integer, Player> sortByValue(Map<Integer, Player> map) {
		if (map == null)
			return map;
		
		List<Entry<Integer, Player>> entries = new ArrayList<>(map.entrySet());
		System.out.println("Original map: \n" + entries);

		// Sort list of entries using comparator
		Collections.sort(entries, new Comparator<Entry<Integer, Player>>() {
			@Override
			public int compare(Entry<Integer, Player> e1, Entry<Integer, Player> e2) {
				return e1.getValue().getAge() - e2.getValue().getAge();
			}
		});
		System.out.println("\nList of entries: \n" + entries);

		// LinkedHashMap maintains the insertion order
		Map<Integer, Player> resultMap = new LinkedHashMap<Integer, Player>();
		for (Entry<Integer, Player> entry : entries) {
			resultMap.put(entry.getKey(), entry.getValue());
		}

		return resultMap;
	}
}
