package assignment2_p1;
import java.util.Scanner;

public class assignment1_p1 {

	public static void main(String[] args) {
	
				
				Scanner scnr = new Scanner(System.in);
				int userInput, a,b,c,d, total;
				String intStr;
				
				System.out.println("Enter your number: ");
				userInput = scnr.nextInt();
				intStr = Integer.toString(userInput);
				
				a = (Character.getNumericValue(intStr.charAt(0))+7)%10;
				b = (Character.getNumericValue(intStr.charAt(1))+7)%10;
				c = (Character.getNumericValue(intStr.charAt(2))+7)%10;
				d = (Character.getNumericValue(intStr.charAt(3))+7)%10;
				total = ((a*1000) + (b*100) + (c*10) + d);
				intStr = Integer.toString(total);
							
				
				char temp,temp2;
				
				String finalStr = "abcd";
				
				temp = intStr.charAt(0);
				temp2 = intStr.charAt(2);
				finalStr = finalStr.replace('a', temp2);
				finalStr = finalStr.replace('c', temp);
				temp = intStr.charAt(1);
				temp2 = intStr.charAt(3);
				finalStr = finalStr.replace('b', temp2);
				finalStr = finalStr.replace('d', temp);
				
				
				// I left it as a string for the change that the first digit becomes a 0. (1234 as input)
				 
				System.out.println("Encrypted Integer: " + finalStr);		
	}

}
