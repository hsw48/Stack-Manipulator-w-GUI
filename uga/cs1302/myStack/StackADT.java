package uga.cs1302.myStack;

/**
 * * Defines the interface to a stack collection.
 * 
 * @author Harrison Woodward
 */
public interface StackADT<T> 
{
	/**  
	 * Adds the specified element to the top of this stack. 
	 * @param element element to be pushed onto the stack
	 * @throws FullStackException 
	 */
	public void push(T element) throws FullStackException;
	
	/**  
	 * Removes and returns the top element from this stack. 
	 * @return the element removed from the stack
	 * @throws EmptyStackException 
	 */
	public T pop() throws EmptyStackException;
	
	/**  
	 * Returns without removing the top element of this stack. 
	 * @return the element on top of the stack
	 * @throws EmptyStackException 
	 */
	public T peek() throws EmptyStackException;
	
	/**  
	 * Returns true if this stack contains no elements. 
	 * @return true if the stack is empty
	 */
	public boolean isEmpty ();
	
	/**  
	 * Returns true if this stack is full;number of elements= stak.length. 
	 * @return true if the stack is full
	 */
	public boolean isFull();
	
	/** 
	 * Returns the number of elements in this stack. 
	 * @return the number of elements in the stack
	 */
	public int size();
	
	/**
	 * Returns a string representation of this stack. 
	 * @return a string representation of the stack
	 */
	public String toString();
	
}
