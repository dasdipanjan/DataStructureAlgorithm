package com.gllearning.circular.linkedlist;

public class CircularLinkedListTest {

	public static void main(String[] args) {
		CircularLinkedList circularLinkedList = new CircularLinkedList();
		System.out.println("Adding elements in the front of linked list");
		circularLinkedList.insertAtFirst(30);
		circularLinkedList.insertInPosition(79, 1);
		circularLinkedList.insertAtFirst(20);
		circularLinkedList.insertAtFirst(10);
		circularLinkedList.displayLinkedList();
		System.out.println("\nAdding elements in the end of linked list");
		circularLinkedList.insertAtLast(40);
		circularLinkedList.insertAtLast(50);
		circularLinkedList.displayLinkedList();
		System.out.println("\nAdding elements in the middle of linked list");
		circularLinkedList.insertInPosition(75, 3);
		circularLinkedList.displayLinkedList();
	}

}
