package com.alien.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class JavaCollectToListEx {

	public static void main(String[] args) {

		List<String> programmingLanguages = new ArrayList<>();
		programmingLanguages.add("C");
		programmingLanguages.add("C++");
		programmingLanguages.add("Java");
		programmingLanguages.add("Kotlin");
		programmingLanguages.add("Python");
		programmingLanguages.add("Perl");
		programmingLanguages.add("Ruby");

		List<String> result = programmingLanguages.stream().filter(word -> word.length() == 4)
				.collect(Collectors.toList());

		System.out.println(result);

	}
}
