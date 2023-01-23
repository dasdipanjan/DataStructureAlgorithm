package com.gllearning.single.linkedlist;

public class SingleLinkedListTest {

	public static void main(String[] args) {
		SingleLinkedList singleLinkedList = new SingleLinkedList();
		singleLinkedList.insertInPosition(88, 3);
		System.out.println("Adding elements in the front of linked list");
		singleLinkedList.insertAtFront(30);
		singleLinkedList.insertAtFront(20);
		singleLinkedList.insertAtFront(10);
		singleLinkedList.displayLinkedList();
		System.out.println("\nAdding elements in the end of linked list");
		singleLinkedList.insertAtLast(44);
		singleLinkedList.insertAtLast(55);
		singleLinkedList.displayLinkedList();
		System.out.println("\nAdding elements in the middle of linked list");
		singleLinkedList.insertInPosition(75, 3);
		singleLinkedList.displayLinkedList();
		System.out.println("\nDeleting last elements from linked list");
		singleLinkedList.deleteFromLast();
		singleLinkedList.displayLinkedList();
		System.out.println("\nDeleting first elements from linked list");
		singleLinkedList.deleteFromFast();
		singleLinkedList.displayLinkedList();
		System.out.println("\nDeleting positioned elements from linked list");
		singleLinkedList.deleteAtPosition(3);
		singleLinkedList.displayLinkedList();
	}

}
