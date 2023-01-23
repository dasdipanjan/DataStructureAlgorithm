package com.gllearning.doublelinkedlist;

class Node {
	public int nodeData;
	public Node previousNode;
	public Node nextNode;
}

public class DoubleLinkedList {
	private Node head;
	private int size;

	public DoubleLinkedList() {
		super();
		size = 0;
	}

	public void printDoublyLinkedList() {
		if (head == null) {
			return;
		}
		Node currentNode = head;
		while (currentNode != null) {
			System.out.print(currentNode.nodeData + " -> ");
			currentNode = currentNode.nextNode;
		}
		System.out.println("NULL");
		currentNode = head;
		while (currentNode.nextNode != null) {
			currentNode = currentNode.nextNode;
		}
		System.out.print("NULL");
		while (currentNode != null) {
			System.out.print(" <- " + currentNode.nodeData);
			currentNode = currentNode.previousNode;
		}
	}

	public void insertAtBegining(int data) {
		Node newNode = new Node();
		newNode.nodeData = data;
		if (head == null) {
			head = newNode;
		} else {
			newNode.nextNode = head;
			head.previousNode = newNode;
			head = newNode;
		}
		size++;
	}

	public void insertAtEnd(int data) {
		Node newNode = new Node();
		newNode.nodeData = data;
		if (head == null) {
			head = newNode;
		} else {
			Node currentNode = head;
			while (currentNode.nextNode != null) {
				currentNode = currentNode.nextNode;
			}
			currentNode.nextNode = newNode;
			newNode.previousNode = currentNode;
		}
		size++;
	}

	public void insertInPosition(int data, int pos) {
		Node newNode = new Node();
		newNode.nodeData = data;
		if (head == null) {
			head = newNode;
		} else if (size == 1) {
			head.nextNode = new Node();
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
			newNode.previousNode = tempNode;
			newNode.nextNode = currentNode;
			currentNode.previousNode = newNode;
			size++;
		}
	}
	
	
	public void deleteFromLast() {
		if (head != null && head.nextNode == null) {
			head = null;
		} else {
			Node currentNode = head;
			while (currentNode.nextNode.nextNode != null) {
				currentNode = currentNode.nextNode;
			}
			Node tobeDeleetdNode = currentNode.nextNode;
			currentNode.nextNode = null;
			tobeDeleetdNode.previousNode = null;
			size--;
		}
	}

	public void deleteFromFast() {
		if (head != null && head.nextNode == null) {
			head = null;
		} else {
			Node tempHead = head;
			head = head.nextNode;
			head.previousNode = null;
			tempHead.nextNode = null;
			tempHead = null;
			size--;
		}
	}

	public void deleteAtPosition(int position) {
		if (head == null) {
			return;
		}
		Node temp = head;
		if (position == 1) {
			head = temp.nextNode;
			temp.nextNode = null;
			temp = null;
		}
		for (int i = 1; temp != null && i < position - 1; i++) {
			temp = temp.nextNode;
		}
		if (temp == null || temp.nextNode == null) {
			System.out.println("Position entered is more than the number of elements in the linked list.");
			return;
		}
		
		Node tobeDeletedNode = temp.nextNode;
		Node nextNewNode = temp.nextNode.nextNode;
		temp.nextNode = nextNewNode;
		nextNewNode.previousNode = temp;
		tobeDeletedNode.nextNode = null;
		tobeDeletedNode.previousNode = null;
		tobeDeletedNode = null;
		size--;
	}

}
