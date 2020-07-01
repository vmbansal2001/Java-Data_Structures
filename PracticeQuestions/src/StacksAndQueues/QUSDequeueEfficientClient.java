package StacksAndQueues;

public class QUSDequeueEfficientClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		QUSDequeueEfficient queue = new QUSDequeueEfficient();

		for (int i = 1; i <= 9; i++) {
			queue.enqueue(i * 10);
			queue.display();
		}

		System.out.println(queue.isEmpty());
		System.out.println(queue.size());
		System.out.println(queue.front());

		while (!queue.isEmpty()) {
			System.out.println(queue.dequeue());
		}

	}

}