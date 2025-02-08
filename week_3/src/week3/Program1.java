// Program 1: Calculator

package week3;

import java.util.Scanner;

public class Program1 {
	
	static Scanner inputscanner = new Scanner(System.in);
	public static void main(String[] args) {
		
//		Introduce program and get X value from user.
		System.out.print("Welcome! This program takes two user-input decimal numbers and performs various operations "
				+ "on them, printing the results\nto the console.\n\nPlease enter a value for variable X (in integer "
				+ "or decimal form): ");
		double x = inputscanner.nextDouble();
		inputscanner.nextLine();
		
//		Get Y value from user.
		System.out.print("Please enter a value for variable Y (in integer or decimal form): ");
		double y = inputscanner.nextDouble();
		inputscanner.nextLine();
		
//		Print operation results.
		System.out.format("X + Y = %.2f\n", x + y);
		System.out.format("X × Y = %.2f\n", x * y);
		System.out.format("X ÷ Y = %.2f\n", x / y);
		System.out.format("X ^ Y = %.2f\n", Math.pow(x, y));
		System.out.format("Log Y (X) = %.2f\n", Math.log(x) / Math.log(y));
		
	}

}
