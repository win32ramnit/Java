package org.manish.amazon;

import java.util.Scanner;
public class CountTotalSetBits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number positive number: ");
		int number = sc.nextInt();
		int totalBits = 0;
		for(int i = 1; i <= number; i++) {
			totalBits += countsTotalBist(i);
		}
		
		System.out.println("Total set bits are: " +totalBits);

		sc.close(); // close Scanner
	}
	
	public static int countsTotalBist(int number) {
		int count = 0;
		while(0 != number) {
			if(0 != (number & 1)) {
				count++;
			}
			number = number >> 1;
		}	
		return count;
	}

}
