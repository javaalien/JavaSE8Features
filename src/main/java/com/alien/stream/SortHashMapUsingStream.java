package com.alien.stream;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortHashMapUsingStream {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<>();

		map.put(4, "Alien");
		map.put(1, "chetan");
		map.put(2, "Akshu");
		map.put(5, "Kavya");
		map.put(3, "Rudra");

		Map<Integer, String> collect = map.entrySet().stream().sorted((e1, e2) -> e1.getKey().compareTo(e2.getKey()))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

		System.out.println(collect);

		LinkedHashMap<Integer, String> collect2 = map.entrySet().stream()
				.sorted(Map.Entry.<Integer, String>comparingByKey().reversed())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

		System.out.println(collect2);
	}

}
