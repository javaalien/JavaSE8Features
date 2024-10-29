package com.alien.functional;

import java.util.function.Supplier;

public class SuppliersExample {

	public static void main(String[] args) {
		Supplier<Person> supplier = () -> {
			return new Person("Alien", 30);
		};

		Person p = supplier.get();

		System.out.println("Person Detail:" + p.getName() + ", " + p.getAge());
	}
}