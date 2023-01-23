package com.gllearning.queue;

public class QueueMainTest {

	public static void main(String[] args) {
		QueueImplementation<Integer> queue = new QueueImplementation<Integer>(5);

		queue.enQueue(10);
		queue.enQueue(20);
		queue.enQueue(30);
		queue.enQueue(40);
		queue.enQueue(50);

		queue.printQueue();
		System.out.println("\n");
		System.out.println("Dequeuing from the Queue\n");

		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
	}

}
