package com.nt.stream;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.YearMonth;
import java.util.stream.IntStream;

//Find the 2nd week of Friday 
public class SecondWeekFriday {

	public static void main(String[] args) {
		YearMonth ym = YearMonth.of(2025, 12);

		LocalDate secondFriday = IntStream.rangeClosed(8, 14).mapToObj(day -> ym.atDay(day))
		                            .filter(date -> date.getDayOfWeek() == DayOfWeek.FRIDAY)
		                            .findFirst().get();
		
		System.out.println(secondFriday);
 	}

}
