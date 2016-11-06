package uga.cs1302.myStack;

public class EmptyStackException extends RuntimeException {

	public EmptyStackException() {}
	
	public EmptyStackException(String message) 
	{
		super(message);
	}
}
