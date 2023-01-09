package com.gllearning.week6;

public class StackMainTest {

	public static void main(String[] args) {
		StackImplementation<Integer> stack = new StackImplementation<Integer>(6);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.push(60);
		stack.push(70);
		System.out.println("Printing Current Stack after Push Operation.");
		stack.printStack();
		stack.pop();
		stack.pop();
		stack.pop();
		System.out.println("Printing Current Stack after Pop Operation.");
		stack.printStack();
	}
}
