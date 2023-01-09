package com.gllearning.week6;

public class StackImplementation<T> {
	private int sizeOfArray;
	private int currentPointer;
	private Object[] array;
	
	public StackImplementation(int sizeOfArray) {
		super();
		this.sizeOfArray = sizeOfArray;
		this.currentPointer = -1;
		this.array =  new Object[sizeOfArray];
	}
	
	private boolean isStackFull() {
		return (currentPointer > sizeOfArray);
	}
	
	private boolean isEmptyStack() {
		return (currentPointer < 0);
	}
	
	public boolean push(T element) {
		if (this.isStackFull()) {
			System.out.println("Stack is full.");
		} else {
			array[++currentPointer] = element;
			System.out.println(element + "is pushed to stack");
			return true;
		}
		return false;
	}
	
	@SuppressWarnings("unchecked")
	public T pop() {
		if (isEmptyStack()) {
			System.out.println("Stack is empty.");
			return null;
		}
		T element = (T) array[currentPointer--];
		System.out.println(element + " is popped from stack.");
		return element; 
	}
	
	public void printStack() {
		for (int i=currentPointer; i > -1; i--) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}
}
