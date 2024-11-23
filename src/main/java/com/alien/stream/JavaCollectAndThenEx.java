package com.alien.stream;

import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class JavaCollectAndThenEx {

	public static void main(String[] args) {

		List<Integer> list = List.of(230, 210, 120, 250, 300);

		String avgPrice = list.stream()
				.collect(Collectors.collectingAndThen(Collectors.averagingInt(Integer::intValue), avg -> {
					NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("en", "US"));
					return nf.format(avg);
				}));

		System.out.printf("The average price is %s%n", avgPrice);

	}
}
