package com.gllearning.week4;

public class InsertionSort {

	public static void insertionSort(int[] arr) {
		int n = arr.length;
		for (int j = 1; j < n; j++) {
			int key = arr[j];
			int i = (j - 1);
			while (j > -1 && arr[i] > key) {
				arr[i + 1] = arr[i];
				i--;
			}
			arr[i + 1] = key;
		}
	}

	public static void display(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		int arr[] = { 1, 10, 2, 19, 8, 71, 23, 33, 77 };
		System.out.println("Before sorting the array:");
		display(arr);
		System.out.println();
		insertionSort(arr);
		System.out.println("After sorting the array:");
		display(arr);

	}

}
