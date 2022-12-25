package com.gllearning.week3;

import java.util.Scanner;

public class GcdOfTwoNumbers {

	public int gcdOfTwoNumbers(int number1, int number2) {
		if (number1 == 0) {
			return number2;
		}
		if (number2 == 0) {
			return number1;
		}
		if (number1 == number2) {
			return number1;
		}
		if (number1 > number2) {
			return gcdOfTwoNumbers((number1 - number2), number2);
		}
		return gcdOfTwoNumbers(number1, (number2 - number1));
	}

	public static void main(String[] args) {
		GcdOfTwoNumbers gcdOfTwoNumbers = new GcdOfTwoNumbers();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter first number");
		int firstNumber = scanner.nextInt();
		System.out.println("Please enter second number");
		int secondNumber = scanner.nextInt();
		System.out.println("GCD of Two Numbers " + firstNumber 
				+ " and " + secondNumber + " is := "
				+ gcdOfTwoNumbers.gcdOfTwoNumbers(firstNumber, secondNumber));
		scanner.close();
	}

}
