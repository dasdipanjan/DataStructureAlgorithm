package com.gllearning.lab3.problem1;

import java.util.Scanner;

public class BalancedBracketTest {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("Please enter Balancing Bracket Expression");
		 String expression = scanner.nextLine();
		 BalancedBrackets balancedBrackets = new BalancedBrackets();
		 if (balancedBrackets.isBalancedBrackets(expression)) {
			 System.out.println("Expression is balanced.");
		 } else {
			 System.out.println("Expression is not balanced.");
		 }
		 scanner.close();
	}

}
