package org.manish.Searching;

public class LinearSearch {
    //this function returns index of element x in arr[]
	static int search(int arr[], int n, int x) {
		for(int i = 0; i < n; i++) {
			//return the index of the element if the element is found
			if (x == arr[i])
				return i;
		}
		
		// return -1 if the element is not found
		return -1;
	}
	
}
