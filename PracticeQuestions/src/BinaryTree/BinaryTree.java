package BinaryTree;

import java.util.LinkedList;
import java.util.Scanner;

public class BinaryTree {

	public class Node {

		int data;
		Node left;
		Node right;

		public Node(int data) {
			this.data = data;
		}
	}

	Node root;
	int size;

	public BinaryTree() {
		Scanner s = new Scanner(System.in);
		this.root = takeInput(s, null, false);
	}

	private Node takeInput(Scanner s, Node parent, boolean isLeftorRight) {
		if (parent == null) {
			System.out.println("Enter the data for root Node: ");
		}

		else {
			if (isLeftorRight) {
				System.out.println("Enter the data for left child of " + parent.data);
			} else {
				System.out.println("Enter the data for right child of " + parent.data);

			}
		}

		int nodedata = s.nextInt();
		Node node = new Node(nodedata);
		this.size++;

		boolean choice = false;
		System.out.println("Do you have a left child for " + nodedata);
		choice = s.nextBoolean();
		if (choice) {
			node.left = takeInput(s, node, true);
		}

		choice = false;
		System.out.println("Do you have a right child for " + nodedata);
		choice = s.nextBoolean();
		if (choice) {
			node.right = takeInput(s, node, false);
		}
		return node;
	}

	public void display() {
		this.display(root);
	}

	private void display(Node node) {

		if (node.left == null) {
			System.out.print("END=> ");
		}

		else {
			System.out.print(node.left.data + "=> ");
		}

		System.out.print(node.data);

		if (node.right == null) {
			System.out.println(" <=END");
		}

		else {
			System.out.println(" <=" + node.right.data);
		}

		if (node.left != null) {
			display(node.left);
		}

		if (node.right != null) {
			display(node.right);
		}

	}

	public int height() {
		return this.height(this.root);
	}

	private int height(Node node) {
		if (node == null) {
			return -1;
		}

		int lheight = height(node.left);
		int rheight = height(node.right);

		int height = Math.max(lheight, rheight) + 1;
		return height;
	}

	public void preOrder() {
		this.preOrder(this.root);
		System.out.println("END");
	}

	private void preOrder(Node node) {
		if (node == null) {
			return;
		}

		System.out.print(node.data + ", ");
		preOrder(node.left);
		preOrder(node.right);

	}

	public void postOrder() {
		this.postOrder(this.root);
		System.out.println("END");
	}

	private void postOrder(Node node) {
		if (node == null) {
			return;
		}

		postOrder(node.left);
		postOrder(node.right);
		System.out.print(node.data + ", ");
	}

	public void inOrder() {
		this.inOrder(this.root);
		System.out.println("END");
	}

	private void inOrder(Node node) {
		if (node == null) {
			return;
		}

		inOrder(node.left);
		System.out.print(node.data + ", ");
		inOrder(node.right);

	}

	public void levelOrder() {
		LinkedList<Node> list = new LinkedList<>();
		list.add(this.root);

		while (!list.isEmpty()) {
			Node rv = list.removeFirst();
			System.out.print(rv.data + ", ");
			if (rv.left != null) {
				list.addLast(rv.left);
			}

			if (rv.right != null) {
				list.addLast(rv.right);
			}

		}
		System.out.println("END");
	}

}
