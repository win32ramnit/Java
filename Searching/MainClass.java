package org.manish.Searching;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int arr[] = {3, 7,  26, 94, 249, 519, 651};
		int n = arr.length;
		System.out.println("Enter a number: ");
		int x = sc.nextInt();
		//LinearSearch LS = new LinearSearch();
		BinarySearch BS = new BinarySearch();
		int result = BS.binarySearch(arr, 0, n - 1, x);
		if (-1 == result) {
			System.out.println(x+" is not present in array!");
		} else {
			System.out.println(x+" is persent in array at "+result+" index");
		}
		sc.close();
	}

}
