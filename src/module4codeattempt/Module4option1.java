package module4codeattempt;

import java.util.Scanner;

public class Module4option1 {

	public static void main(String[] args) {
		// Program to enter 5 user input floating data points and print out the total of the points,
		// calculate the average, maximum, minimum, and interest of 20% on the total utilizing a while-loop.
		Scanner scnr = new Scanner(System.in);
		float inputTotal = 0;
		float inputAverage = 0;
		float inputMaximum = 0;
		float inputMinimum = 0;
		float inputInterest = 0;
		boolean keepEntering = true;
		
		while (keepEntering) {
			System.out.println("Please enter the first data point: ");
			float no1 = scnr.nextFloat();
				if (no1 != 0) {
					inputMaximum = no1;
				}
				if (no1 != 0) {
					inputMinimum = no1;
				}
			
			System.out.println("Please enter the second data point: ");
			float no2 = scnr.nextFloat();
				if (no2 > inputMaximum) {
					inputMaximum = no2;
				}
				if (no2 < inputMinimum) {
					inputMinimum = no2;
				}
			
			System.out.println("Please enter a third data point: ");
			float no3 = scnr.nextFloat();
				if (no3 > inputMaximum) {
					inputMaximum = no3;
				}
				if (no3 < inputMinimum) {
					inputMinimum = no3;
				}
			
			System.out.println("Please enter a fourth data point: ");
			float no4 = scnr.nextFloat();
				if (no4 > inputMaximum) {
					inputMaximum = no4;
				}
				if (no4 < inputMinimum) {
					inputMinimum = no4;
				}
			
			System.out.println("Please enter a final data point: ");
			float no5 = scnr.nextFloat();
				if (no5 > inputMaximum) {
					inputMaximum = no5;
				}
				if (no5 < inputMinimum) {
					inputMinimum = no5;
				}
			
			System.out.println("Calculating inputs...");
			
			inputTotal = no1 + no2 + no3 + no4 + no5;
			System.out.println("Total: " + inputTotal);
			
			inputAverage = inputTotal / 5;
			System.out.println("Average: " + inputAverage);
			
			System.out.println("Maximum: " + inputMaximum);
			
			System.out.println("Minimum: " + inputMinimum);
			
			inputInterest = (float) (inputTotal * .2);
			System.out.println("20% interest: " + inputInterest);
			
			System.out.println("Do you wish to keep entering data points? Please enter 'y' for yes, 'n' for no.");
			String decision = scnr.next();
			if (!decision.equalsIgnoreCase("y")) {
				keepEntering = false;
			}
		}
		

	}

}
