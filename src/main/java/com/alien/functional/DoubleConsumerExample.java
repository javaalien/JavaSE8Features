package com.alien.functional;

import java.util.Arrays;
import java.util.function.DoubleConsumer;

public class DoubleConsumerExample {

	public static void main(String[] args) {

		double[] dnums = { 3.4d, 9d, 6.8d, 10.3d, 2.3d };

		DoubleConsumer dcons = d -> System.out.print(d + " ");

		Arrays.stream(dnums).forEach(dcons);

	}
}
