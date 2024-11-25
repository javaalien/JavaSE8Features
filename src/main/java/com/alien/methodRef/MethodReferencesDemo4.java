package com.alien.methodRef;

import java.util.Arrays;
import java.util.function.Function;

public class MethodReferencesDemo4 {

	public static void main(String[] args) {

		Function<String, String> stringFunction = (input) -> input.toLowerCase();

		System.out.println(stringFunction.apply("JAVA ALIEN"));

		Function<String, String> stringFunctionMethodRef = String::toLowerCase;

		System.out.println(stringFunction.apply("JAVA ALIEN"));

		String[] strArray = { "A", "E", "I", "O", "U", "a", "e", "i", "o", "u" };

		Arrays.sort(strArray, (s1, s2) -> s1.compareToIgnoreCase(s2));

		for (String str : strArray) {
			System.out.print(str + " ");
		}
		System.out.println();
		Arrays.sort(strArray, String::compareToIgnoreCase);

		for (String str : strArray) {
			System.out.print(str + " ");
		}
	}
}
