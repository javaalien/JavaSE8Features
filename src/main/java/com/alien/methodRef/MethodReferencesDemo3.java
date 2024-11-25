package com.alien.methodRef;

@FunctionalInterface
interface Printable {
	void print(String msg);
}

public class MethodReferencesDemo3 {

	public void display(String msg) {
		msg = msg.toUpperCase();
		System.out.println(msg);
	}

	public static int addition(int a, int b) {
		return (a + b);
	}

	public static void main(String[] args) {

		MethodReferencesDemo3 methodReferencesDemo = new MethodReferencesDemo3();

		Printable printable = (msg) -> methodReferencesDemo.display(msg);

		printable.print("Hello world !!");

		Printable printableMethodRef = methodReferencesDemo::display;

		printableMethodRef.print("Hello World !!");
	}
}
