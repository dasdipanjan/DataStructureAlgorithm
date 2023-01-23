package com.gllearning.circular.linkedlist;


class Node {
	public int nodeData;
	public Node nextNode;
}

public class CircularLinkedList {
	private Node head;
	private Node tail;
	private int size;

	public CircularLinkedList() {
		super();
		size = 0;
	}

	public void displayLinkedList() {
		System.out.println("\n------Printing LinkedList---------\n");
		Node currentNode = head;
		if (head != null) {
			do {
				System.out.print(currentNode.nodeData + " -> ");
				currentNode = currentNode.nextNode;
			} while (currentNode != head);
		}
		System.out.println("NULL");
	}

	public void insertAtFirst(int data) {
		Node newNode = new Node();
		newNode.nodeData = data;
		if (head == null) {
			head = newNode;
			tail = newNode;
			newNode.nextNode = head;
			size++;
		} else {
			Node temp = head;
			newNode.nextNode = temp;
			head = newNode;
			tail.nextNode = head;
			size++;
		}
	}
	
	public void insertAtLast(int data) {
		Node newNode = new Node();
		newNode.nodeData = data;
		if (head == null) {
			head = newNode;
			tail = newNode;
			newNode.nextNode = head;
			size++;
		} else {
			Node temp = tail;
			temp.nextNode = newNode;
			tail = newNode;
			tail.nextNode = head;
			size++;
		}
	}
	
	public void insertInPosition(int data, int pos) {
		Node newNode = new Node();
		newNode.nodeData = data;
		if (head == null) {
			head = newNode;
		} else if (pos == 1) {
			newNode.nextNode = head;
			tail.nextNode = newNode;
			head = newNode;
		} else {
			if (pos > size - 1) {
				System.out.println("Not possible to insert because pos is more than size of linked list");
			}
			Node currentNode = head;
			Node tempNode = null;
			for (int i = 0; i < pos - 1; i++) {
				currentNode = currentNode.nextNode;
			}
			tempNode = currentNode;
			currentNode = currentNode.nextNode;
			tempNode.nextNode = newNode;
			newNode.nextNode = currentNode;
			size++;
		}
	}
}
