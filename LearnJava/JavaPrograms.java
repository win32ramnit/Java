package org.manish.LearnJava;

import java.util.Scanner;

public class JavaPrograms {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ProgramsUtility pu = new ProgramsUtility();
		int choice = 0;
		do {
			System.out.println("1: Fibonacci Series");
			System.out.println("2: Prme Number");
			System.out.println("3: Palindrome Number");
			System.out.println("4: Factorial Number");
			System.out.println("5: Armstrong Number");
			System.out.println("6: Bubble Sort");
			System.out.println("7: Selection Sort");
			System.out.println("8: Insertion Sort");
			System.out.println("9: Exit");
			
			try {
				String str = sc.next();
				choice = Integer.parseInt(str);
				switch(choice) {
					case 1:
						int number;
						System.out.println("Enter a number :");
						number = sc.nextInt();
						pu.Fibonacci(number);
						break;
					case 9:
						System.exit(0);
				}
			 	
			} catch(Exception e) {
				System.out.println("Error: Enter integre!!\n");
			}
			
		} while(9 != choice);

		
		
		sc.close(); // close scanner
	}

}
