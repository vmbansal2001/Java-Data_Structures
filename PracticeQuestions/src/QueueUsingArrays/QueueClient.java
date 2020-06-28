package QueueUsingArrays;

public class QueueClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		QueueUsingArrays queue = new QueueUsingArrays(5);

		for (int i = 1; i <= 5; i++) {
			queue.enqueue(i*10);
			queue.display();
		}
		
//		queue.enqueue(90);
		
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		
		queue.display();
		
		queue.isEmpty();
		queue.enqueue(60);
		queue.enqueue(70);
		queue.display();
		
		System.out.println(queue.front());
		
		while (!queue.isEmpty())
		{
			System.out.println(queue.dequeue());
		}
		
//		queue.dequeue();
		
		System.out.println("BYE");

	}

}
