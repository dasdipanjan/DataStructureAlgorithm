package com.gllearning.binary.tree.using.linkedlist;

import java.util.Scanner;

public class BinaryTreeMainTest {

	public static void main(String[] args) {
		BinaryTreeUsingLinkedList bstUsingLinkedList = new BinaryTreeUsingLinkedList();
		Scanner scanner = new Scanner(System.in);
		int option = 0;
		do {
			System.out.println("--------Menu--------");
			System.out.println("\t 1. Insert.");
			System.out.println("\t 2. Delete.");
			System.out.println("\t 3. Print Tree.");
			System.out.println("\t 4. Print Tree Family");
			System.out.println("\t 5. Level Order Traversal.");
			System.out.println("\t 6. In Order Traversal.");
			System.out.println("\t 7. Pre Order Traversal.");
			System.out.println("\t 8. Post Order Traversal.");
			System.out.println("\t 9. Exit.");
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
					bstUsingLinkedList.insertNode(scanner.nextInt());
				}
				break;
			case 2:
				System.out.println("Please enter value which you want to delete := ");
				bstUsingLinkedList.deleteNode(scanner.nextInt());
				break;
			case 3:
				bstUsingLinkedList.printTree();
				break;
			case 4:
				
				break;
			case 5:
				bstUsingLinkedList.levelOrderTraversal();
				break;
			case 6:
				bstUsingLinkedList.inOrder(bstUsingLinkedList.getRootNode());
				System.out.println();
				break;
			case 7:
				bstUsingLinkedList.preOrderTraversal(bstUsingLinkedList.getRootNode());
				System.out.println();
				break;
			case 8:
				bstUsingLinkedList.postOrderTraversal(bstUsingLinkedList.getRootNode());
				System.out.println();
			default:
				break;
			}
		} while (option != 9);
		scanner.close();
		System.exit(0);
	}

}
