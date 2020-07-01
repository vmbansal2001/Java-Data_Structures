package StacksAndQueues;

import DynamicQueue.DynamicQueue;

public class SUQPushEfficient {

	private DynamicQueue primary;
	private DynamicQueue secondary;

	public SUQPushEfficient() throws Exception {

		this.primary = new DynamicQueue();
		this.secondary = new DynamicQueue();
	}

	public int size() {
		return this.primary.size();
	}

	public boolean isEmpty() {
		return this.primary.isEmpty();
	}

	public void push(int item) throws Exception {
		this.primary.enqueue(item);
	}

	public int pop() throws Exception {

		while (primary.size() != 1) {
			secondary.enqueue(primary.dequeue());
		}

		int rv = primary.dequeue();

		while (!secondary.isEmpty()) {
			primary.enqueue(secondary.dequeue());
		}

		return rv;

	}

	public int top() throws Exception{
		
		while (primary.size() != 1) {
			secondary.enqueue(primary.dequeue());
		}

		int rv = primary.dequeue();
		this.secondary.enqueue(rv);

		while (!secondary.isEmpty()) {
			primary.enqueue(secondary.dequeue());
		}

		return rv;

	}

	public void display() throws Exception {
		
		this.reverse(primary);
		primary.display();
		this.reverse(primary);

	}
	
	private void reverse(DynamicQueue queue) throws Exception {

		if (queue.isEmpty()) {
			return;
		}

		int data = queue.dequeue();
		reverse(queue);
		queue.enqueue(data);

	}

}
