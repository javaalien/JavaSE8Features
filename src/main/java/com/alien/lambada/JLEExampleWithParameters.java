package com.alien.lambada;

interface Sayable {
	public String say();
}

interface Printable {
	void print(String msg);
}

interface Addable {
	int add(int a, int b);
}

public class JLEExampleWithParameters {

	public static void main(String[] args) {

		// Java Lambda Expression Example: No Parameter
		Sayable withLambdaNoArg = () -> {
			return "Return something ..";
		};
		withLambdaNoArg.say();

		// Java Lambda Expression Example: Single Parameter
		Printable withLambdaSingleArg = (msg) -> System.out.println(msg);
		withLambdaSingleArg.print("Print message to console....");

		// Java Lambda Expression Example: Multiple Parameters
		Addable withLambdaTwoArg = (int a, int b) -> (a + b);
		System.out.println(withLambdaTwoArg.add(100, 200));

	}

}
