package com.alien.employeeSalary;

import java.util.Arrays;
import java.util.List;

// Java Program To Print Employee Details Whose Age Is Greater Than 28

public class FilterEmployeesByAge {

	public static void main(String[] args) {

		List<Employee> employees = Arrays.asList(
				new Employee(1, "Aditi", 30, 100000, "F", "HR", "Mumbai"),
				new Employee(2, "Rahul", 25, 130000, "M", "Tech", "Bangalore"),
				new Employee(3, "Chetan", 34, 110000, "M", "Tech", "Pune"),
				new Employee(4, "Kavya", 45, 150000, "F", "HR", "Bangalore"));

		employees.stream().filter(e -> e.getAge() > 28).forEach(System.out::println);

	}
}
