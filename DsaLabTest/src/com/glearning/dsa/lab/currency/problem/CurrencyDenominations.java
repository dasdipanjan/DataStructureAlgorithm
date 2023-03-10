package com.glearning.dsa.lab.currency.problem;

/**
 * This class is responsible to hold random denomination of a particular
 * currency and provide method to identify number of different notes required to
 * pay given amount.
 * 
 * @author Dipanjan Das
 * @since 08-Jan-2023
 * @version 1.0
 *
 */
public class CurrencyDenominations {
	private int[] notes;
	private StringBuffer mStringBuffer;

	/**
	 * Constructor of this class. Creating instance of array with given size.
	 * 
	 * @param sizeOfArray
	 */
	public CurrencyDenominations(int sizeOfArray) {
		super();
		notes = new int[sizeOfArray];
		mStringBuffer = new StringBuffer();
	}

	/**
	 * This method is responsible to arrange input denomination in descending order.
	 * 
	 * @param arr   actual array provided by user input.
	 * @param left  Extreme left index of the array.
	 * @param right Extreme right index of the array.
	 */
	private void mergeSort(int arr[], int left, int right) {
		if (left < right) {
			int mid = (left + right) / 2;
			mergeSort(arr, left, mid);
			mergeSort(arr, mid + 1, right);
			merge(arr, left, mid, right);
		}
	}

	/**
	 * This method is responsible to combine all sorted array in sorted sub arrays.
	 * 
	 * @param array sub array.
	 * @param left  left index of array
	 * @param mid   middle index of array
	 * @param right right index of array
	 */
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

		// Comparing array element in arranging them in descending order.
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

		// Copying already sorted residual elements from left array to actual array if
		// they are not already copied.
		while (i < leftArrLength) {
			array[k] = leftArray[i];
			i++;
			k++;
		}

		// Copying already sorted residual elements from right array to actual array if
		// they are not already copied.
		while (j < rightArrLength) {
			array[k] = rightArray[j];
			j++;
			k++;
		}
	}

	/**
	 * This method is responsible to find number of notes.
	 * 
	 * @param amount       amount provide by user to do the payment..
	 * @param denomination note's value.
	 * @return number of notes for a particular denomination.
	 */
	private int denomination(int amount, int denomination) {
		try {
			return (amount / denomination);
		} catch (ArithmeticException e) {
			return 0;
		}
	}

	/**
	 * This method is responsible to make count of different notes to pay given
	 * amount.
	 * 
	 * @param amount amount provide by user to do the payment.
	 */
	public void determineDenomination(int amount) {
		mergeSort(notes, 0, (notes.length - 1));
		boolean isFinished = false;
		for (int i = 0; i < notes.length; i++) {
			int noOfNotes = denomination(amount, notes[i]);
			if (noOfNotes > 0) {
				this.addPair(notes[i] + ":" + noOfNotes);
				amount = amount % notes[i];
			}
			if (amount == 0) {
				isFinished = true;
				break;
			}
		}
		if (isFinished) {
			System.out.println(mStringBuffer.toString());
		} else {
			System.out.println("Not possible to make a payment with available denomination.");
		}
		mStringBuffer.setLength(0);
	}

	/**
	 * This method is responsible to keep already calculated pair of denomination
	 * and their count.
	 * 
	 * @param pair String value.
	 */
	private void addPair(String pair) {
		mStringBuffer.append(pair);
		mStringBuffer.append("\n");
	}

	/**
	 * This method is responsible to add element in a particular index in notes array.
	 * 
	 * @param index Index inside notes array.
	 * @param denomination Denomination value.
	 */
	public void addElement(int index, int denomination) {
		notes[index] = denomination;
	}
}
