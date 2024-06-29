package com.alien.datetime;

import java.time.LocalDate;
import java.time.Month;

// Check Whether the Given Year is Leap Year or Not in Java

public class CheckLeapYearJava8 {

	public static void main(String[] args) {
		checkIfYearIsLeapYear();
	}

	private static void checkIfYearIsLeapYear() {
		LocalDate localDate1 = LocalDate.of(2024, Month.JANUARY, 1);
		LocalDate localDate2 = LocalDate.of(2023, Month.JANUARY, 1);

		if (localDate1.isLeapYear()) {
			System.out.println(localDate1.getYear() + " is a leap year");
		} else {
			System.out.println(localDate1.getYear() + " is not a leap year");
		}

		if (localDate2.isLeapYear()) {
			System.out.println(localDate2.getYear() + " is a leap year");
		} else {
			System.out.println(localDate2.getYear() + " is not a leap year");
		}
	}

}
