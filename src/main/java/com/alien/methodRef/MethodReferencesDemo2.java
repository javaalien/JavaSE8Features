package com.alien.methodRef;

import java.util.function.BiFunction;
import java.util.function.Function;

import javax.annotation.processing.AbstractProcessor;

public class MethodReferencesDemo2 {

	public static int addition(int a, int b) {
		return (a + b);
	}

	public static void main(String[] args) {

		Function<Integer, Double> function = (input) -> Math.sqrt(input);

		System.out.println(function.apply(25));

		Function<Integer, Double> functionRef = Math::sqrt;
		System.out.println(functionRef.apply(25));

		BiFunction<Integer, Integer, Integer> biFunctionLambada = (a, b) -> MethodReferencesDemo2.addition(a, b);

		System.out.println(biFunctionLambada.apply(10, 20));

		BiFunction<Integer, Integer, Integer> biFunction = MethodReferencesDemo2::addition;
		System.out.println(biFunction.apply(10, 20));

	}
}
