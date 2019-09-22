package assignment2_p2;

import java.util.Scanner;

public class assignment2_p2 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int selection;
		double weightLb, weightKg, heightCm, heightFt, heightIn, totalBMI;
		
		System.out.println("Choose which formula:\n(1) Calculate with standard\n(2) Calculate with metric");
		System.out.println("Enter 1 or 2: ");
		selection = scnr.nextInt();
		
		switch(selection) {
		
		case 1:
			System.out.println("Enter your height(ft in)[EXAMPLE FORMAT: 6 10]: ");
			heightFt = scnr.nextDouble();
			heightIn = scnr.nextDouble();
			System.out.println("Enter your weight(pounds): ");
			weightLb = scnr.nextDouble();
			heightIn = heightIn + (12 * heightFt);
			totalBMI = (703*weightLb)/(Math.pow(heightIn, 2));
			System.out.printf("Your BMI total is: %.1f", totalBMI);
			break;
		case 2:	
			System.out.println("Enter your height in centimeters: ");
			heightCm = scnr.nextDouble();
			System.out.println("Enter your weight in kilograms: ");
			weightKg = scnr.nextDouble();
			totalBMI = (weightKg)/(Math.pow((heightCm/100),2));
			System.out.printf("Your total BMI is: %.1f", totalBMI);
			break;
		default: 
			System.out.println("Invalid selection.");
			break;
		}
		
		System.out.println("\n\nBMI Categories:");
		System.out.println("Underweight = <18.5");
		System.out.println("Normal weight = 18.5–24.9");
		System.out.println("Overweight = 25–29.9 ");
		System.out.println("Obesity = BMI of 30 or greater");
	}

}
