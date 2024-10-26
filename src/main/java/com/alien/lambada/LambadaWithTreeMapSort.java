package com.alien.lambada;

import java.util.Comparator;
import java.util.TreeMap;

class Doctor {

	private int id;
	private String name;

	public Doctor(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Doctor [id=" + id + ", name=" + name + "]";
	}
}

class MyNameComparator implements Comparator<Doctor> {

	@Override
	public int compare(Doctor o1, Doctor o2) {

		return o1.getName().compareTo(o2.getName());
	}
}

public class LambadaWithTreeMapSort {

	public static void main(String[] args) {

		TreeMap<Doctor, String> map = new TreeMap<>(new MyNameComparator());
		map.put(new Doctor(1, "bhetan"), "Apple");
		map.put(new Doctor(4, "kavya"), "Mango");
		map.put(new Doctor(5, "akhu"), "Orange");
		map.put(new Doctor(2, "chetan"), "Banana");
		map.put(new Doctor(3, "dhanya"), "Grapes");

		System.out.println("Elements of the TreeMap " + "after sorting are : " + map);

	}
}
