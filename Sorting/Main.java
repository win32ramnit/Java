package org.manish.Sorting;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//int A[] = new int[10];
		
		/*System.out.println("Enter 10 elements:");
		for(int i = 0; i < 10; i++) {
			A[i] = sc.nextInt();
		}*/
		System.out.println("Elements before sorting: ");
		int A[] = {8, 2, 7, 5, 1, 10, 6, -5, 3, 1};
		for(int i = 0; i < A.length; i++) {
			System.out.print(A[i]+" ");
		}
		int choice = 0;
		do {
			System.out.println("\nSelect option: ");
			System.out.println("1: Bubble Sort");
			System.out.println("2: Selection Sort");
			System.out.println("3: Exit");
			
			choice = sc.nextInt();
			switch(choice) {
				case 1:
					BubbleSort BS = new BubbleSort();
					A = BS.Bubble(A);
					System.out.println("\nSorted Elements: ");
					for(int i = 0; i < 10; i++) {
						System.out.print(A[i]+" ");
					}
				break;
				case 2:
					SelectionSort SS = new SelectionSort();
					A = SS.Selection(A);
					System.out.println("\nSorted Elements: ");
					for(int i = 0; i < 10; i++) {
						System.out.print(A[i]+" ");
					}
				break;
				case 3:
					System.exit(0);
				break;	
				default:
					System.out.println("Invalid option...\nTry again!!");
			}
			
			
		} while(3 != choice);
		
		
		
		
		sc.close();
	}

}
