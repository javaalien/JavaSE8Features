package com.alien.lambada;

import java.util.ArrayList;

public class LambadaWithArrayList {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);

		System.out.print("All Elements from List :");
		list.forEach(n -> System.out.print(n + " "));
		System.out.print("\nOnly Even : ");
		list.forEach(n -> {
			if (n % 2 == 0)
				System.out.print(n + " ");
		});

	}

}
