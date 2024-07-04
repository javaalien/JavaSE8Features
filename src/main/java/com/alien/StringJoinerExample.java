package com.alien;

import java.util.StringJoiner;

// create a string by passing delimiters like a comma(,), hyphen(-)

public class StringJoinerExample {

	public static void main(String[] args) {

		StringJoiner joinNames = new StringJoiner(",");

		joinNames.add("Kavya");
		joinNames.add("Raju");
		joinNames.add("Peter");
		joinNames.add("Chetan");
		System.out.println(joinNames);

		joinNames = new StringJoiner("|");

		joinNames.add("Kavya");
		joinNames.add("Raju");
		joinNames.add("Peter");
		joinNames.add("Aakash");
		System.out.println(joinNames);

	}

}
