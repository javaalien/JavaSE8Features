package com.alien.stream;

import java.util.regex.Pattern;
import java.util.stream.Collectors;

// Java 8 program that reverses words of a given string

public class ReversesWordsOfString {

	private static final Pattern PATTERN = Pattern.compile(" +");
	private static final String SPACE = " ";

	public static void main(String[] args) {

		String str = "Java is Object Oriented Programming Language";

		String result = PATTERN.splitAsStream(str).map(word -> new StringBuffer(word).reverse())
				.collect(Collectors.joining(SPACE));

		System.out.println(result);

	}

}
