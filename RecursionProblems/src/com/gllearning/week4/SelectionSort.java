package com.gllearning.week4;

/**
 * Time complexity of selection sort.
 * 
 * Best Case: O(n^2)
 * Average Case: O(n^2)
 * Worst Case: O(n^2)
 * 
 * @author Dipanjan
 *
 */
public class SelectionSort {

	public static void selectionSort(int arr[]) {
		for (int i = 0; i < arr.length - 1; i++) {
			int index = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[index]) {
					index = j;
				}
			}
			int smallerNumber = arr[index];
			arr[index] = arr[i];
			arr[i] = smallerNumber;
		}
	}

	public static void display(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 10, 2, 19, 8, 71, 23, 33, 77 };
		System.out.println("Before sorting the array:");
		display(arr);
		System.out.println();
		selectionSort(arr);
		System.out.println("After sorting the array:");
		display(arr);
	}

}
