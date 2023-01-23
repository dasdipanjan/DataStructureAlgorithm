package com.gllearning.binary.tree.using.array;

import java.util.Scanner;

public class BinaryTreeMainTest {
	public static void main(String[] args) {
		BinarySearchTreeUsingArray bstUsingArray = new BinarySearchTreeUsingArray();
		Scanner scanner = new Scanner(System.in);
		int option = 0;
		do {
			System.out.println("--------Menu--------");
			System.out.println("\t 1. Insert.");
			System.out.println("\t 2. Delete.");
			System.out.println("\t 3. Print Tree.");
			System.out.println("\t 4. Print Tree Family");
			System.out.println("\t 5. Exit.");
			System.out.println("--------------------");
			System.out.println();
			System.out.println("Please enter option := ");
			option = scanner.nextInt();
			switch (option) {
			case 1:
				System.out.println("Please enter how many element you want to add.");
				int noOfElement = scanner.nextInt();
				for (int i=1; i<=noOfElement; i++) {
					System.out.println("Please enter element value := ");
					int elementValue = scanner.nextInt();
					bstUsingArray.insertNode(elementValue);
				}
				break; 
			case 2:
				System.out.println("Please enter value which you want to delete.");
				bstUsingArray.deleteNode(scanner.nextInt());
				break;
			case 3:
				bstUsingArray.printTree();
				break;
			case 4:
				bstUsingArray.printTreeFamily();
				break;
			default:
				System.out.println("Please choose correct option.");
				break;
			}
		}while (option != 5);
		scanner.close();
	}
}
