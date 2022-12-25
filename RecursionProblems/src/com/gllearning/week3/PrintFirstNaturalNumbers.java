package com.gllearning.week3;

import java.util.Scanner;

public class PrintFirstNaturalNumbers {
	
	public void printNaturalNumber(int number, int index) {
		if (index <= number) {
			System.out.print(index + " ");
			this.printNaturalNumber(number, ++index);
		}
		return;
	}

	public static void main(String[] args) {
		PrintFirstNaturalNumbers naturalNumbers = new PrintFirstNaturalNumbers();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter Value of N.");
		int nthValue = scanner.nextInt();
		naturalNumbers.printNaturalNumber(nthValue, 1);
		scanner.close();
	}
}
