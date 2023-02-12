package com.glearning.dsa.grp.proj.ques2;

/**
 * This class is responsible to provide transaction data structured in BST to
 * {@link TransactionProblem} class and call method to print Transaction data in
 * ascending order.
 * 
 * @author Dipanjan, Latika, Amit, Arka
 * @since 12-Feb-2023
 * @version 1.0
 */
public class TransactionProblemTest {
	/**
	 * This is the entry point of this program. This method is called by JVM with
	 * the help of main thread.
	 * 
	 * @param args String array for command line arguments.
	 */
	public static void main(String[] args) {
		TransactionProblem transactionProblem = new TransactionProblem();
		Node rootNode = new Node(50);
		rootNode.left = new Node(30);
		rootNode.right = new Node(60);
		rootNode.left.left = new Node(10);
		rootNode.right.left = new Node(55);
		transactionProblem.convertBSTToRightSkewedTree(rootNode);
		Node headNodeOfSkewedTree = transactionProblem.getHeadNodeOfSkewedTree();
		transactionProblem.traversalOfSkewedTree(headNodeOfSkewedTree);
	}
}
