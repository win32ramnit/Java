package org.manish.Testing;

public class BitsCount {

	public static void main(String[] args) {
		int result = 0;
		
		result = countsTotalBist(7);
		System.out.println("Total number of bits is "+ result);

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
