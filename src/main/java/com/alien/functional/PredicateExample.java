package com.alien.functional;

import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {

		Predicate<Person> predicate = (person) -> person.getAge() > 28;

		boolean result = predicate.test(new Person("Chetan", 30));

		System.out.println(result);

	}
}
