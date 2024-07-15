package com.alien.stream;

import java.util.stream.IntStream;

// Java 8 Program To Find Prime Number

public class PrimeNumberCheck {

	public static void main(String[] args) {
		int number = 29;
		boolean isPrime = isPrime(number);

		if (isPrime) {
			System.out.println(number + " is a prime number.");
		} else {
			System.out.println(number + " is not a prime number.");
		}
	}

	private static boolean isPrime(int number) {

		if (number <= 1)
			return false;

		return !IntStream.rangeClosed(2, (int) Math.sqrt(number)).anyMatch(i -> number % i == 0);
	}
}
