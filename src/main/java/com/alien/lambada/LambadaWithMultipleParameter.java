package com.alien.lambada;

public class LambadaWithMultipleParameter {

	interface Inter1 {
		int operation(int a, int b);
	}

	interface Inter2 {
		void sayMessage(String message);
	}

	private int operate(int a, int b, Inter1 obj) {
		return obj.operation(a, b);
	}

	public static void main(String[] args) {

		Inter1 add = (x, y) -> x + y;

		Inter1 multiply = (x, y) -> x * y;

		LambadaWithMultipleParameter obj = new LambadaWithMultipleParameter();

		System.out.println("Addition is " + obj.operate(6, 3, add));

		System.out.println("Multiplication is " + obj.operate(6, 3, multiply));

		Inter2 fobj = message -> System.out.println("Hello " + message);
		fobj.sayMessage("Alien");
	}
}
