package com.alien.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class JavaStreamExample2 {

	public static void main(String[] args) {

		List<Person> people = getPeople();

		List<Person> sorted = people.stream().sorted(Comparator.comparing(Person::getGender))
				.collect(Collectors.toList());

		sorted.forEach(System.out::println);

		System.out.println(" ************* ");

		List<Person> sortedDescending = people.stream().sorted(Comparator.comparing(Person::getGender).reversed())
				.collect(Collectors.toList());

		sortedDescending.forEach(System.out::println);
	}

	private static List<Person> getPeople() {
		return List.of(new Person("Antonio", 20, Gender.MALE), new Person("Alina Smith", 33, Gender.FEMALE),
				new Person("Helen White", 57, Gender.FEMALE), new Person("Alex Boz", 14, Gender.MALE),
				new Person("Jamie Goa", 99, Gender.MALE), new Person("Anna Cook", 7, Gender.FEMALE),
				new Person("Zelda Brown", 120, Gender.FEMALE));
	}
}
