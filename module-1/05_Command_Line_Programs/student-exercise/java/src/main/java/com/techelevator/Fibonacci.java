package com.techelevator;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter the Fibonacci number: ");
		String number = input.nextLine();
		int value = Integer.parseInt(number);

		int n = value, resultOne = 0, resultTwo = 1;
		for (int i = 0; i <= n; ++i) {
			int sum = resultOne + resultTwo;
			resultOne = resultTwo;
			resultTwo = sum;

			System.out.print(resultOne + " + ");

			} // I ran out of time. I was trying to figure out how to stop the count at or before the number provided
		}
	}


