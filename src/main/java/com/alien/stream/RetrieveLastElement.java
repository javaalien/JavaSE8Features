package com.alien.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class RetrieveLastElement {

	public static void main(String[] args) {

		List<String> listOfStrings = Arrays.asList("Java", "Python", "C++", "JavaScript", "Ruby");

		Optional<String> lastElement = listOfStrings.stream().reduce((first, second) -> second);

		lastElement.ifPresent(element -> System.out.println("The last element is: " + element));

	}
}
