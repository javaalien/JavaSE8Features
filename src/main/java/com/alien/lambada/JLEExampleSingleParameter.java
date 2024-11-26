package com.alien.lambada;

interface Prints {
	void print(String msg);
}

public class JLEExampleSingleParameter {

	public static void main(String[] args) {
		// without lambda expression
		Prints pr = new Prints() {

			@Override
			public void print(String msg) {
				System.out.println(msg);
			}
		};

		pr.print("Print message to console....");

		// with lambda expression

		Prints lambadaPrint = (msg) -> System.out.println(msg);
		lambadaPrint.print("Print message to console....");
	}
}
