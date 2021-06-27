package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class VendingMachine {
	public static void main(String[] args) {
		System.out.println("Enter the amount");
		Utility utility = new Utility();
		int amount = utility.getInt();
		int[] notes = {1000,500,100,50,10,5,2,1};
		utility.getRupeeNotes(amount, notes);
	}
}
