package com.alien.employeeSalary;

import java.util.Arrays;
import java.util.List;

// Java Program To Print Average Age of Male and Female Employees

public class CalculateAverageAge {

	public static void main(String[] args) {

		List<Employee> employees = Arrays.asList(
				new Employee(1, "Aditi", 30, 100000, "F", "HR", "Mumbai"),
				new Employee(2, "Rahul", 25, 130000, "M", "Tech", "Bangalore"),
				new Employee(3, "Vishal", 34, 110000, "M", "Tech", "Mumbai"),
				new Employee(4, "Lakshmi", 45, 150000, "F", "HR", "Bangalore"));

		double maleAverage = employees.stream().filter(e -> "M".equals(e.getGender()))
							.mapToInt(Employee::getAge).average().orElse(0.0);

		double femaleAverage = employees.stream().filter(e -> "F".equals(e.getGender()))
							.mapToInt(Employee::getAge).average().orElse(0.0);
		
		System.out.println("Average age of male employees: " + maleAverage);
        System.out.println("Average age of female employees: " + femaleAverage);

	}
}
