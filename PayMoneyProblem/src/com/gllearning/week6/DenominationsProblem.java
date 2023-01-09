package com.gllearning.week6;

import java.util.Scanner;

public class DenominationsProblem {
	private int[] notes;
	private StringBuffer mStringBuffer;

	public DenominationsProblem(int sizeOfArray) {
		super();
		notes = new int[sizeOfArray];
		mStringBuffer = new StringBuffer();
	}

	public void mergeSort(int list[], int low, int high) {
		if (low >= high) {
			return;
		}
		int middle = (low + high) / 2;
		mergeSort(list, low, middle);
		mergeSort(list, middle + 1, high);
		merge(list, low, middle, high);
	}

	private void merge(int list[], int low, int middle, int high) {
		int firstListEnded = middle;
		int secondListEnded = middle + 1;
		int l = low;
		while ((l <= firstListEnded) && (secondListEnded <= high)) {
			if (list[low] < list[secondListEnded]) {
				low++;
			} else {
				int temp = list[secondListEnded];
				for (int j = secondListEnded - 1; j >= low; j--) {
					list[j + 1] = list[j];
				}
				list[low] = temp;
				low++;
				firstListEnded++;
				secondListEnded++;
			}
		}
	}

	private int denomination(int amount, int denomination) {
		try {
			return (amount / denomination);
		} catch (ArithmeticException e) {
			return 0;
		}
	}

	private void determineDenomination(int amount) {
		boolean isFinished = false;
		for (int i = notes.length - 1; i > -1; i--) {
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
	}

	private void addPair(String pair) {
		mStringBuffer.append(pair);
		mStringBuffer.append("\n");
	}

	public void printArray() {
		for (int i = 0; i < notes.length; i++) {
			System.out.print(notes[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the size of currency denominations");
		int sizeOfDemArray = scanner.nextInt();
		DenominationsProblem deProblem = new DenominationsProblem(sizeOfDemArray);

		System.out.println("Enter the currency denominations value");
		for (int i = 0; i < deProblem.notes.length; i++) {
			int input = scanner.nextInt();
			if (input > 0) {
				deProblem.notes[i] = input;
			} else {
				i--;
				System.out.println("Denomination input can not be Zero or lesser than Zero."
						+ " Please enter valid note.");
			}
		}
		deProblem.mergeSort(deProblem.notes, 0, (deProblem.notes.length - 1));

		System.out.println("Enter the amount you want to pay.");
		int amountToPay = scanner.nextInt();
		deProblem.determineDenomination(amountToPay);

		// Clearing Resources.
		deProblem.mStringBuffer.setLength(0);
		scanner.close();
	}
}
