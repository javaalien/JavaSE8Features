package com.alien.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// Java 8 - Copy List into Another List Example

public class CopyListToAnotherExample {

	public static void main(String[] args) {

		List<String> fruits = new ArrayList<>();
		fruits.add("Banana");
		fruits.add("Apple");
		fruits.add("mango");
		fruits.add("orange");
		System.out.println("original Fruits :"+fruits);
		
		List<String> fruitCopy = fruits.stream().collect(Collectors.toList());
		
		System.out.println("Copied Fruits   :"+fruitCopy);

	}

}
