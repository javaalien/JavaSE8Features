package com.alien.employeeSalary;

import java.util.Calendar;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Employee {

	private int id;
	private String name;
	private int age;
	long salary;
	private String gender;
	private String deptName;
	private String city;
	private String organization;
	private int yearOfJoining;

	public Employee(String name, String gender, String organization) {
		super();
		this.name = name;
		this.gender = gender;
		this.organization = organization;
	}

	public Employee(String name, int age, String gender, String deptName, String organization) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.deptName = deptName;
		this.organization = organization;
	}

	public Employee(int id, String name, int age, long salary, String gender, String deptName, String city) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.gender = gender;
		this.deptName = deptName;
		this.city = city;
	}

	public Employee(int id, String name, int age, long salary, String gender, String deptName, String city,
			int yearOfJoining) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.gender = gender;
		this.deptName = deptName;
		this.city = city;
		this.yearOfJoining = yearOfJoining;
	}

	public int getExperience() {
		return Calendar.getInstance().get(Calendar.YEAR) - yearOfJoining;
	}
}
