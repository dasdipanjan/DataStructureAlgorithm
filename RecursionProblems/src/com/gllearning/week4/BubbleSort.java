package com.gllearning.week4;

/**
 * Best Case: O(n) // When elements are already sorted.
 * Average Case: O(n^2)
 * Worst Case: O(n^2)
 *  
 * @author Dipanjan
 *
 */
public class BubbleSort {
	public static void bubbleSort(int array[]) {
		int size = array.length;
		int temp = 0;
		boolean isSwaped = false;
		for (int i = 0; i < size; i++) {
			for (int j = 1; j < (size - i); j++) {
				if (array[j - 1] > array[j]) {
					temp = array[j - 1];
					array[j - 1] = array[j];
					array[j] = temp;
					isSwaped = true;
				}
			}
			System.out.println("Value of I := "+i);
			if (!isSwaped) {
				System.out.println("Array elements are already sorted.");
				break;
			}
		}
	}

	public static void main(String[] args) {
		//Unsorted
		//int array[] = {10, 7, 18, 87, 6, 77, 12, 77};
		//Sorted
		int array[] = {11, 17, 25, 20};
		bubbleSort(array);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

}
