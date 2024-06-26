package com.alien.stream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

//Given an integer array nums, return true if any value 
//appears at least twice in the array, and return false if every element is distinct.

public class ContainsDuplicate {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 1 };

		boolean output = containsDuplicate(arr);

		System.out.println(output);

	}

	private static boolean containsDuplicate(int[] arr) {

		List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());

		Set<Integer> set = new HashSet<>(list);

		if (set.size() == list.size()) {
			return false;
		} else {
			return true;
		}
	}
}
