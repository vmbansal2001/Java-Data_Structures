package StacksAndQueues;

import DynamicStack.DynamicStack;

public class QUSEnqueueEfficient {
	
	protected DynamicStack primary;
	protected DynamicStack secondary;
	
	public QUSEnqueueEfficient() throws Exception{
	
		this.primary = new DynamicStack();
		this.secondary = new DynamicStack();
		
		
	}
	
	public int size()
	{
		return this.primary.size();
	}
	
	public boolean isEmpty()
	{
		return this.primary.isEmpty();
	}
	
	public void enqueue (int item) throws Exception
	{
		this.primary.push(item);
	}
	
	public int dequeue() throws Exception
	{
		while (primary.size()!=1)
		{
			secondary.push(primary.pop());
		}
		
		int rv = primary.pop();
		
		while (!secondary.isEmpty())
		{
			primary.push(secondary.pop());
		}
		
		return rv;
		
	}
	
	public int front() throws Exception
	{
		while (primary.size()!=1)
		{
			secondary.push(primary.pop());
		}
		
		int rv = this.primary.top();
		
		while (!secondary.isEmpty())
		{
			primary.push(secondary.pop());
		}
		
		return rv;
		
	}
	
	public void display () throws Exception
	{
		
		while(!primary.isEmpty())
		{
			secondary.push(primary.pop());
		}
		
		this.secondary.display();
		
		while(!secondary.isEmpty())
		{
			primary.push(secondary.pop());
		}
		
		
	}

}
