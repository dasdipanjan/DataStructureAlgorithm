package com.gllearning.circularqueue;

public class CircularQueueTest {

	public static void main(String[] args) {
		CircularQueue circularQueue = new CircularQueue(5);
		circularQueue.enQueue(10);
		circularQueue.enQueue(20);
		circularQueue.enQueue(30);
		circularQueue.enQueue(40);
		circularQueue.enQueue(50);
		circularQueue.printCircularQueue();
		System.out.println("Queue Element = " + circularQueue.deQueue());
		System.out.println("Queue Element = " + circularQueue.deQueue());
		circularQueue.enQueue(55);
		circularQueue.enQueue(22);
		circularQueue.printCircularQueue();
	}

}
