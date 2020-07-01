package GenericTree;

import java.util.ArrayList;
import java.util.Scanner;

public class GenericTree {

	private class Node {
		int data;
		ArrayList<Node> childern;

		Node(int data) {
			this.data = data;
			this.childern = new ArrayList<>();
		}

	}

	private Node root;
	private int size;

	public GenericTree() {
		Scanner s = new Scanner(System.in);
		this.root = TakeInput(s, null, 0);
	}

	public Node TakeInput(Scanner s, Node Parent, int ithchild) {
		if (Parent == null) {
			System.out.println("Enter the Data For root Node");
		}

		else {
			System.out.println("Enter the Data For " + ithchild + "th child of " + Parent.data);
		}

		int nodedata = s.nextInt();
		Node node = new Node(nodedata);
		this.size++;

		System.out.println("Enter the no. of childrens for " + nodedata);
		int noc = s.nextInt();

		for (int i = 0; i < noc; i++) {
			Node Child = TakeInput(s, node, i);
			node.childern.add(Child);
		}

		return node;
	}

	public void display() {
		display(this.root);
	}

	private void display(Node node) {
		String str = node.data + "=>";

		for (int i = 0; i < node.childern.size(); i++) {
			str = str + node.childern.get(i).data + ", ";
		}

		str = str + "END";
		System.out.println(str);

		for (int i = 0; i < node.childern.size(); i++) {
			this.display(node.childern.get(i));
		}

	}

}
