package com.alien.stream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//Java 8 program counts the number of vowels and consonants in a given string

public class CountVowelsConsonantsUsingJava8 {

	private static final Set<Character> allVowels = new HashSet(Arrays.asList('a', 'e', 'i', 'o', 'u'));

	public static void main(String[] args) {

		String str = "javaalienexamples";

		long vowels = str.chars().filter(c -> allVowels.contains((char) c)).count();
		
		long consonants = str.chars().filter(c -> !allVowels.contains((char) c))
									.filter(ch -> (ch >= 'a' && ch <= 'z'))
									.count();

		System.out.println("vowels count => " + vowels);
		System.out.println("consonants => " + consonants);

	}

}
