// Program 2: Binary Calculator

package week3;

import java.util.Scanner;

public class Program2 {
	
	static Scanner inputscanner = new Scanner(System.in);
	public static void main(String[] args) {
		
//		Introduce program and get X value from user.
		System.out.print("Welcome! This program takes two user-input binary numbers and performs various operations on"
				+ " them, printing the results to the\nconsole.\n\nPlease enter a value for variable X (in binary form"
				+ "): ");
		String xbin = inputscanner.nextLine();
		int xint = (Integer.parseInt(xbin, 2));
		
//		Get Y value from user.
		System.out.print("Please enter a value for variable Y (in binary form): ");
		String ybin = inputscanner.nextLine();
		int yint = (Integer.parseInt(ybin, 2));
		
//		Print operation results.
		System.out.format("X + Y = %s\n", Integer.toBinaryString(xint + yint));
		System.out.format("X - Y = %s\n", Integer.toBinaryString(xint - yint));
		System.out.format("X × Y = %s\n", Integer.toBinaryString(xint * yint));
		System.out.format("X ÷ Y = %s\n", Integer.toBinaryString(xint / yint));
		
	}

}
