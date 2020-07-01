package GenericTree;

import java.util.ArrayList;
import java.util.Scanner;

public class GTP {

	private class Node {
		int data;
		ArrayList<Node> children;

		Node(int data) {
			this.data = data;
			this.children = new ArrayList<>();
		}
	}

	private Node root;
	private int size;

	public GTP() {
		Scanner s = new Scanner(System.in);
		this.root = takeInput(s, null, 0);
	}

	public Node takeInput(Scanner s, Node Parent, int ithchild) {

		if (Parent == null) {
			System.out.println("Enter the data for root Node");
		}

		else {
			System.out.println("Enter the data for " + ithchild + "th child of " + Parent.data);
		}

		int nodedata = s.nextInt();
		Node node = new Node(nodedata);
		this.size++;

		System.out.println("Enter the no. of children for " + nodedata);
		int noc = s.nextInt();

		for (int i = 0; i < noc; i++) {
			Node Child = this.takeInput(s, node, i);
			node.children.add(Child);
		}
		return node;
	}
	
	public void display ()
	{
		this.display(this.root);
	}
	
	private void display (Node node)
	{
		String str;
		str = node.data + "=>";
		
		for (int i = 0; i<node.children.size(); i++)
		{
			str = str + node.children.get(i).data + ", ";
		}
		
		str = str + "END";
		System.out.println(str);
		
		for (int i = 0; i<node.children.size(); i++)
		{
			this.display(node.children.get(i));
		}
		
	}

}
