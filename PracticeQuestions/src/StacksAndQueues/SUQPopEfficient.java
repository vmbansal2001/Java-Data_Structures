package StacksAndQueues;

import DynamicQueue.DynamicQueue;

public class SUQPopEfficient {

	private DynamicQueue primary;
	private DynamicQueue secondary;

	public SUQPopEfficient() throws Exception {

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

		while (!primary.isEmpty()) {
			secondary.enqueue(primary.dequeue());
		}

		primary.enqueue(item);
		while (!secondary.isEmpty()) {
			primary.enqueue(secondary.dequeue());
		}

	}

	public int pop() throws Exception {
		return this.primary.dequeue();
	}

	public int top() throws Exception {
		return this.primary.front();
	}

	public void display() {
		this.primary.display();
	}

}
