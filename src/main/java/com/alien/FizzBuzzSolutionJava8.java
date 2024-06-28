package com.alien;

import java.util.Optional;

/*Problem: For a given natural number greater than zero return:
    “Fizz” if the number is dividable by 3
    “Buzz” if the number is dividable by 5
    “FizzBuzz” if the number is dividable by 15
     Same number if the number is neither divisible by 3 nor 5.*/

public class FizzBuzzSolutionJava8 {

	public static void main(String[] args) {

		System.out.println("FizzBuzz using simple Java : " + fizzBuzz(3));
		System.out.println("FizzBuzz solution using Java 8  : " + fizzBuzzInJava8(5));
		System.out.println("FizzBuzz solution using Java 8  : " + fizzBuzzSolutionJava8(15));

	}

	private static String fizzBuzzSolutionJava8(int number) {

		String result = Optional.of(number).map(n -> (n % 3 == 0 ? "Fizz" : "") + (n % 5 == 0 ? "Buzz" : "")).get();

		return result.isEmpty() ? Integer.toString(number) : result;
	}

	private static String fizzBuzzInJava8(int number) {

		return Optional.of(number).map(i -> {
			if (i % (3 * 5) == 0) {
				return "FizzBuzz";
			} else if (i % 3 == 0) {
				return "Fizz";
			} else if (i % 5 == 0) {
				return "Buzz";
			} else {
				return Integer.toString(i);
			}
		}).get();
	}

	private static String fizzBuzz(int number) {
		if (number % 15 == 0)
			return "FizzBuzz";
		else if (number % 3 == 0)
			return "Fizz";
		else if (number % 5 == 0)
			return "Buzz";

		return Integer.toString(number);
	}

}
