package com.alien.datetime;

import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DateTimeAPIs {

	public static void main(String[] args) {

		System.out.println("Getting current date and time with Clock");
		Clock clock = Clock.systemDefaultZone();
		Instant now = clock.instant();
		System.out.println(now);
		System.out.println("============================================================");
		System.out.println("Duration Between Two LocalDate in Java");

		LocalDate today = LocalDate.now(); // 1

		// Second LocalDate
		LocalDate sameDayNextMonth = LocalDate.now().plusMonths(1); // 2

		// Difference between dates
		Duration duration = Duration.between(today.atStartOfDay(), sameDayNextMonth.atStartOfDay());

		// Verify differences
		System.out.println(duration.toDays());
		System.out.println(duration.toHours());
		System.out.println(duration.toMinutes());
		System.out.println(duration.toMillis());
		System.out.println("============================================================");

		System.out.println("Get Day Month and Year from LocalDateTime in Java");

		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println("Year : " + dateTime.getYear());
		System.out.println("Month : " + dateTime.getMonth().getValue());
		System.out.println("Day of Month : " + dateTime.getDayOfMonth());
		System.out.println("Day of Week : " + dateTime.getDayOfWeek());
		System.out.println("Day of Year : " + dateTime.getDayOfYear());

		System.out.println("============================================================");

		System.out.println("Get Number of Days from Month and Year using LocalDate in Java");

		LocalDate localDate1 = LocalDate.of(2017, Month.JANUARY, 1);
		LocalDate localDate2 = LocalDate.of(2016, Month.FEBRUARY, 1);

		// Number of days in a month
		System.out.println("Number of days in " + localDate1.getMonth() + " : " + localDate1.lengthOfMonth());
		System.out.println("Number of days in " + localDate2.getMonth() + " : " + localDate2.lengthOfMonth());

		// Number of days in a year
		System.out.println("Number of days in " + localDate1.getYear() + " : " + localDate1.lengthOfYear());
		System.out.println("Number of days in " + localDate2.getYear() + " : " + localDate2.lengthOfYear());

		System.out.println("============================================================");

		System.out.println("Add Days Weeks Months  and Years to LocalDate in Java");

		LocalDate localDate = LocalDate.now();

		// LocalDate's plus methods
		System.out.println("Addition of days : " + localDate.plusDays(5));
		System.out.println("Addition of months : " + localDate.plusMonths(15));
		System.out.println("Addition of weeks : " + localDate.plusWeeks(45));
		System.out.println("Addition of years : " + localDate.plusYears(5));

		System.out.println("============================================================");

		System.out.println("LocalTime getHour(), getMinute(), getSecond() and getNano() Example");

		LocalTime localTime = LocalTime.now();
		System.out.println("Gets the hour-of-day field : " + localTime.getHour());
		System.out.println("Gets the minute-of-hour field : " + localTime.getMinute());
		System.out.println("Gets the second-of-minute field : " + localTime.getSecond());
		System.out.println("Gets the nano-of-second field : " + localTime.getNano());
		
		System.out.println("============================================================");
		
		System.out.println("Difference between Two Dates in Java");
		
		LocalDate ld1 = LocalDate.of(2018, 1, 1);
        LocalDate ld2 = LocalDate.of(2019, 3, 1);

        System.out.println("\nLocalDate case: " + ld1 + " <-> " + ld2);

        long betweenInDays = Math.abs(ChronoUnit.DAYS.between(ld1, ld2));
        long betweenInMonths = Math.abs(ChronoUnit.MONTHS.between(ld1, ld2));
        long betweenInYears = Math.abs(ChronoUnit.YEARS.between(ld1, ld2));
        long untilInDays = Math.abs(ld1.until(ld2, ChronoUnit.DAYS));
        long untilInMonths = Math.abs(ld1.until(ld2, ChronoUnit.MONTHS));
        long untilInYears = Math.abs(ld1.until(ld2, ChronoUnit.YEARS));
        Period period = ld1.until(ld2);
        System.out.println(
            "Difference as Period: " + period.getYears() + "y" + period.getMonths() + "m" + period.getDays() + "d");
        System.out.println("Difference in days is via between(): " + betweenInDays);
        System.out.println("Difference in months is via between(): " + betweenInMonths);
        System.out.println("Difference in years is via between(): " + betweenInYears);
        System.out.println("Difference in days is via until(): " + untilInDays);
        System.out.println("Difference in months is via until(): " + untilInMonths);
        System.out.println("Difference in years is via until(): " + untilInYears);

        LocalDateTime ldt1 = LocalDateTime.of(2018, 1, 1, 22, 15, 15);
        LocalDateTime ldt2 = LocalDateTime.of(2018, 1, 1, 23, 15, 15);

        System.out.println("\nLocalDateTime case: " + ldt1 + " <-> " + ldt2);

        long betweenInMinutesWithoutZone = Math.abs(ChronoUnit.MINUTES.between(ldt1, ldt2));
        long untilInMinutesWithoutZone = Math.abs(ldt1.until(ldt2, ChronoUnit.HOURS));
        System.out.println("Difference in minutes without zone: " + betweenInMinutesWithoutZone);
        System.out.println("Difference in hours without zone: " + untilInMinutesWithoutZone);
        
        
        System.out.println("============================================================");
	}

}
