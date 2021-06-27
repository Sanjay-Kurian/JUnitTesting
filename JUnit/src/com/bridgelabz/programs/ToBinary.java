package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class ToBinary {
	public static void main(String[] args) {
		System.out.println("Enter the number which needs to be converted to binary");
		Utility utility = new Utility();
		int num = utility.getInt();
		utility.toBinary(num);
	}
}
