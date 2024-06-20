package com.alien.lambada;

import java.util.HashMap;
import java.util.Map;

public class LambadaAndForEachWithMap {

	public static void main(String[] args) {

		final Map<Integer, Person> map = new HashMap<>();
		map.put(1, new Person(100, "Ramesh"));
		map.put(2, new Person(100, "Ram"));
		map.put(3, new Person(100, "Prakash"));
		map.put(4, new Person(100, "Amir"));
		map.put(5, new Person(100, "Sharuk"));

		// In Java 8, you can loop a Map with forEach + lambda expression.

		map.forEach((k, p) -> {
			System.out.println(k);
			System.out.println(p.getName());
		});

	}

}

class Person {

	int id;
	String name;

	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

}