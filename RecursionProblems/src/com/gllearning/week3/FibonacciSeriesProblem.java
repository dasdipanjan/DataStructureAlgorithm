package com.gllearning.week3;

import java.util.Scanner;

public class FibonacciSeriesProblem {
	
	public int calculateFibonacciNumber(int number) {
		if (number <= 1) {
			return number;
		}
		return (calculateFibonacciNumber(number - 1) + calculateFibonacciNumber(number - 2));
	}
	
	
	public static void main(String[] args) {
		FibonacciSeriesProblem seriesProblem = new FibonacciSeriesProblem();
		int number = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter n-th Term of the Fibonacci Series : ");
		number = scanner.nextInt();
		for(int i = 0; i<number; i++) {
			System.out.print(seriesProblem.calculateFibonacciNumber(i) + " ");
		
		}
		scanner.close();
	}
	
}
