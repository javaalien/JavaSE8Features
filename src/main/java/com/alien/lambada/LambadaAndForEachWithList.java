package com.alien.lambada;

import java.util.ArrayList;
import java.util.List;

//Loop a List with forEach + lambda expression

public class LambadaAndForEachWithList {

	public static void main(String[] args) {

		final List<Person> items = new ArrayList<>();
		items.add(new Person(100, "Ramesh"));
		items.add(new Person(100, "A"));
		items.add(new Person(100, "B"));
		items.add(new Person(100, "C"));
		items.add(new Person(100, "D"));

		items.forEach(item -> System.out.println(item.getName()));

		// Output : C
		items.forEach(item -> {
			if ("C".equals(item)) {
				System.out.println(item);
			}
		});

		// method reference	
		// Output : A,B,C,D,E
		items.forEach(System.out::println);

		// Stream and filter
		// Output : B
		items.stream().filter(s -> s.getName().equals("Ramesh")).forEach(System.out::println);
	}

}
