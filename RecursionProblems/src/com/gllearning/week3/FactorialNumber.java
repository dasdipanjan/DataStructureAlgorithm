package com.gllearning.week3;

import java.util.Scanner;

public class FactorialNumber {
	public int calculateFactorial(int number) {
		if (number == 0 || number == 1) {
			return 1;
		}
		if (number < 0) {
			return -1;
		}
		return (number * calculateFactorial(number - 1));
	}
	public static void main(String[] args) {
		FactorialNumber factorialNumber = new FactorialNumber();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter Value to calculate factorial.");
		int value = scanner.nextInt();
		System.out.println(factorialNumber.calculateFactorial(value));
		scanner.close();
	}

}
