package com.alien.employeeSalary;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;

// Java Program To Find the Department Name Which Has the Highest Number of Employees

public class FindLargestDepartment {

	public static void main(String[] args) {

		List<Employee> employees = Arrays.asList(
				new Employee(1, "Aditi", 30, 100000, "F", "HR", "Mumbai"),
				new Employee(2, "Rahul", 25, 130000, "M", "Engineering", "Bangalore"),
				new Employee(3, "Vishal", 34, 110000, "M", "Engineering", "Mumbai"),
				new Employee(4, "Lakshmi", 28, 150000, "F", "HR", "Bangalore"),
				new Employee(5, "Priya", 24, 90000, "F", "Marketing", "Delhi"));

		Map<String, Long> departmentCounts = employees.stream()
				.collect(Collectors.groupingBy(Employee::getDeptName, Collectors.counting()));

		Optional<Entry<String, Long>> maxDept = departmentCounts.entrySet().stream().max(Map.Entry.comparingByValue());

		if (maxDept.isPresent()) {
			System.out.println("Department with the most employees: " + maxDept.get().getKey() + " ("
					+ maxDept.get().getValue() + " employees)");
		} else {
			System.out.println("No departments found.");
		}
	}
}
