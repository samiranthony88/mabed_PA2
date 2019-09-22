package assignment2_p1;

import java.util.Scanner;

public class assignment2_p1b {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String input, tempStr = "abcd";
		char temp, temp2;
		int total, a,b,c,d;

		System.out.println("Enter encrypted integer: ");
		input = scnr.next();
		
		temp = input.charAt(0);
		temp2 = input.charAt(2);
		tempStr = tempStr.replace('a', temp2);
		tempStr = tempStr.replace('c', temp);
		temp = input.charAt(1);
		temp2 = input.charAt(3);
		tempStr = tempStr.replace('b', temp2);
		tempStr = tempStr.replace('d', temp);
		
		a = (Character.getNumericValue(tempStr.charAt(0))+13)%10;
		b = (Character.getNumericValue(tempStr.charAt(1))+13)%10;
		c = (Character.getNumericValue(tempStr.charAt(2))+13)%10;
		d = (Character.getNumericValue(tempStr.charAt(3))+13)%10;
		total = ((a*1000) + (b*100) + (c*10) + d);
		
		
		
		System.out.println("Decrypted Integer: " + total);

	}

}
