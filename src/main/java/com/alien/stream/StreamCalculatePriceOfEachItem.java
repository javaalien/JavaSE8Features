package com.alien.stream;

import java.util.ArrayList;
import java.util.List;

public class StreamCalculatePriceOfEachItem {

	public static void main(String[] args) {

		List<Fruits> fr = new ArrayList<>();

		fr.add(new Fruits("Apple", 30, 5));
		fr.add(new Fruits("Banana", 70, 7));
		fr.add(new Fruits("Mango", 80, 8));
		fr.add(new Fruits("Pinapple", 120, 15));
		fr.add(new Fruits("Orange", 230, 10));

		fr.stream().forEach(fruit -> {
			double price = fruit.getPrice() * fruit.getQuantity();

			System.out.println(fruit.getName() + "  =  Total Price: " + price);
		});
	}
}

class Fruits {

	private String name;
	private double price;
	private int quantity;

	public Fruits(String name, double price, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}