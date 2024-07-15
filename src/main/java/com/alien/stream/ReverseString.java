package com.alien.stream;

// Java 8 Program To Reverse a String

public class ReverseString {

	public static void main(String[] args) {

		String originalString = "Alien";

		String reversedString = new StringBuilder(originalString).reverse().toString();

		System.out.println("Original string: " + originalString);
		System.out.println("Reversed string: " + reversedString);

	}
}
