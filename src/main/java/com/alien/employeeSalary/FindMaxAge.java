package com.alien.employeeSalary;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

// Java Program To Find Maximum Age of Employee

public class FindMaxAge {

	public static void main(String[] args) {

		List<Employee> employees = Arrays.asList(
				new Employee(1, "Aditi", 30, 100000, "F", "HR", "Mumbai"),
				new Employee(2, "Rahul", 25, 130000, "M", "Tech", "Bangalore"),
				new Employee(3, "Vishal", 34, 110000, "M", "Tech", "Mumbai"),
				new Employee(4, "Lakshmi", 45, 150000, "F", "HR", "Bangalore"));

		Optional<Integer> maxAge = employees.stream().map(Employee::getAge).max(Integer::compare);

		maxAge.ifPresent(age -> System.out.println("Max Age is :" + age));
		
	}
}
