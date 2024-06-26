package com.alien.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//Given a list of integers, find the second maximum value element present in it using Stream functions?

public class FindSecondMaxElement {

	public static void main(String[] args) {

		List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);

		Integer secondMax = myList.stream()
								.distinct()
								.sorted(Comparator.reverseOrder())
								.skip(1)
								.findFirst()
								.get();
		
		System.out.println(secondMax);

	}

}
