package com.gllearning.week6;

import java.util.Scanner;

/**
 * 
 * @author Dipanjan
 *
 */
public class PayMoneyProblem {
	private int[] transactionArray;

	public PayMoneyProblem(int arraySize) {
		super();
		this.transactionArray = new int[arraySize];
	}

	public void determineTransaction(int amount) {
		int sum = 0;
		int counter = 0;
		boolean achieved = false;
		for (int i = 0; i < transactionArray.length; i++) {
			sum = sum + transactionArray[i];
			++counter;
			if (sum >= amount) {
				System.out.println("Target achieved after " + counter + " transactions");
				achieved = true;
				break;
			}
		}
		if (!achieved) {
			System.out.println("Given target is not achieved");
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the size of transaction array");
		int sizeOfArray = scanner.nextInt();

		PayMoneyProblem payMoneyProblem = new PayMoneyProblem(sizeOfArray);
		System.out.println("Enter the values of array");
		for (int i = 0; i < sizeOfArray; i++) {
			payMoneyProblem.transactionArray[i] = scanner.nextInt();
		}

		System.out.println("Enter the total no of targets that needs to be achieved");
		int totalNoOfTarget = scanner.nextInt();
		
		for (int i = 0; i < totalNoOfTarget; i++) {
			System.out.println("Enter the value of target");
			int transAmount = scanner.nextInt();
			payMoneyProblem.determineTransaction(transAmount);
		}
		scanner.close();
	}
}
