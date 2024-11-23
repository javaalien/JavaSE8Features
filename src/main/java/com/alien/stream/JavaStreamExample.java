package com.alien.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class JavaStreamExample {

	public static void main(String[] args) {

		List<Person> people = getPeople();

		List<Person> females = new ArrayList<>();

		for (Person person : people) {
			if (person.getGender().equals(Gender.FEMALE)) {
				females.add(person);
			}
		}

		females.forEach(System.out::println);

		System.out.println(" **************** ");

		List<Person> female1 = people.stream().filter(person -> person.getGender().equals(Gender.FEMALE))
				.collect(Collectors.toList());

		female1.forEach(System.out::println);

	}

	private static List<Person> getPeople() {
		return List.of(new Person("Antonio", 20, Gender.MALE), new Person("Alina Smith", 33, Gender.FEMALE),
				new Person("Helen White", 57, Gender.FEMALE), new Person("Alex Boz", 14, Gender.MALE),
				new Person("Jamie Goa", 99, Gender.MALE), new Person("Anna Cook", 7, Gender.FEMALE),
				new Person("Zelda Brown", 120, Gender.FEMALE));
	}

}

class Person {

	private final String name;
	private final int age;
	private final Gender gender;

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public Gender getGender() {
		return gender;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}

	public Person(String name, int age, Gender gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
}

enum Gender {
	MALE, FEMALE
}