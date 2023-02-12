package com.gllearning.binary.tree.using.linkedlist;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeUsingLinkedList {
	private Node rootNode;
	private Deque<Node> deQueue;

	public BinaryTreeUsingLinkedList() {
		super();
		deQueue = new LinkedList<Node>();
	}

	public Node createNewNode(int value) {
		Node node = new Node(value, null, null);
		return node;
	}

	public boolean insertNode(int value) {
		boolean isInserted = false;
		if (rootNode == null) {
			rootNode = this.createNewNode(value);
			deQueue.add(rootNode);
			isInserted = true;
		} else {
			Node node = deQueue.remove();
			if (node.getLeft() == null) {
				Node newNode = this.createNewNode(value);
				node.setLeft(newNode);
				deQueue.add(newNode);
				deQueue.addFirst(node);
				isInserted = true;
			} else if (node.getRight() == null) {
				Node newNode = this.createNewNode(value);
				node.setRight(newNode);
				deQueue.add(newNode);
				isInserted = true;
			}
		}
		return isInserted;
	}

	private Node findDeletionNode(int value) {
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(rootNode);
		while (!queue.isEmpty()) {
			Node node = queue.poll();
			if (node.getValue() == value) {
				return node;
			}
			if (node.getLeft() != null) {
				queue.add(node.getLeft());
			}
			if (node.getRight() != null) {
				queue.add(node.getRight());
			}
		}
		return null;
	}

	private Node findDeepestRightMostNode() {
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(rootNode);
		Node deepestRightMostNode = null;
		while (!queue.isEmpty()) {
			deepestRightMostNode = queue.poll();
			if (deepestRightMostNode.getLeft() != null) {
				queue.add(deepestRightMostNode.getLeft());
			}
			if (deepestRightMostNode.getRight() != null) {
				queue.add(deepestRightMostNode.getRight());
			}
		}
		return deepestRightMostNode;
	}

	public void deleteNode(int value) {
		if (rootNode == null) {
			System.out.println("Unable to delete " + value + " from Tree as Tree is empty.");
			return;
		}
		if (rootNode.getLeft() == null && rootNode.getRight() == null) {
			if (rootNode.getValue() == value) {
				rootNode = null;
				System.out.println("Node with value " + value + " has been deleted.");
			} else {
				System.out.println("Given " + value + " not found in Tree.");
			}
		} else {
			Node deleteNode = this.findDeletionNode(value);
			if (deleteNode != null) {
				Node deepestRightMostNode = this.findDeepestRightMostNode();
				int deepestRightMostValue  = deepestRightMostNode.getValue();
				this.delete(deepestRightMostNode);
				deleteNode.setValue(deepestRightMostValue);
			}
		}
	}

	private void delete(Node toBeDeletedNode) {
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(rootNode);
		while (!queue.isEmpty()) {
			Node node = queue.poll();
			if (node == toBeDeletedNode) {
				node = null;
			}
			if (node.getLeft() != null) {
				if (node.getLeft() == toBeDeletedNode) {
					node.setLeft(null);
					return;
				} else {
					queue.add(node.getLeft());
				}
			}
			if (node.getRight() != null) {
				if (node.getRight() == toBeDeletedNode) {
					node.setRight(null);
					return;
				} else {
					queue.add(node.getRight());
				}
			}
		}
	}

	public void printTree() {
		if (rootNode == null) {
			return;
		}
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(rootNode);
		while (!queue.isEmpty()) {
			Node node = queue.poll();
			System.out.print(node.getValue() + " ");
			if (node.getLeft() != null) {
				queue.add(node.getLeft());
			}
			if (node.getRight() != null) {
				queue.add(node.getRight());
			}
		}
		System.out.println();
	}
	
	public void levelOrderTraversal() {
		if (rootNode == null) {
			return;
		}
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(rootNode);
		while (!queue.isEmpty()) {
			Node node = queue.poll();
			System.out.print(node.getValue() + " ");
			if (node.getLeft() != null) {
				queue.add(node.getLeft());
			}
			if (node.getRight() != null) {
				queue.add(node.getRight());
			}
		}
		System.out.println();
	}
	
	/**
	 * This is in order traversal of a tree.
	 * 
	 * @param root Object of node.
	 */
	public void inOrder(Node root) {
		if (root == null)
			return;
		else {
			inOrder(root.getLeft());
			System.out.print(root.getValue() + " ");
			inOrder(root.getRight());
		}
	}
	
	public void preOrderTraversal(Node root) {
		if (root == null) {
			return;
		} else {
			System.out.print(root.getValue() + " ");
			this.preOrderTraversal(root.getLeft());
			this.preOrderTraversal(root.getRight());
		}
	}
	
	public void postOrderTraversal(Node root) {
		if (root == null) {
			return;
		} else {
			this.postOrderTraversal(root.getLeft());
			this.postOrderTraversal(root.getRight());
			System.out.print(root.getValue() + " ");
		}
	}
	
	

	public Node getRootNode() {
		return rootNode;
	}
}
