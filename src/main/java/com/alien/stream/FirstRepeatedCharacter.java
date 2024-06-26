package com.alien.stream;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

// Given a String, find the first repeated character in it using Stream functions?

public class FirstRepeatedCharacter {

	public static void main(String[] args) {
		
		String input = "Java Alien is Awesome";
		
		Character result = input.chars().mapToObj(s->Character.toLowerCase(Character.valueOf((char)s))) // First convert to Character object and then to lowercase   
								.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())) //Store the chars in map with count 
								.entrySet()
								.stream()
								.filter(entry->entry.getValue() >1L)
								.map(entry->entry.getKey())
								.findFirst()
								.get();
		
		System.out.println(result);

	}

}
