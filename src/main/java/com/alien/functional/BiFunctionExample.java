package com.alien.functional;

import java.util.function.BiFunction;

public class BiFunctionExample {

	public static void main(String[] args) {

		BiFunction<Person, Person, Integer> biFunction = (p1, p2) -> {
			return p1.getAge() + p2.getAge();
		};

		int totalAge = biFunction.apply(new Person("Chetan", 30), new Person("Yash", 20));

		System.out.println(totalAge);

	}
}
