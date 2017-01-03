package org.manish.Searching;

public final class BinarySearch {

	public int binarySearch(int arr[], int beg, int end, int x) {
		if (end >= 1) {
			int mid = beg + (end - beg) / 2;
			// If the element is present at the middle itself
			if (arr[mid] == x)
				return mid;
			// If element is smaller than mid, then it can only
			// be present in left subarray
			if (arr[mid] > x)
				return binarySearch(arr, beg, mid - 1, x);
			else
				// Else the element can only be present in right
				// subarray
				return binarySearch(arr, mid + 1, end, x);
		}
		
		// We reach here when element is not present in array
		return -1;
	}
}
