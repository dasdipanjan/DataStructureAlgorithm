package com.gllearning.week4;

/**
 * Time complexity of Linear Search.
 * Best Case: O(1) // Found in first element.
 * Average Case: O(n/2) // Average of total time taken for all element search
 * Worst Case: O(n) // Item is in last location of array or item is not found. 
 * 
 * @author Dipanjan Das
 *
 */
public class LinearSearch {
	
	public static int linearSearch(int[] arr, int key, int size) {
		for (int i=0; i<size; i++) {
			if (arr[i] == key) {
				return i;
			}
		}
		return -1;
	}
	
	
	public static void main(String[] args) {
		int array[] = {101, 20, 31, 5, 701, 90};
		int size = array.length;
		int keyElement = 20;
		int position = linearSearch(array, keyElement, size);
		if (position == -1) {
			System.out.println("Element is not found in this given array.");
			return;
		}
		System.out.println("Element is found in this given array. Position := "+position);
	}

}
