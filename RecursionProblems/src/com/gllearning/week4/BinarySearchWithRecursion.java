package com.gllearning.week4;

/**
 * Time complexity of Binary Search is O(log n)// log base 2 and n
 * Best Case: O(1)
 * Average Case: O(log n)// log base 2 and n
 * Worst Case: O(log n)// log base 2 and n
 * 
 * @author Dipanjan
 *
 */
public class BinarySearchWithRecursion {

	public static int binarySearch(int array[], int first, int last, int key) {
		if (first <= last) {
			int mid = (first + last) / 2;
			if (array[mid] == key) {
				return mid;
			} else if (array[mid] < key) {
				return binarySearch(array, mid + 1, last, key);
			} else {
				return binarySearch(array, first, mid - 1, key);
			}

		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = { 4, 10, 18, 43, 56 };
		int key = 56;
		int last = (arr.length - 1);
		int foundIndex = binarySearch(arr, 0, last, key);
		if (foundIndex == -1) {
			System.out.println("Element was not found in given array.");
			return;
		}
		System.out.println("Element was found in given array in Index := " + foundIndex);
	}

}
