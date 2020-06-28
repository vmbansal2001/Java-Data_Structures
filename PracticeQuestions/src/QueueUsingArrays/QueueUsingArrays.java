package QueueUsingArrays;

public class QueueUsingArrays {

	protected int[] data;
	protected int size;
	protected int front;

	public static final int DEFAULT_CAPACITY = 10;

	public QueueUsingArrays() throws Exception {
		// TODO Auto-generated constructor stub
		this(DEFAULT_CAPACITY);
	}

	public QueueUsingArrays(int capacity) throws Exception {
		if (capacity < 0) {
			throw new Exception("Invalid Capacity");
		}

		this.data = new int[capacity];
		this.front = 0;
		this.size = 0;
	}

	public int size() {
		return this.size;
	}

	public boolean isEmpty() {
		return this.size == 0;
	}

	public void enqueue(int item) throws Exception {

		if (this.size == this.data.length) {
			throw new Exception("Queue is Full");
		}

		int ai = (this.front + this.size) % this.data.length;
		this.data[ai] = item;
		this.size++;

	}

	public int dequeue() throws Exception {

		if (isEmpty())
		{throw new Exception ("Queue is Empty");}
		
		int rv = this.data[front];
		this.data[front] = 0;
		this.size--;
		this.front = (this.front + 1)%this.data.length;
		return rv;
	}
	
	public int front() throws Exception {

		if (isEmpty())
		{throw new Exception ("Queue is Empty");}
		
		int rv = this.data[front];
		return rv;
	}
	
	public void display() {
		
		for (int i = 0; i<this.size(); i++)
		{
			int ai = (this.front + i)%data.length;
			System.out.print(this.data[ai] + "=>");
			
		}
		System.out.println("END");
	}
	
	

}
