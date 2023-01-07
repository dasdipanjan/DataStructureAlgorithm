package com.gllearning.week4;

/**
 * Time complexity of Linear Search.
 * Best Case: O(1) if the searched item is matched with middle element or mid.
 * Average Case: O(log n) // Log n base 2
 * Worst Case: O(log n) // Log n base 2
 * @author Dipanjan
 *
 */
public class BinarySearch {
	public static void binarySearch(int[] array, int first, int last, int key) {
		int mid = (first + last)/2;
		while (first <= last) {
			if (array[mid] < key) {
				first = mid + 1;
			} else if (array[mid] == key) {
				System.out.println("Element found at array index := "+mid);
				break;
			} else {
				last = mid -1;
			}
			mid = (first + last)/2;
			System.out.println("itr");
		}
		if (first > last) {
			System.out.println("Element was not found in the given array.");
		}
	}
	public static void main(String[] args) {
		int arr[] = {5, 6, 77, 88, 99};
		int key = 88;
		int last = (arr.length - 1);
		binarySearch(arr, 0, last, key);
	}

}
