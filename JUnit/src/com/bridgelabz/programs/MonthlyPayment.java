package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class MonthlyPayment {
	public static void main(String[] args) {
		System.out.println("Enter principle amount");
		Utility utility = new Utility();
		int principle = utility.getInt();
		System.out.println("Enter rate");
		int rate = utility.getInt();
		System.out.println("Enter year");
		int year = utility.getInt();
		utility.payment(principle, rate, year);
	}
}
