package com.alien.functional;

import java.util.Arrays;
import java.util.function.LongConsumer;

public class LongConsumerExample {

	public static void main(String[] args) {

		long[] lnums = { 13l, 3l, 6l, 1l, 8l };

		LongConsumer lcons = l -> System.out.print(l + " ");

		Arrays.stream(lnums).forEach(lcons);
	}
}
