package LinkedList;

public class GenericLinkedList<T> {

	public class Node {
		T data;
		Node next;
	}

	private Node head;
	private Node tail;
	private int size;

	public void display() {

		Node temp = this.head;
		while (temp != null) {
			System.out.print(temp.data + "=>");
			temp = temp.next;
		}
		System.out.println("END");

	}

	public void addLast(T item) {

		Node nn = new Node();
		nn.data = item;

		if (this.size == 0) {
			this.head = nn;
			this.tail = nn;
		}

		else {
			this.tail.next = nn;
			this.tail = nn;
		}
		this.size++;
	}

	public void addFirst(T item) {

		Node nn = new Node();
		nn.data = item;

		if (this.size == 0) {
			this.head = nn;
			this.tail = nn;
		}

		else {
			nn.next = this.head;
			this.head = nn;
		}
		this.size++;
	}

	public T getFirst() throws Exception {

		if (this.size == 0) {
			throw new Exception("List is Empty");
		}

		return this.head.data;
	}

	public T getLast() throws Exception {

		if (this.size == 0) {
			throw new Exception("List is Empty");
		}
		return this.tail.data;
	}

	public T getAt(int index) throws Exception {

		if (index < 0 || index >= this.size) {
			throw new Exception("Invalid Index");
		}

		if (this.size == 0) {
			throw new Exception("List is Empty");
		}

		Node temp = this.head;
		for (int i = 0; i < index; i++) {
			temp = temp.next;
		}
		return temp.data;
	}

	private Node getNodeAt(int index) throws Exception {

		if (index < 0 || index >= this.size) {
			throw new Exception("Invalid Index");
		}

		if (this.size == 0) {
			throw new Exception("List is Empty");
		}

		Node temp = this.head;
		for (int i = 0; i < index; i++) {
			temp = temp.next;
		}
		return temp;
	}

	public void addAt(int index, T item) throws Exception {

		if (index < 0 || index > this.size) {
			throw new Exception("Invalid Index");
		}

		if (index == 0) {
			this.addFirst(item);
		}

		else if (index == this.size) {
			this.addLast(item);
		}

		else {

			Node nn = new Node();
			nn.data = item;

			Node nm1 = getNodeAt(index - 1);
			nn.next = nm1.next;
			nm1.next = nn;
			this.size++;
		}

	}

	public T removeFirst() throws Exception {

		if (this.size == 0) {
			throw new Exception("List is Empty");
		}

		T rv = this.head.data;

		if (this.size == 1) {
			this.head = null;
			this.tail = null;
			this.size = 0;
		}

		else {
			this.head = this.head.next;
			this.size--;
		}
		return rv;
	}

	public T removeLast() throws Exception {

		if (this.size == 0) {
			throw new Exception("List is Empty");
		}

		T rv = this.tail.data;

		if (this.size == 1) {
			this.head = null;
			this.tail = null;
			this.size = 0;
		}

		else {
			this.tail = getNodeAt(this.size - 2);
			this.tail.next = null;
			this.size--;
		}
		return rv;
	}

	public T removeAt(int index) throws Exception {

		if (index < 0 || index >= this.size) {
			throw new Exception("Invalid Index");
		}

		if (this.size == 0) {
			throw new Exception("List is Empty");
		}

		if (index == 0) {
			return this.removeFirst();
		}

		else if (index == this.size - 1) {
			return this.removeLast();
		}

		else {
			Node nm1 = getNodeAt(index - 1);
			Node n = nm1.next;
			nm1.next = n.next;
			this.size--;
			return n.data;
		}

	}

	public int find(T item) {

		Node temp = this.head;

		for (int index = 0; index < this.size; temp = temp.next) {
			if (temp.data.equals(item)) {
				return index;
			}
			index++;
		}
		return -1;
	}

}
