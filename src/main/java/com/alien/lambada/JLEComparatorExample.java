package com.alien.lambada;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Java Lambda Expression Comparator Example

public class JLEComparatorExample {

	public static void main(String[] args) {

		List<Person1> listOfPerson = new ArrayList<>();
		listOfPerson.add(new Person1("chetan", 27));
		listOfPerson.add(new Person1("alien", 26));
		listOfPerson.add(new Person1("kavya", 4));
		listOfPerson.add(new Person1("allu", 27));

		// Sort list by age

		Collections.sort(listOfPerson, (p1, p2) -> {
			return p1.getAge() - p2.getAge();
		});

		System.out.println(" sort persons by age in ascending order");

		listOfPerson.forEach((person) -> System.out.println(" Person name : " + person.getName()));

	}
}

class Person1 {
	private String name;
	private int age;

	public Person1(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}