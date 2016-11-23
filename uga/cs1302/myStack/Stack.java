package uga.cs1302.myStack;

import java.util.*;

public class Stack<T> implements StackADT<T> {
	private T[] stack;
	private int top = -1;
	public final int DEFAULT_CAPACITY = 100;
	
	public Stack(int capacity){
		top = -1;
		stack = (T[]) new Object[capacity];
	}
	
	public Stack(){
		top = -1;
		stack = (T[]) new Object[DEFAULT_CAPACITY];
	}

	public  void push(T element) 
	{ 
		try
		{
			top ++;
			stack[top] = element;
		} catch(ArrayIndexOutOfBoundsException e)
		{
			throw new FullStackException(/*"Stack is full."*/);
		}
		
	}

	public T pop()
	{
		T element = null;
		try
		{
			element = (T) stack[top];
			stack[top] = null;
			top--;
			return element;
		} 
		catch (ArrayIndexOutOfBoundsException e)
		{
			throw new EmptyStackException(/*"Stack is empty."*/);
		}		
	}
	
	public T peek() 
	{
		try
		{
			return (T)stack[top];
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
		
			throw new EmptyStackException(/*"Stack is empty."*/);
		}
		
	}
	
	public boolean isEmpty()
	{
		return top == -1;
	}

	public boolean isFull()
	{
		return top + 1 == stack.length;
	}

	public int size()
	{
		int count = 0;
		for (Object t : stack) 
		{
			
				count++;
		}
		return count;
	}
	
	public String toString(){
		String a = "";
		for (Object element : stack) {
			a = a + element + " ";
		}
		return a;
	}

}
