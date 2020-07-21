package com.Manage.bags;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		double userinput; // intialize the varibales
		int fourKg, twoKg = 0, oneKg = 0;

		Scanner input = new Scanner(System.in);
		System.out.print("Enter Weightage(Kg) of the Rice needed to Package: ");
		userinput = input.nextDouble(); // getting user inputs

		// checking validity of the entered number
		while (userinput % 0.5 != 0) {

			System.out.println("----Invalid weight----");
			System.out.print("Please Enter Valid weightage:");
			userinput = input.nextDouble();

		}

		userinput = userinput * 1000; // convert weight to gram

		fourKg = (int) (userinput / 4000); //checking how many Four kg bags needed
		userinput = userinput % 4000;  

		twoKg = (int) (userinput / 2000); //checking how many two kg bags needed
		userinput = userinput % 2000;

		while (userinput != 0) {              
			oneKg = (int) (userinput / 1000); //checking how many One kg bags needed
			userinput = userinput % 1000;
			if (userinput == 500) {  
				oneKg++;  // calcualte remaining 500kg as a one kg bag
				userinput = 0;  //stop the loop when finally calculate the last bag
			}
		}

		System.out.println("1. 4Kg Bags: " + fourKg);
		System.out.println("2. 2Kg Bags: " + twoKg);
		System.out.println("3. 1Kg Bags: " + oneKg);

	}

}
