package com.alien.lambada;

import java.util.ArrayList;
import java.util.Collections;

public class LambadaWithArraylistSort {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(205);
		list.add(102);
		list.add(98);
		list.add(275);
		list.add(203);
		System.out.println("Elements of the ArrayList " + "before sorting : " + list);

		Collections.sort(list, (o1, o2) -> o1.compareTo(o2));

		System.out.println("Elements of the ArrayList after" + " Ascending sorting : " + list);

		Collections.sort(list, (o1, o2) -> -o1.compareTo(o2));

		System.out.println("Elements of the ArrayList after" + " Descending sorting : " + list);

	}
}
