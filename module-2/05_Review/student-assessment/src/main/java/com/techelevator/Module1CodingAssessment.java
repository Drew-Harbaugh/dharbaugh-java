package com.techelevator;

import java.util.Scanner;

public class Module1CodingAssessment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner input = new Scanner(System.in);
		System.out.print("What kind of bouquet would you like?: ");
		String value = input.nextLine();

		System.out.print("How many roses would you like?: ");
		value = input.nextLine();

		System.out.print("Is this order same day delivery? (y,n): ");
		value = input.nextLine();

		System.out.print("What is your zip code?: ");
		value = input.nextLine();


		Boolean sameDayDelivery = true;
		double deliveryFee = 0;
		int zipcode = 0;

		if(zipcode >= 20000 && zipcode <= 29999){
				deliveryFee = 3.99;
				if(sameDayDelivery){
					deliveryFee += 5.99;
				}

		}


	}

}
