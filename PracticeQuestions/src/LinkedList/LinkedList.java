package LinkedList;

public class LinkedList {

	private class Node {
		int data;
		Node next;
	}

	private Node head;
	private Node tail;
	private int size;

//	O(n)
	public void display() {
		Node temp = this.head;
		while (temp != null) {
			System.out.print(temp.data + "=>");
			temp = temp.next;
		}
		System.out.println("END");
	}

//	O(1)
	public void addLast(int item) {
		Node nn = new Node();
		nn.data = item;
		nn.next = null;

		if (this.size >= 1) {
			this.tail.next = nn;
		}

		if (this.size == 0) {
			this.head = nn;
			this.tail = nn;
			this.size++;
		}

		else {
			this.tail = nn;
			this.size++;
		}

	}

//	O(1)
	public void addFirst(int item) {

		Node nn = new Node();
		nn.data = item;
		nn.next = null;

		if (this.size >= 1) {
			nn.next = this.head;
		}

		if (this.size == 0) {
			this.head = nn;
			this.tail = nn;
			this.size++;
		}

		else {
			this.head = nn;
			this.size++;
		}

	}

//	O(1)
	public int getFirst() throws Exception {
		if (this.size == 0) {
			throw new Exception("Linked List is Empty");
		}

		return this.head.data;

	}

//	O(1)
	public int getLast() throws Exception {
		if (this.size == 0) {
			throw new Exception("Linked List is Empty");
		}

		return this.tail.data;

	}

//	O(n)
	public int getAt(int index) throws Exception {
		if (index < 0 || index >= this.size) {
			throw new Exception("Index does not exist");
		}

		if (this.size == 0) {
			throw new Exception("List is Empty");
		}

		Node temp = this.head;

		for (int i = 0; i < index; i++) {
			temp = temp.next;
		}

		return temp.data;

		// or we can write it as
		// return this.getNodeAt(index).data;

	}

//	O(n)
	private Node getNodeAt(int index) throws Exception {
		if (index < 0 || index >= this.size) {
			throw new Exception("Index does not exist");
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

//	O(n)
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

		else {

			Node nn = new Node();
			nn.data = item;
			nn.next = null;

			Node nm1 = getNodeAt(index - 1);
			Node np1 = nm1.next;

			nm1.next = nn;
			nn.next = np1;

			this.size++;
		}
	}

//	O(1)
	public int removeFirst() throws Exception {

		if (this.size == 0) {
			throw new Exception("Linked List is Empty");
		}

		int rv = this.head.data;

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

//	O(n)
	public int removeLast() throws Exception {
		if (this.size == 0) {
			throw new Exception("Linked List is Empty");
		}

		int rv = this.tail.data;

		if (this.size == 1) {
			this.head = null;
			this.tail = null;
			this.size = 0;
		}

		else {

			Node lm1 = getNodeAt(this.size - 2);
			this.tail = lm1;
			this.tail.next = null;
			this.size--;
		}
		return rv;

	}

//	O(n)
	public int removeAt(int index) throws Exception {
		if (this.size == 0) {
			throw new Exception("Linked List is Empty");
		}

		if (index < 0 || index >= this.size) {
			throw new Exception("Invalid Index");
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

	public void reverseData() throws Exception {

		int left = 0;
		int right = this.size - 1;

		while (left < right) {

			Node lt = getNodeAt(left);
			Node rt = getNodeAt(right);

			int temp = lt.data;
			lt.data = rt.data;
			rt.data = temp;

			left++;
			right--;

		}

	}

	public void reversePointers() {

		Node prev = this.head;
		Node curr = prev.next;

		while (curr != null) {
			Node ahead = curr.next;
			curr.next = prev;

			prev = curr;
			curr = ahead;
		}
		Node t = this.head;
		this.head = this.tail;
		this.tail = t;
		this.tail.next = null;
	}

	public int midElement() {

		Node s = this.head;
		Node d = this.head;

		while (d.next != null && d.next.next != null) {
			s = s.next;
			d = d.next.next;
		}
		return s.data;
	}

}
