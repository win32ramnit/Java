package org.manish.LearnJava;

import java.util.Scanner;

public class ProgramsUtility {
	Scanner sc = new Scanner(System.in);
	public ProgramsUtility() {
	}

	public void Fibonacci(int number) {
		
		int num1 = 0, num2 = 1, temp = 0;
		System.out.print("\n"+num1+" "+num2+" ");
		while(temp <= number) {
			temp = num1 + num2;
			System.out.print(temp+ " ");
			num1 = num2;
			num2 = temp;
		}
		System.out.println();
	}
	
	
}
