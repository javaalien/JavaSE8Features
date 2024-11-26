package com.alien.lambada;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DifferentWaysSetIterateProgram {

	public static void main(String[] args) {
		Set<String> courses = new HashSet<String>();
		courses.add("Java");
		courses.add("C");
		courses.add("C++");
		courses.add("Python");
		courses.add("Scala");

		// Enhanced for loop
		for (String course : courses) {
			coursePrinter(course);
		}

		// Basic loop with iterator

		for (Iterator<String> itr = courses.iterator(); itr.hasNext();) {
			coursePrinter(itr.next());
		}

		// While loop with iterator
		Iterator<String> it = courses.iterator();
		while (it.hasNext()) {
			String course = it.next();
			coursePrinter(course);
		}
		// JDK 8 streaming example lambda expression
		courses.stream().forEach(course -> coursePrinter(course));

		// JDK 8 streaming example method reference
		courses.stream().forEach(DifferentWaysSetIterateProgram::coursePrinter);

		// JDK 8 for each with lambda
		courses.forEach(course -> coursePrinter(course));

		// JDK 8 for each
		courses.forEach(DifferentWaysSetIterateProgram::coursePrinter);

	}

	private static void coursePrinter(String course) {
		System.out.println("course name :: " + course);
	}

}
