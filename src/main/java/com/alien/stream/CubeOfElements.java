package com.alien.stream;

import java.util.Arrays;
import java.util.List;

//Java 8 program to perform cube on list elements and filter numbers greater than 50.

public class CubeOfElements {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(4,5,6,7,1,2,3);
		
		list.stream()
			.map(i->i*i*i)
			.filter(i->i>50)
			.forEach(System.out::println);		
	}
}
