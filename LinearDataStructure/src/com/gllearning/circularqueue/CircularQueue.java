package com.gllearning.circularqueue;

public class CircularQueue {
	private int[] array;
	int front, rear;

	public CircularQueue(int sizeOfArray) {
		super();
		array = new int[sizeOfArray];
		front = rear = -1;
	}

	private boolean isFull() {
		return ((rear + 1) % array.length == front);
	}

	private boolean isEmpty() {
		return (front == -1);
	}

	public boolean enQueue(int element) {
		if (isFull()) {
			System.out.println("Queue is full.");
			return false;
		} else {
			rear = (rear + 1) % array.length;
			System.out.println("Rear = "+rear);
			array[rear] = element;
			if (front == -1) {
				front = 0;
			}
			return true;
		}
	}

	public int deQueue() {
		if (isEmpty()) {
			System.out.println("Queue is empty");
			return -1;
		} else {
			System.out.println("Front = "+front);
			int element = array[front];
			if (front == rear) {
				front = rear = -1;
			} else {
				front = (front + 1) % array.length;
			}
			return element;
		}
	}

	public void printCircularQueue() {
		System.out.println("-----Printing Queue----");
		System.out.println("\t");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println("\n");
	}

}
