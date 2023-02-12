package com.gllearning.lab3.problem2;

import java.util.ArrayList;
import java.util.List;

public class BinarySearchTree {
	private Node root;

	/**
	 * This method is responsible to create Node object with new key value.
	 * 
	 * @param data Value
	 * @return Object of Node.
	 */
	public Node getNewNode(int data) {
		Node temp = new Node();
		temp.key = data;
		temp.left = null;
		temp.right = null;
		return temp;
	}

	/**
	 * This is the implementation of insert method in Binary Search Tree.
	 * 
	 * @param key Integer value.
	 * @return Object of Node which is current Parent.
	 */
	public Node insert(int key) {
		Node newNode = this.getNewNode(key);
		Node current_parent = null;
		if (this.root == null) {
			this.root = newNode;
			current_parent = this.root;
		} else {
			Node tempNode = this.root;
			// Finding parent of newly created node.
			while (tempNode != null) {
				current_parent = tempNode;
				if (key < tempNode.key) {
					tempNode = tempNode.left;
				} else if (key > tempNode.key) {
					tempNode = tempNode.right;
				} else {
					System.out.println("Given Value Already Exists.");
					return newNode;
				}
			}
		}
		if (key < current_parent.key) {
			current_parent.left = newNode;
		}
		if (key > current_parent.key) {
			current_parent.right = newNode;
		}
		return current_parent;
	}

	/**
	 * This method is responsible to traverse binary search tree in order manner.
	 */
	public void inOrderTraversal() {
		if (this.root == null) {
			System.out.println("Binary Search Tree is empty.");
			return;
		} else {
			this.inOrderPrint(this.root);
		}
	}

	/**
	 * This method is responsible to traverse binary search tree in order manner
	 * from root.
	 * 
	 * @param root Root Node.
	 */
	private void inOrderPrint(Node root) {
		if (root == null) {
			return;
		}
		this.inOrderPrint(root.left);
		System.out.print(root.key + " ");
		this.inOrderPrint(root.right);
	}
	
	public boolean findPairForGivenSum(int sum) {
		List<Integer> list = new ArrayList<>();
		return this.findPairInTree(root, sum, list);
	}
	
	private boolean findPairInTree(Node root, int sum, List<Integer> list) {
		if (root == null) {
			return false;
		}
		if (findPairInTree(root.left, sum, list)) {
			return true;
		}
		if (list.contains(sum - root.key)) {
			System.out.println(
					"Pair found for given sum "+sum+" in Tree. Pair := "
					+ "("+(sum - root.key)+","+root.key+")");
			return true;
		} else {
			list.add(root.key);
		}
		return findPairInTree(root.right, sum, list);
	}
}
