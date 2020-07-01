package StacksAndQueues;

public class SUQPushEfficientClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		SUQPushEfficient stack = new SUQPushEfficient();
		
		for(int i = 1; i<=9;i++)
		{
			stack.push(i*10);
			stack.display();
		}
		
		System.out.println(stack.size());
//		stack.display();
		System.out.println(stack.top());
//		stack.display();
		
		while (!stack.isEmpty())
		{
			stack.display();
			stack.pop();
			
		}
		
		

	}

}
