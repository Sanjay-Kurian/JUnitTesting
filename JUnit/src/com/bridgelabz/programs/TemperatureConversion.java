package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class TemperatureConversion {
	public static void main(String[] args) {
		System.out.println("Enter 1.Celsius to Fahrenheit 2.Fahrenheit to Celsius");
		Utility utility = new Utility();
		int choice = utility.getInt();
		if (choice == 1)
		{
			System.out.println("Enter the temperature in celsius");
			float celsius = utility.getFloat();
			utility.celToFa(celsius);
		}
		else
		{
			System.out.println("Enter the temperature in fahrenheit");
			float fahrenheit = utility.getFloat();
			utility.faToCel(fahrenheit);
		}
	}
}
