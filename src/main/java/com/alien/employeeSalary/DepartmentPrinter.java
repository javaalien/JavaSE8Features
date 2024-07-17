package com.alien.employeeSalary;

import java.util.Arrays;
import java.util.List;

// Java Program to Print the Name of All Departments in the Organization


public class DepartmentPrinter {

	public static void main(String[] args) {

		List<Employee> employees = Arrays.asList(
				new Employee("Amit Singh", 34, "Male", "Finance", "Infosys"),
				new Employee("Deepa Patil", 29, "Female", "IT", "TCS"),
				new Employee("Rajesh Kumar", 42, "Male", "Finance", "Infosys"),
				new Employee("Lalitha Bhatt", 28, "Female", "HR", "Wipro"),
				new Employee("Suresh Raina", 30, "Male", "IT", "TCS"),
				new Employee("Gita Saxena", 31, "Female", "Marketing", "Infosys"));

		employees.stream()
				.map(Employee::getDeptName)
				.distinct()
				.forEach(System.out::println);

	}
}
