package uga.cs1302.myStack;

import java.util.*;

public class Stack<T> implements StackADT<T> {
	private T[] stack;
	private int top = -1;
	public final int DEFAULT_CAPACITY = 10;
	
	public Stack(int capacity){
		top = -1;
		stack = (T[]) new Object[capacity];
	}
	
	public Stack(){
		top = -1;
		stack = (T[]) new Object[DEFAULT_CAPACITY];
	}
	
	@Override
	public  void push(T element) 
	{ 
		try
		{
			stack[top + 1] = element;
			top ++;
		} catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
		}
		
	}
	
	@Override
	public T pop()
	{
		try
		{
			T element = stack[top];
			stack[top] = null;
			top--;
			return element;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.print(e.getMessage());
		}
		
		
		
	}
	
	@Override
	public T peek() throws EmptyStackException
	{
		if (isEmpty()) 
		{
			throw new EmptyStackException();
		}
		return stack[top];
	}
	
	@Override
	public boolean isEmpty()
	{
		return top == -1;
	
	}
	
	@Override
	public boolean isFull()
	{
		return top + 1 == stack.length;
	}
	
	@Override
	public int size()
	{
		int count = 0;
		for (T t : stack) 
		{
			if (t != null) 
			{
				count++;
			}
		}
		return count;
	}
	
	@Override
	public String toString(){
		String a = "";
		for (T element : stack) {
			a = a + element + ", ";
		}
		return a;
	}

}
