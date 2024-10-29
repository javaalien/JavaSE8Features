package com.alien.functional;

import java.util.Arrays;
import java.util.function.IntConsumer;

public class IntConsumerExample {

	public static void main(String[] args) {

		int[] inums = { 3, 5, 6, 7, 5 };

		IntConsumer icons = i -> System.out.print(i + " ");

		Arrays.stream(inums).forEach(icons);

	}
}
