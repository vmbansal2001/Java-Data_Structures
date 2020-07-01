package StacksAndQueues;

public class SUQPopEfficientClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		SUQPopEfficient stack = new SUQPopEfficient();
		
		for (int i =1; i<=9; i++)
		{
			stack.push(i*10);
			stack.display();
		}
		
//		System.out.println(stack.size());
//		System.out.println(stack.top());
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		while(!stack.isEmpty())
		{
			stack.display();
			stack.pop();
		}
		
	}

}
