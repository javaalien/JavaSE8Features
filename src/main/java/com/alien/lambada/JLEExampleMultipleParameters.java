package com.alien.lambada;

interface Addable1 {
	int add(int a, int b);
}

public class JLEExampleMultipleParameters {

	public static void main(String[] args) {
		// without lambda expression

		Addable1 addable = new Addable1() {

			@Override
			public int add(int a, int b) {
				return a + b;
			}
		};

		System.out.println(addable.add(20, 30));

		// with lambda expression
		// Multiple parameters in lambda expression

		Addable1 withLambada = (a, b) -> a + b;
		System.out.println(withLambada.add(30, 40));
	}

}
