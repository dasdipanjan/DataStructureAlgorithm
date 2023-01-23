package com.gllearning.queue;

public class QueueImplementation<T> {
	private Object[] array;
	private int front, rear;

	public QueueImplementation(int size) {
		super();
		array = new Object[size];
		front = rear = -1;
	}

	public boolean isFull() {
		return (rear > (array.length - 1));
	}

	public boolean isEmpty() {
		return (front == -1);
	}

	public boolean enQueue(T value) {
		if (isFull()) {
			System.out.println("Queue is full.");
		} else {
			if (front == -1) {
				front = 0;
			}
			rear++;
			array[rear] = value;
			return true;
		}
		return false;
	}

	public T deQueue() {
		T element = null;
		if (isEmpty()) {
			System.out.println("Queue is empty.");
		} else {
			element = (T) array[front];
			if (front == rear) {
				front = -1;
				rear = -1;
			} else {
				front++;
			}
		}
		return element;
	}

	public void printQueue() {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
