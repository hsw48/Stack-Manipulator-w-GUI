package uga.cs1302.myStack;

import org.junit.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class MyStackTester {

	public Stack<String> myStack = new Stack<>();
	
	@Test
	public void testPush() {
		myStack.push("1");
		myStack.push("2");
		assertEquals(myStack.pop(),"2");
	}
	
	@Test
	public void testPop() {
		myStack.push("1");
		myStack.push("2");
		assertEquals(myStack.pop(), "2");
	}

}
