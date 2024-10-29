package com.alien.functional;

import java.util.function.Function;

public class FunctionExample {

	public static void main(String[] args) {

		Function<Integer, Double> centigradeToFahrenheitInt = x -> new Double((x * 9 / 5) + 32);

		System.out.println("Centigrade to Fahrenheit: " + centigradeToFahrenheitInt.apply(100));

		Function<String, Integer> stringToInt = x -> Integer.valueOf(x);
		System.out.println("String to Int: " + stringToInt.apply("4"));

		Function<PersonEntity, PersonDTO> function = (entity) -> {
			return new PersonDTO(entity.getName(), entity.getAge());
		};

		PersonDTO personDTO = function.apply(new PersonEntity("Alien", 20));

		System.out.println(personDTO.getName());
		System.out.println(personDTO.getAge());

	}
}

class PersonEntity {
	private String name;
	private int age;

	public PersonEntity(String name, int age) {
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

class PersonDTO {
	private String name;
	private int age;

	public PersonDTO(String name, int age) {
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