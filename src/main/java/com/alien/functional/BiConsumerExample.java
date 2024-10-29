package com.alien.functional;

import java.util.function.BiConsumer;

public class BiConsumerExample {

	public static void main(String[] args) {

		BiConsumer<Person, Person> biconsumer = (p1, p2) -> {
			System.out.println(" print first person");
			System.out.println(p1.getName());
			System.out.println(" print second person");
			System.out.println(p2.getName());
		};

		biconsumer.accept(new Person("Chetan", 30), new Person("Yash", 10));
	}
}
