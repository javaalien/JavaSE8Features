package com.alien.methodRef;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

public class MethodReferencesDemo {

	public static void main(String[] args) {

		List<String> fruits = new ArrayList<>();
		fruits.add("Banana");
		fruits.add("apple");
		fruits.add("mango");
		fruits.add("watermelon");

		Function<List<String>, Set<String>> setFunction = (fruitList) -> new HashSet<>(fruitList);
		System.out.println(setFunction.apply(fruits));

		Function<List<String>, Set<String>> setFunctionMethodRef = HashSet::new;
		System.out.println(setFunctionMethodRef.apply(fruits));

	}
}