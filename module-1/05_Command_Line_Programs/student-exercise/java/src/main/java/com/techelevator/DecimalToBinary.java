package com.techelevator;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {

		System.out.print("Please enter in a series of decimal values (separated by spaces): ");

		Scanner input = new Scanner(System.in);
		String numbers = input.nextLine();
		String[] binaryMath = numbers.split(" ");

		int[] actualNumbers = new int[binaryMath.length];
		for (int i = 0; i < binaryMath.length; i++) {
			actualNumbers[i] = Integer.parseInt(binaryMath[i]);
			int total = actualNumbers[i];
			System.out.println(total + " in binary is " + (Integer.toBinaryString(total)));
		}
	}
}
