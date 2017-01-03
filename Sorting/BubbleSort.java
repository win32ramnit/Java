package org.manish.Sorting;

public class BubbleSort {
	public int[] Bubble(int []A) {
		int i = 0, j = 0;
		int len = A.length;
		for(i  = 0; i < len - 1; i++) {
			for(j = i + 1; j < len; j++) {
				if(A[i] > A[j]) {
					int temp = A[i];
					A[i] = A[j];
					A[j] = temp;
				}
			}
		}
		return A;
	}
}

