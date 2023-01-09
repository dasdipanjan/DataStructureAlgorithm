package com.gllearning.week4;

import java.util.Scanner;

public class MergeSort {
	static int smax = 100;

	public void merge(int array[], int left, int mid, int right) {
		int leftArrLength = mid - left + 1;
		int rightArrLength = right - mid;

		int leftArray[] = new int[leftArrLength];
		int rightArray[] = new int[rightArrLength];

		for (int i = 0; i < leftArrLength; i++) {
			leftArray[i] = array[left + i];
		}
		for (int j = 0; j < rightArrLength; j++) {
			rightArray[j] = array[mid + 1 + j];
		}

		int i, j, k;
		i = 0;
		j = 0;
		k = left;

		while (i < leftArrLength && j < rightArrLength) {
			if (leftArray[i] >= rightArray[j]) {
				array[k] = leftArray[i];
				i++;
			} else {
				array[k] = rightArray[j];
				j++;
			}
			k++;
		}

		while (i < leftArrLength) {
			array[k] = leftArray[i];
			i++;
			k++;
		}

		while (j < rightArrLength) {
			array[k] = rightArray[j];
			j++;
			k++;
		}
	}

	void mergeSort(int arr[], int left, int right) {
		if (left < right) {
			int mid = (left + right) / 2;
			mergeSort(arr, left, mid);
			mergeSort(arr, mid + 1, right);
			merge(arr, left, mid, right);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size");
		int n = sc.nextInt();

		int[] a = new int[n];
		System.out.println("Enter array elements: ");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Before Sorting:");
		for (int i = 0; i < n; i++)
			System.out.print(a[i] + " ");
		System.out.println();
		MergeSort m = new MergeSort();
		m.mergeSort(a, 0, n - 1);
		System.out.println("After Sorting:");
		for (int i = 0; i < n; i++)
			System.out.print(a[i] + " ");
	}
}
