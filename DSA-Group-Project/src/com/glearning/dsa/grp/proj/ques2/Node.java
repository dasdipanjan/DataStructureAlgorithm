package com.glearning.dsa.grp.proj.ques2;

/**
 * This class represents each node of the tree. It holds value of each node and
 * left right pointer to point other nodes.
 * 
 * @author Dipanjan, Latika, Amit, Arka.
 * @since 12-Feb-2023
 * @version 1.0
 */
public class Node {
	public int key;
	public Node left, right;

	public Node(int key) {
		super();
		this.key = key;
		this.left = this.right = null;
	}
}