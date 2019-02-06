
public class ArrayBasedStack<T> implements StackInterface<T>
{
	private T[] data;
	private int topOfStack;
	private static final int INITAL_CAPACITY = 5;
	
	public ArrayBasedStack(int capacity)
	{
		if(capacity <= 0) 
		{
			throw new IllegalArgumentException("Array initial size error.");
		}
		
		@SuppressWarnings("unchecked")
		T[] tempStack = (T[])new Object[capacity];
		data = tempStack;
		topOfStack = -1;
	}
	
	public ArrayBasedStack()
	{
		data = (T[]) new Object[INITAL_CAPACITY];
	}
	
	private T[] expandArray()
	{
		 
	}
	
	private boolean ArrayFull()
	{
		boolean value;
		
		if(topOfStack > data.length)
		{
			value = true;
		}
		
		else
		{
			value = false;
		}
		
		return value;
	}
	
	public void push(T value)
	{
		
	}
	
	public boolean isEmpty()
	{
		
	}
	
	public void clear()
	{
		
	}
	
	public T peek()
	{
		
	}
	
	public T pop()
	{
		
	}
}
