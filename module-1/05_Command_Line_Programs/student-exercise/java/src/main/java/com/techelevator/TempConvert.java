package com.techelevator;

import java.util.Scanner;

public class TempConvert {

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		System.out.print("Please enter the temperature: ");
		String value = input.nextLine();
		double temp = Double.parseDouble(value);

		System.out.print("Is the temperature in (c)elsius, or (f)ahrenheit? ");
		char type = input.next().charAt(0);

		if (type == 'f'){
			double tc =((temp - 32) / 1.8);
			System.out.print((int)temp + "f is " + (int)tc + "c");
		} else if(type == 'c') {
			double tf = (temp * 1.8 + 32);
			System.out.print((int)temp + "c is " +(int)tf + "f");
		}
	}
}




