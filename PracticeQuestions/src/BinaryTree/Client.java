package BinaryTree;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		10 true 20 true 40 false false true 50 false false true 30 true 60 false false true 73 false false
		BinaryTree tree = new BinaryTree();
		
		tree.display();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		tree.postOrder();
		System.out.println("~~~~~~~~~~~~~~");
		tree.inOrder();
		System.out.println("~~~~~~~~~~~~~~~~");
		tree.preOrder();

	}

}
