package org.manish.Sorting;

public class SelectionSort {
	public int[] Selection (int []A) {
		int i = 0, j = 0, minIndex = 0;
		int len = A.length;
		for(i = 0; i < len - 1; i++) {
			minIndex = i;
			for(j = i + 1; j < len; j++) {
				if(A[minIndex] > A[j]) {
					minIndex = j;
				}
			}
			int temp = A[minIndex];
			A[minIndex] = A[i];
			A[i] = temp;
			
		} // outer loop
		return A;
	}
}
