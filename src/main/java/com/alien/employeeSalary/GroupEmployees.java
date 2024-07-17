package com.alien.employeeSalary;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// Java Program to Group the Employees by City

public class GroupEmployees {

	public static void main(String[] args) {

		List<Employee> employees = Arrays.asList(
				new Employee(1, "Aditi", 30, 100000, "F", "HR", "Mumbai"),
				new Employee(2, "Rahul", 34, 130000, "M", "Tech", "Bangalore"),
				new Employee(3, "Kavya", 28, 110000, "M", "Tech", "Mumbai"),
				new Employee(4, "Chetan", 45, 150000, "M", "Developer", "Pune"));

		Map<String, List<Employee>> groupedByCity = employees.stream()
							.collect(Collectors.groupingBy(Employee::getCity));
		
		groupedByCity.forEach((city,empList)->{
			System.out.println("City :"+city);
			empList.forEach(System.out::println);
		});
	}
}
