package com.alien.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product {

	private int id;
	private String name;
	private float price;

	public Product(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
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

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
}

public class FilterStreamExample2 {

	public static void main(String[] args) {
		List<Product> filteredProducts = getProducts().stream().filter((product) -> product.getPrice() > 25000f)
				.collect(Collectors.toList());

		filteredProducts.forEach(System.out::println);
	}

	private static List<Product> getProducts() {
		List<Product> productsList = new ArrayList<Product>();
		productsList.add(new Product(1, "HP Laptop", 25000f));
		productsList.add(new Product(2, "Dell Laptop", 30000f));
		productsList.add(new Product(3, "Lenevo Laptop", 28000f));
		productsList.add(new Product(4, "Sony Laptop", 28000f));
		productsList.add(new Product(5, "Apple Laptop", 90000f));
		return productsList;
	}
}