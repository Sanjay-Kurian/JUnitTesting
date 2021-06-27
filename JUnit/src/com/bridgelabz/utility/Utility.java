package com.bridgelabz.utility;

import java.util.Scanner;

public class Utility {
	Scanner scanner;
	public Utility()
	{
		scanner = new Scanner(System.in);
	}
	public int getInt()
	{
		return scanner.nextInt();
	}
	public float getFloat()
	{
		return scanner.nextFloat();
	}
	
	//Vending machine problem
	static int i = 0;
	static int total = 0;
	public int getRupeeNotes(int amount,int[] notes)
	{
		if (amount == 0)
		{
			return 0;
		}
		else if (amount >= notes[i])
		{
			int count = amount / notes[i];
			int remainder = amount % notes[i];
			amount = remainder;
			total = total + count;
			System.out.println(notes[i]+"Rs. notes"+count);
		}
		i++;
		return getRupeeNotes(amount,notes);
	}
	
	//Calculating the day of the week from given date
	public void dayOfWeek(int day,int month,int year)
	{
		int y = (year - (14 - month))/12;
		int x = y + y/4 + y/100 + y/400;
		int m = month + 12 * ((14 - month)/12) - 2;
		int d = (day + x + 31 * m /12)%7;
		System.out.println("The day is "+d);
	}
	//Converting Celsius to Fahrenheit
	public void celToFa(float cel)
	{
		float fahrenheit = ((cel * 9)/5)+32;
		System.out.println("The temperature in fahrenheit is "+fahrenheit);
	}
	//Converting Fahrenheit to Celsius
	public void faToCel(float fah)
	{
		float cel = (fah - 32) * 5/9;
		System.out.println("The temperature in fahrenheit is "+cel);
	}
	//Computing the monthly payment
	public void payment(int p,int rate,int y)
	{
		int n = 12*y;
		float r = rate / (12 * 100);
		double payment = (p*r)/(1-(Math.pow((1+r), -n)));
		System.out.println("You have to pay "+payment+" over "+y+" years");
	}
	//Computing the square root of a given number using newtons method 
	public void sqrt(int num)
	{
		float t;
		t = num;
		double epsilon = 1e-4;
		while (Math.abs(t-num/t) > (epsilon*t))
		{
			t = (t + num/t)/2; 
		}
		System.out.println("The square root of the number is "+t);
	}
	//Convert decimal number to binary number
	public void toBinary(int num)
	{
		int[] binary = new int[32];
		int i = 0;
		while (num>0)
		{
			binary[i] = num%2;
			num = num/2;
			i++;
		}
		for(int j=i-1;j>=0;j--)
		{
			System.out.print(binary[j]);
		}
	}
}
