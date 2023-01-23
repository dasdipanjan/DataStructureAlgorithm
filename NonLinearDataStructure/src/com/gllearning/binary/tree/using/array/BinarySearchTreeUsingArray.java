package com.gllearning.binary.tree.using.array;

public class BinarySearchTreeUsingArray {
	private static final int DEFAULT_SIZE = 10;
	private int array[];
	private int arraySize;
	private int currentIndex;

	public BinarySearchTreeUsingArray() {
		super();
		this.array = new int[DEFAULT_SIZE + 1];
		this.arraySize = array.length;
		this.currentIndex = 0;
	}
	
	public int findIndexByValue(int searchItem) {
		if (array[1] == 0) {
			return -1;
		}
		for (int i=1; i<currentIndex; i++) {
			if (searchItem == array[i]) {
				return i;
			}
		}
		return -1;
	}
	
	public boolean isTreeEmpty() {
		return (array[1] == 0);
	}
	
	public void deleteNode(int deleteItem) {
		if (isTreeEmpty()) {
			System.out.println("Delete operation can not be done as tree is empty.");
		}
		int foundIndex = this.findIndexByValue(deleteItem);
		if (foundIndex < 0) {
			System.out.println("Given "+deleteItem+" is not found in Tree.");
			return;
		}
		System.out.println("Tree before "+deleteItem+" deletion.");
		this.printTree();
		//Deleting the deepest right most node.
		if (foundIndex == currentIndex) {
			array[foundIndex] = 0;
		} else {
			//Find the deepest right most node and replace with foundIndex value and delete deepest right most node.
			array[foundIndex] = array[currentIndex];
			array[currentIndex] = 0;
		    currentIndex--;
		}
		System.out.println("Tree after "+deleteItem+" deletion.");
		this.printTree();
	}

	public void insertNode(int nodeValue) throws IllegalArgumentException {
		if (nodeValue <= 0) {
			throw new IllegalArgumentException("Node value is either lesser than zero or zero.");
		}
		if (!this.isEmptySpaceAvailable()) {
			this.increaseArraySize();
		}
		++currentIndex;
		array[currentIndex] = nodeValue;
		
	}

	private void increaseArraySize() {
		System.out.println("Increasing array size by " + DEFAULT_SIZE + " elements.");
		int newArraySize = (this.array.length + DEFAULT_SIZE);
		int temporaryArray[] = new int[newArraySize];
		System.arraycopy(array, 0, temporaryArray, 0, array.length);
		this.array = temporaryArray;
		this.arraySize = this.array.length;
		System.out.println("Current array size := " + arraySize);
	}

	private boolean isEmptySpaceAvailable() {
		return (currentIndex < arraySize);
	}

	public void printTree() {
		for (int i = 1; i <= currentIndex; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println("\n");
	}

	public void printTreeFamily() {
		for (int i = currentIndex; i > 1; i--) {
			if (array[i] != 0) {
				System.out.println("\n Parent of " + array[i] + " is " + array[i / 2]);
				if ((2 * i) <= currentIndex && array[2 * i] != 0) {
					System.out.println("\n Left Child of " + array[i] + " is " + array[2 * i]);
				}
				if (((2 * i) + 1) <= currentIndex && array[((2 * i) + 1)] != 0) {
					System.out.println("\n Right Child of " + array[i] + " is " + array[(2 * i) + 1]);
				}
			}
		}
	}
}
