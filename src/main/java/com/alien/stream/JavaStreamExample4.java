package com.alien.stream;

import java.util.List;

public class JavaStreamExample4 {

	public static void main(String[] args) {

		List<Person> people = getPeople();

		boolean allMatch = people.stream().allMatch(perosn -> perosn.getAge() > 8);

		System.out.println(allMatch);

		boolean anyMatch = people.stream().anyMatch(person -> person.getAge() > 110);

		System.out.println(anyMatch);

		boolean noneMatch = people.stream().noneMatch(person -> person.getName().equals("Antonio"));

		System.out.println(noneMatch);

	}

	private static List<Person> getPeople() {
		return List.of(new Person("Antonio", 20, Gender.MALE), new Person("Alina Smith", 33, Gender.FEMALE),
				new Person("Helen White", 57, Gender.FEMALE), new Person("Alex Boz", 14, Gender.MALE),
				new Person("Jamie Goa", 99, Gender.MALE), new Person("Anna Cook", 7, Gender.FEMALE),
				new Person("Zelda Brown", 120, Gender.FEMALE));
	}

}
