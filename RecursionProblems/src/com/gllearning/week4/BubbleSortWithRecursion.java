package com.gllearning.week4;


/**
 * Place the largest element at its position, this operation makes sure that the first largest element will be placed at the end of the array.
 * Recursively call for rest n – 1 element with the same operation and place the next greater element at their position.
 * The base condition for this recursion call would be, when the number of elements in the array becomes 0 or 1 then, simply return (as they are already sorted).
 * 
 * @author Dipanjan
 *
 */
public class BubbleSortWithRecursion {
	public static void bubbleSort(int array[], int size) {
		if (size == 0 || size == 1) {
			return;
		}
		for (int i = 0; i < size -1; i++) {
			int temp = 0;
			if (array[i] > array[i + 1]) {
				temp = array[i];
				array[i] = array[i + 1];
				array[i + 1] = temp;
			}
		}
		bubbleSort(array, size - 1);
	}

	public static void main(String[] args) {
		int arr[] = { 2, 5, 1, 6, 9 };

		// function call
		bubbleSort(arr, arr.length);
		for (int i = 0; i < 5; i++) {
			System.out.printf(arr[i] + " ");
		}
	}

}
