package com.alien.lambada;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// Java 8 program that counts the number of vowels and consonants in a given string

public class CountVowelsConsonantsJava8 {

	private static final Set < Character > allVowels = new HashSet(Arrays.asList('a', 'e', 'i', 'o', 'u'));
	
	public static void main(String[] args) {
		
		String str = "javaaliencount";
		
		long vowels = str.chars().filter(ch->allVowels.contains((char) ch )).count();
		
		long consonants1 = str.chars().filter(ch->!allVowels.contains((char) ch)).count();
		
		long consonants2 = str.chars()
	            .filter(c -> !allVowels.contains((char) c))
	            .filter(ch -> (ch >= 'a' && ch <= 'z'))
	            .count();

		
		System.out.println("vowels count => " + vowels);
        System.out.println("consonants => " + consonants1);
        System.out.println("consonants => " + consonants2);
		

	}

}
