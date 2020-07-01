package BinarySearchTree;

public class BinarySearchTree {

	private class Node {

		int data;
		Node Left;
		Node Right;

		Node(int data) {
			this.data = data;
			this.Left = null;
			this.Right = null;

		}

	}

	Node root;
	int size;

	public BinarySearchTree(int[] arr) {

		this.root = this.construct(arr, 0, arr.length - 1);
	}

	private Node construct(int[] arr, int lo, int hi) {
		if (lo > hi) {
			return null;
		}

		int mid = (lo + hi) / 2;
		Node node = new Node(arr[mid]);
		node.Left = construct(arr, lo, mid - 1);
		node.Right = construct(arr, mid + 1, hi);

		return node;
	}

	public void display() {
		this.display(this.root);
	}

	private void display(Node node) {

		if (node == null) {
			return;
		}

		if (node.Left == null) {
			System.out.print("END-->");
		} else {
			System.out.print(node.Left.data + "-->");
		}

		System.out.print(node.data);

		if (node.Right == null) {
			System.out.println("<--END");
		} else {
			System.out.println("<--" + node.Right.data);
		}

		this.display(node.Left);
		this.display(node.Right);

	}

	public boolean find(int item) {
		return find(item, root);
	}

	private boolean find(int item, Node node) {
		if (node == null) {
			return false;
		}

		int data = node.data;

		if (data == item) {
			return true;
		}

		else if (data > item) {
			return find(item, node.Left);
		}

		else if (data < item) {
			return find(item, node.Right);
		}

		return false;

	}

	public int max() {
		return this.max(this.root);
	}

	private int max(Node node) {
		if (node.Right == null) {
			return node.data;
		}

		return max(node.Right);

	}

	public int min() {
		return this.min(this.root);
	}

	private int min(Node node) {
		if (node.Left == null) {
			return node.data;
		}

		return min(node.Left);

	}

	public void add(int item) {
		this.add(this.root, item);
	}

	private void add(Node node, int item) {

		if (node.data > item) {

			if (node.Left == null) {
				Node nn = new Node(item);
				node.Left = nn;
			}

			else {
				add(node.Left, item);
			}
		}

		else {

			if (node.Right == null) {
				Node nn = new Node(item);
				node.Right = nn;
			}

			else {
				add(node.Right, item);
			}
		}
	}

	public void remove(int item) {
		this.root = this.remove(this.root, item);
	}

	private Node remove(Node node, int data) {
		if (node == null) {
			return null;
		}

		if (data < node.data) {
			node.Left = this.remove(node.Left, data);
			return node;
		} else if (data > node.data) {
			node.Right = this.remove(node.Right, data);
			return node;
		} else {
			if (node.Left == null && node.Right == null) {
				// no child
				this.size--;
				return null;
			} else if (node.Right == null) {
				// only left child
				this.size--;
				return node.Left;

			} else if (node.Left == null) {
				// only right child
				this.size--;
				return node.Right;
			} else {
				// both child

				int lmax = this.max(node.Left);
				node.data = lmax;
				node.Left = this.remove(node.Left, lmax);
				return node;
			}
		}
	}
}