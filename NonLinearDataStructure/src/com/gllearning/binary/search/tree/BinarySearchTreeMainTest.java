package com.gllearning.binary.search.tree;

import java.util.Scanner;

public class BinarySearchTreeMainTest {

	public static void main(String[] args) {
		BinarySearchTree bstUsingLinkedList = new BinarySearchTree();
		Scanner scanner = new Scanner(System.in);
		int option = 0;
		do {
			System.out.println("--------Menu--------");
			System.out.println("\t 1. Insert.");
			System.out.println("\t 2. Delete.");
			System.out.println("\t 3. Level Order Traversal.");
			System.out.println("\t 4. Calculate Height of The Tree.");
			System.out.println("\t 5. Printing Left Skewed Tree.");
			System.out.println("\t 6. Exit.");
			System.out.println("--------------------");
			System.out.println();
			System.out.println("Please enter option := ");
			option = scanner.nextInt();
			switch (option) {
			case 1:
				System.out.println("Please enter how many element to insert.");
				int noOfNode = scanner.nextInt();
				for (int i = 1; i <= noOfNode; i++) {
					System.out.println("Please enter value := ");
					bstUsingLinkedList.insert(scanner.nextInt());
				}
				break;
			case 2:
				System.out.println("Please enter value which you want to delete := ");
				int toBeDeletedValue = scanner.nextInt();
				bstUsingLinkedList.delete(toBeDeletedValue);
				break;
			case 3:
				bstUsingLinkedList.levelOrderTraversal();
				break;
			case 4:
				int height = bstUsingLinkedList.calculateHeightOfTree();
				System.out.println("Height of The Tree := "+height);
				break;
			case 5:
				bstUsingLinkedList.leftSkewedTree();
				System.out.println();
				break;
			default:
				break;
			}
		} while (option != 6);
		scanner.close();
		System.exit(0);
	}

}
