package com.alien.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


//Given a list of integers, find out all the even numbers that exist in the list using Stream functions?

public class FindEvenNumbers {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(10,15,8,49,25,98,32);
		
		list.stream()
			.filter(i->i%2==0)
			.collect(Collectors.toList())
			.forEach(System.out::println);
		
	}

}
