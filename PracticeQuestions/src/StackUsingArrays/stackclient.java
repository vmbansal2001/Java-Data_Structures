package StackUsingArrays;

public class stackclient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		StackUsingArrays stack = new StackUsingArrays(5);

		for (int i = 1; i <= 5; i++) {
			stack.push(i * 10);
			stack.display();
		}

		System.out.println(stack.size());
		System.out.println(stack.top());

//		stack.push(60);
		System.out.println("*************************************************");

		while (!stack.isEmpty()) {
			System.out.print(stack.pop() + ", ");
		}
		System.out.println("EMPTY");

		System.out.println(stack.isEmpty());
//		stack.pop();
		
	}

}
