package StacksAndQueues;

import DynamicStack.DynamicStack;

public class QUSDequeueEfficient {

	private DynamicStack primary;
	private DynamicStack secondary;

	public QUSDequeueEfficient() throws Exception {

		this.primary = new DynamicStack();
		this.secondary = new DynamicStack();

	}

	public int size() {
		return this.primary.size();
	}

	public boolean isEmpty() {
		return this.primary.isEmpty();
	}

	public void enqueue(int item) throws Exception {

		while (!primary.isEmpty()) {
			secondary.push(primary.pop());
		}

		primary.push(item);

		while (!secondary.isEmpty()) {
			primary.push(secondary.pop());
		}

	}

	public int dequeue() throws Exception {
		return this.primary.pop();
	}

	public int front() throws Exception {
		return this.primary.top();

	}

	public void display() throws Exception {

		while (!primary.isEmpty()) {
			secondary.push(primary.pop());
		}

		this.secondary.display();

		while (!secondary.isEmpty()) {
			primary.push(secondary.pop());
		}

	}

}
