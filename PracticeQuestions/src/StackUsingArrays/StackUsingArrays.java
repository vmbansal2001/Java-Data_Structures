package StackUsingArrays;

public class StackUsingArrays {

	protected int[] data;
	protected int tos;

	public static final int DEFAULT_CAPACITY = 10;

	public StackUsingArrays() throws Exception {
		// TODO Auto-generated constructor stub

		this(DEFAULT_CAPACITY);

	}

	public StackUsingArrays(int capacity) throws Exception {

		if (capacity <= 0) {
			throw new Exception("Invalid Capacity");
		}

		this.tos = -1;
		this.data = new int[capacity];

	}

	public int size() {
		return this.tos + 1;
	}

	public boolean isEmpty() {
		return size() == 0;
	}

	public void push(int item) throws Exception {

		if (this.size() == this.data.length) {
			throw new Exception("Stack is Full");
		}
		this.tos++;
		data[this.tos] = item;
		

	}

	public int pop() throws Exception {

		if (tos == -1) {
			throw new Exception("Stack is Empty");
		}

		int rv = data[this.tos];
		data[this.tos] = 0;
		this.tos--;
		return rv;
	}

	public int top() throws Exception {

		if (tos == -1) {
			throw new Exception("Stack is Empty");
		}

		int rv = data[this.tos];
		return rv;
	}
	
	public void display ()
	{
		
		for (int i =0; i<=this.tos; i++)
		{
			System.out.print(data[i] + ", ");
		}
		
		System.out.println("END");
		
	}

}
