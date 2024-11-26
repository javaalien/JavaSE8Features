package com.alien.lambada;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DifferentWaysMapIterateProgram {

	public static void main(String[] args) {

		Map<Integer, String> coursesMap = new HashMap<Integer, String>();
		coursesMap.put(1, "C");
		coursesMap.put(2, "C++");
		coursesMap.put(3, "Java");
		coursesMap.put(4, "J2EE");
		coursesMap.put(5, "Python");
		coursesMap.put(6, "Scala");

		System.out.println("Using iterator===>>>");
		Iterator<Map.Entry<Integer, String>> iterator = coursesMap.entrySet().iterator();

		while (iterator.hasNext()) {
			Map.Entry<Integer, String> course = iterator.next();
			coursePrinter(course.getKey(), course.getValue());
		}
		System.out.println("\nUsing Enhanced for loop===>>>");

		for (Map.Entry<Integer, String> entry : coursesMap.entrySet()) {
			coursePrinter(entry.getKey(), entry.getValue());
		}
		System.out.println("\nUsing JDK 8 for each with lambda===>>>");

		coursesMap.forEach((k, v) -> coursePrinter(k, v));

		System.out.println("\nUsing JDK 8 for each method reference===>>>");

		coursesMap.forEach(DifferentWaysMapIterateProgram::coursePrinter);

	}

	private static void coursePrinter(Integer number, String brand) {
		System.out.println("course no : " + number + " and course name : " + brand);
	}
}
