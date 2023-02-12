package com.gllearning.binary.search.tree;

import java.util.Deque;
import java.util.LinkedList;

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
	 * This method is responsible to search given value inside tree.
	 * 
	 * @param searchValue
	 * @return true if search value is found otherwise false.
	 */
	public boolean search(int searchValue) {
		Node searchNode = this.searchRecursively(root, searchValue);
		return (searchNode != null);
	}

	/**
	 * This method is responsible to search given key recursively inside tree.
	 * 
	 * @param tempNode    Object of Node.
	 * @param searchValue
	 * @return Node Object.
	 */
	private Node searchRecursively(Node tempNode, int searchValue) {
		if (tempNode == null || tempNode.key == searchValue) {
			return tempNode;
		}
		if (searchValue < root.key) {
			return this.searchRecursively(tempNode.left, searchValue);
		} else {
			return this.searchRecursively(tempNode.right, searchValue);
		}
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

	public void levelOrderTraversal() {
		if (this.root == null) {
			System.out.println("Binary Search Tree is Empty.");
		} else {
			Deque<Node> queue = new LinkedList<Node>();
			queue.add(root);
			while (!queue.isEmpty()) {
				Node node = queue.poll();
				System.out.print(node.key + " ");
				if (node.left != null) {
					queue.add(node.left);
				}
				if (node.right != null) {
					queue.add(node.right);
				}
			}
		}
		System.out.println();
	}

	public void delete(int key) {
		this.root = this.deleteRecursively(root, key);
	}

	private Node deleteRecursively(Node root, int key) {
		// Tree is empty.
		if (root == null) {
			return root;
		}
		if (key < root.key) {
			// Traverse left subtree.
			root.left = deleteRecursively(root.left, key);
		} else if (key > root.key) {
			// Traverse right subtree
			root.right = deleteRecursively(root.right, key);
		} else {
			// Case 1: Leaf node. Both left and right reference is NULL
			if (root.left == null && root.right == null) {
				return null;
			}
			// Case 2: Node has right child.
			// replace the root node with root->right and free the right node
			if (root.left == null) {
				return root.right;
			}
			// Case 3: Node has left child.
			// replace the node with root->left and free the left node
			else if (root.right == null) {
				return root.left;
			}
			// Case 4: Node has both left and right children.
			// Node contains two children.
			// Find Inorder successor. i.e (Smallest in the right subtree)
			root.key = this.minValue(root.right);
			// Delete the InOrder Successor.
			// And again call the remove function to delete the node which has the min value
			// which is root.key.
			// Since we find the min value from the right subtree call the remove function
			// with root.right.
			root.right = deleteRecursively(root.right, root.key);
		}
		return root;
	}

	private int minValue(Node root) {
		int minValue = root.key;
		while (root.left != null) {
			minValue = root.left.key;
			root = root.left;
		}
		return minValue;
	}

	public int calculateHeightOfTree() {
		return this.heightOfTree(root);
	}

	/**
	 * Calculating height of the tree.
	 * 
	 * @param root Object of Root Node.
	 * @return Height of the tree.
	 */
	private int heightOfTree(Node root) {
		if (root == null) {
			return 0;
		} else {
			int leftHeight = heightOfTree(root.left);
			int rightHeight = heightOfTree(root.right);
			if (leftHeight > rightHeight) {
				return (leftHeight + 1);
			} else {
				return (rightHeight + 1);
			}
		}
	}

	public void leftSkewedTree() {
		this.printLeftSkewedTree(root);
	}

	private void printLeftSkewedTree(Node root) {
		if (root == null) {
			return;
		} else {
			System.out.print(root.key + " ");
			this.printLeftSkewedTree(root.left);
		}
	}
}
