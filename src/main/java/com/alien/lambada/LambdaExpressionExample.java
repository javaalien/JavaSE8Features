package com.alien.lambada;

//Java Simple Lambda Expression Example

interface Drawable {
	public void draw();
}

public class LambdaExpressionExample {

	public static void main(String[] args) {
		int width = 10;
		// without lambda, Drawable implementation using anonymous class
		Drawable withoutLambda = new Drawable() {
			@Override
			public void draw() {
				System.out.println("Drawing " + width);
			}
		};

		withoutLambda.draw();

		// with lambda
		Drawable withLambada = () -> {
			System.out.println("Drawing " + width);
		};

		withLambada.draw();
	}

}
