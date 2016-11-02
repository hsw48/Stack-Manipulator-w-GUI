package uga.cs1302.myStack;

public class EmptyStackException extends Exception {

	public EmptyStackException() {}
	
	public EmptyStackException(String message) 
	{
		super(message);
	}
}
