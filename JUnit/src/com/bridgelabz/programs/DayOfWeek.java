package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class DayOfWeek {
	public static void main(String[] args) {
		System.out.println("Enter month");
		Utility utility = new Utility();
		int month = utility.getInt();
		System.out.println("Enter day");
		int day = utility.getInt();
		System.out.println("Enter year");
		int year = utility.getInt();
		utility.dayOfWeek(day, month, year);
	}
}
