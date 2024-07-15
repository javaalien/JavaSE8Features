package com.alien.stream;

// Java 8 Program to Find the Sum of All Digits of a Number

public class SumOfDigits {

	public static void main(String[] args) {
		int number = 12345;

		int sum = String.valueOf(number).chars().map(Character::getNumericValue).sum();

		System.out.println("The sum of digits: " + sum);
	}
}
