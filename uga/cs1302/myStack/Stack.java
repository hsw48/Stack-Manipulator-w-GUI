package uga.cs1302.myStack;

import java.util.*;

public class Stack<T> implements StackADT<T> {
	private T[] stack;
	private int top = -1;
	public final int DEFAULT_CAPACITY = 10;
	
	public Stack(int capacity){
		stack = (T[]) new Object[capacity];
	}
	
	public Stack(){
		stack = (T[]) new Object[DEFAULT_CAPACITY];
	}
	
	@Override
	public  void push(T element)
	{
		stack[top + 1] = element;
		top ++;
	}
	
	@Override
	public T pop()
	{
		T element = stack[top];
		top--;
		return element;
	}
	
	@Override
	public T peek()
	{
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
		return stack.toString();
	}

}
