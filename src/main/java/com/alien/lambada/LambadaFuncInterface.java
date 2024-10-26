package com.alien.lambada;

interface FuncInterface {

	void abstractFun(int x);

	default void normalFun() {
		System.out.println("Hello Default method");
	}
}

public class LambadaFuncInterface {

	public static void main(String[] args) {

		FuncInterface func = x -> System.out.println(2 * x);

		func.abstractFun(100);

	}
}
