package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class SquareRoot {
	public static void main(String[] args) {
		System.out.println("Enter a non negative number");
		Utility utility = new Utility();
		int num = utility.getInt();
		utility.sqrt(num);
	}
}
