package com.alien.stream;

// Count occurrence of a given character in a string using Stream API in Java.

public class CountOccurrenceOfCharacterFromString {

	public static void main(String[] args) {

		String str = "javaalienprogramming";
		char ch = 'a';
		System.out.println(count(str, ch));

	}

	private static long count(String str, char ch) {

		return str.chars().filter(c -> c == ch).count();
	}

}
