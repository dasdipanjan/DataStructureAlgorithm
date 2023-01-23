package com.gllearning.doublelinkedlist;

public class DoubleLinkedListTest {

	public static void main(String[] args) {
		DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
		System.out.println("Adding elements in the front of linked list");
		doubleLinkedList.insertAtBegining(30);
		doubleLinkedList.insertAtBegining(20);
		doubleLinkedList.insertAtBegining(10);
		doubleLinkedList.printDoublyLinkedList();
		System.out.println("\nAdding elements in the end of linked list");
		doubleLinkedList.insertAtEnd(66);
		doubleLinkedList.insertAtEnd(77);
		doubleLinkedList.printDoublyLinkedList();
		System.out.println("\nAdding elements in the middle of linked list");
		doubleLinkedList.insertInPosition(75, 3);
		doubleLinkedList.printDoublyLinkedList();
		System.out.println("\nDeleting last elements from linked list");
		doubleLinkedList.deleteFromLast();
		doubleLinkedList.printDoublyLinkedList();
		System.out.println("\nDeleting first elements from linked list");
		doubleLinkedList.deleteFromFast();
		doubleLinkedList.printDoublyLinkedList();
		System.out.println("\nDeleting positioned elements from linked list");
		doubleLinkedList.deleteAtPosition(3);
		doubleLinkedList.printDoublyLinkedList();
	}

}
