package com.glearning.dsa.grp.proj.ques2;

/**
 * This class is responsible to convert a Binary Search Tree in Skewed Tree. So
 * that we can able to convert all transaction data structured in BST to Right
 * Skewed Tree as per requirement(BST should not contain any left node and
 * display the node values present in ascending order).
 * 
 * @author Dipanjan, Latika, Amit, Arka.
 * @since 12-Feb-2023
 * @version 1.0
 */
public class TransactionProblem {
	private Node prevNode;
	private Node headNode;

	public TransactionProblem() {
		super();
	}

	/**
	 * This method is responsible to convert a Binary Search Tree to Right Skewed
	 * Tree.
	 * 
	 * @param node Object of Node class.
	 */
	public void convertBSTToRightSkewedTree(Node root) {
		// Base Case
		if (root == null) {
			return;
		}
		// In order Traversal.
		convertBSTToRightSkewedTree(root.left);
		Node rightNode = root.right;
		// Condition to check if the root Node of the skewed tree is NULL.
		if (headNode == null) {
			headNode = root;
			root.left = null;
			prevNode = root;
		} else {
			prevNode.right = root;
			root.left = null;
			prevNode = root;
		}
		convertBSTToRightSkewedTree(rightNode);
	}

	/**
	 * This method is responsible to get Head of the Skewed Tree.
	 * 
	 * @return Object of Head Node of Skewed Tree.
	 */
	public Node getHeadNodeOfSkewedTree() {
		return headNode;
	}

	/**
	 * This method is responsible to traverse the each node of Skewed tree and print
	 * each node's value.
	 * 
	 * @param rootNode Object of Root Node of Skewed Tree.
	 */
	public void traversalOfSkewedTree(Node rootNode) {
		if (rootNode == null) {
			return;
		}
		System.out.print(rootNode.key + " ");
		traversalOfSkewedTree(rootNode.right);
	}
}
