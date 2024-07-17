package com.alien.employeeSalary;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// Java Program to Group the Employees by Age

public class GroupEmployeesByAge {

	public static void main(String[] args) {

		List<Employee> employees = Arrays.asList(
				new Employee(1, "Aditi", 30, 100000, "F", "HR", "Mumbai"),
				new Employee(2, "Rahul", 34, 130000, "M", "Tech", "Bangalore"),
				new Employee(3, "Vishal", 34, 110000, "M", "Tech", "Mumbai"),
				new Employee(4, "Kavya", 45, 150000, "F", "HR", "Pune"));

		Map<Integer, List<Employee>> groupedByAge = employees.stream().collect(Collectors.groupingBy(Employee::getAge));

		groupedByAge.forEach((age, empList) -> {
			System.out.println("Age :" + age);
			empList.forEach(System.out::println);
		});
	}
}
