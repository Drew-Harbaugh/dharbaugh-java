package com.techelevator;

import java.util.Scanner;

public class LinearConvert {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Please enter the measurement: ");
		String value = input.nextLine();
		double size = Double.parseDouble(value);

		System.out.print("Is the measurement in (m)eter, or (f)eet? ");
		char type = input.next().charAt(0);

		if (type == 'm'){
			double toFeet =(size * 3.2808399);
			System.out.print((int)size + "m is " + (int)toFeet + "f");
		} else if(type == 'f') {
			double toMeters = (size * 0.3048);
			System.out.print((int)size + "f is " + (int)toMeters + "m");
		}
	}
}