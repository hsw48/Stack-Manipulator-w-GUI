package uga.cs1302.myStack;

import org.junit.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class MyStackTester {

	@Test
	public void testPush() {
		Stack<String> myStack = new Stack<>();
		myStack.push("1");
		myStack.push("2");
		assertEquals(myStack.pop(),"2");
	}
	
	@Test
	public void testPop() {
		Stack<String> myStack = new Stack<>();
		myStack.push("1");
		myStack.push("2");
		assertEquals(myStack.pop(), "2");
	}

}
