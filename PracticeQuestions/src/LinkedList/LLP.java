package LinkedList;

public class LLP {

	public class Node {
		int data;
		Node next;
	}

	private Node head;
	private Node tail;
	private int size;

	public LLP() {
		this.head = null;
		this.tail = null;
		this.size = 0;
	}

	public void display() {
		Node temp = this.head;
		while (temp != null) {
			System.out.print(temp.data + ", ");
			temp = temp.next;
		}
		System.out.println("END");
	}

	public void addLast(int item) {

		Node node = new Node();
		node.data = item;

		if (size == 0) {
			this.head = node;
			this.tail = node;
		}

		else {
			this.tail.next = node;
			this.tail = node;
		}

		this.size++;
	}

	public void addFirst(int item) {

		Node node = new Node();
		node.data = item;

		if (size == 0) {
			this.head = node;
			this.tail = node;
		}

		else {
			node.next = this.head;
			this.head = node;
		}
		this.size++;
	}

	public int getFirst() throws Exception {
		if (size == 0) {
			throw new Exception("LL is Empty");
		}

		return this.head.data;
	}

	public int getLast() throws Exception {

		if (size == 0) {
			throw new Exception("LL is Empty");
		}

		return this.tail.data;

	}

	public int getAt(int index) throws Exception {
		if (index < 0 || index > this.size) {
			throw new Exception("Invalid Index");
		}

		if (this.size == 0) {
			throw new Exception("LL is Empty");
		}

		Node temp = this.head;
		for (int i = 0; i < index; i++) {
			temp = temp.next;
		}
		return temp.data;
	}

	public Node getNodeAt(int index) throws Exception {
		if (index < 0 || index > this.size) {
			throw new Exception("Invalid Index");
		}

		if (this.size == 0) {
			throw new Exception("LL is Empty");
		}

		Node temp = this.head;
		for (int i = 0; i < index; i++) {
			temp = temp.next;
		}
		return temp;
	}

	public void addAt(int item, int index) throws Exception {

		if (index < 0 || index > this.size) {
			throw new Exception("Invalid Index");
		}

		else if (index == 0) {
			addFirst(item);
		}

		else if (index == this.size) {
			addLast(item);
		}

		Node nn = new Node();
		nn.data = item;

		Node pr = getNodeAt(index - 1);
		nn.next = pr.next;
		pr.next = nn;

		this.size++;
	}

	public int removeFirst() throws Exception {

		if (this.size == 0) {
			throw new Exception("LL is Empty");
		}
		int rv = this.head.data;
		if (this.size == 1) {
			this.head = null;
			this.tail = null;
		}

		else {
			this.head = this.head.next;
		}

		this.size--;
		return rv;
	}

	public int removeLast() throws Exception {

		if (this.size == 0) {
			throw new Exception("LL is Empty");
		}

		int rv = this.tail.data;

		if (this.size == 1) {
			this.head = null;
			this.tail = null;
		}

		else {
			this.tail = getNodeAt(this.size - 2);
			this.tail.next = null;
		}

		this.size--;
		return rv;
	}

	public int removeAt(int index) throws Exception {

		if (this.size == 0) {
			throw new Exception("LL is Empty");
		}

		if (index == 0 || index >= this.size) {
			throw new Exception("Invalid Index");
		}

		if (index == 0) {
			return removeFirst();
		}

		else if (index == this.size) {
			return removeLast();
		}
		
		else {
			
			Node nm1 = getNodeAt(index-1);
			int rv = nm1.next.data;
			nm1.next = nm1.next.next;
			this.size--;
			return rv;
		}
		
		
		

	}

}
