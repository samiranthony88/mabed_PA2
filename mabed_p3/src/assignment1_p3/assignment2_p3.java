package assignment1_p3;

import java.util.Scanner;

public class assignment2_p3 {

	public static void main(String[] args) {
		String[] topics = {"Politics", "Swimming","Football","Video Games", "Food"};
		int[][] responses = new int[5][10];
		Scanner scnr = new Scanner(System.in);
		double average;
		
		for(int i=0;i<5;i++) {
				for(int j=0;j<10;j++) {
					System.out.println("Person #"+ (j+1) + ", rate " + topics[i] + " on a scale of 1-10: ");
					responses[i][j] = scnr.nextInt();
				}
			}
		System.out.println("Topics\t\t1\t2\t3\t4\t5\t6\t7\t8\t9\t10\tAvg Rating");
		for(int i=0;i<5;i++) {
			if(i==4) {
				System.out.print(topics[i] + "\t\t");
			}		else {
			System.out.print(topics[i] + "\t");
			}
			int total=0;
			for(int j=0;j<10;j++) {
				total += responses[i][j];
				System.out.print(responses[i][j] + "\t");
			}
			
			average = (double) total/10.0;
			System.out.printf("%.2f\n", average);
		}
		
		int max=0, min=1001;
		String maxStr="", minStr="";
		
		for(int i=0;i<5;i++) {
			int total = 0;
			for(int j=0;j<10;j++) {
				total += responses[i][j];
				
				if(total>max) {
					max = total;
					maxStr = topics[i];
				}
			}
		}
		
		for(int i=0;i<5;i++) {
			int total = 0;
			for(int j=0;j<10;j++) {
				total += responses[i][j];
				if(total<min) {
					min = total;
					minStr = topics[i];
				}
			}
		}
		
		System.out.println(maxStr + " is the topic that recieved the most point total.");
		System.out.println(minStr + " is the topic that recieved the least point total.");
		
		}
	}
