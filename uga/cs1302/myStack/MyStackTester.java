package uga.cs1302.myStack;

import org.junit.*;
import static org.junit.Assert.*;
import org.junit.Test;


public class MyStackTester {

	@Test
	public void testDefaultConstructor(){
		Stack<Integer> stack = new Stack<>();
		assertEquals(stack.size(), 100);
	}

	@Test
	public void testParameterizeConstructor(){
		Stack<Integer> stack = new Stack<>(15);
		assertEquals(stack.size(), 15);
	}

    @Test
    public void testIsEmpty(){
        Stack<String> stack = new Stack<>();
        assertEquals(stack.isEmpty(),true);
    }

	@Test
	public void testIsFull(){
		Stack<Integer> integerStack = new Stack<>();
		assertEquals(integerStack.isFull(),false);

		Stack<Integer> integerStack2 = new Stack<>(0);
		assertEquals(integerStack2.isFull(),true);
	}

	@Test
	public void testSize(){
		Stack<String> stack = new Stack<>(5);
		stack.push("a");
		stack.push("a");
		stack.push("a");
		stack.push("a");
		assertEquals(stack.size(), 5);
		stack.push("b");
		assertEquals(stack.size(), 5);
	}

	@Test
	public void testToString(){
		Stack<Integer> stack = new Stack<>(10);
		stack.push(1);
		stack.push(1);
		stack.push(3);
		stack.push(3);
		stack.push(3);
		stack.push(3);
		stack.push(3);
		stack.push(3);
		stack.push(3);
		stack.push(3);
		assertEquals(stack.toString(), "1 1 3 3 3 3 3 3 3 3 ");
	}
	
	@Test
	public void testPeek(){
		Stack<String> stack = new Stack<>();
		stack.push("a");
		stack.push("b");
		stack.push("c");
		assertEquals(stack.peek(), "c");
		stack.push("a");
		assertEquals(stack.peek(), "a");
	}

	@Test
	public void testPush(){
		Stack<String> stack = new Stack<>();	
		stack.push("a");
		stack.push("b");
		assertEquals(stack.peek(), "b");
	}
	
	@Test
	public void testPop(){
		Stack<String> stack = new Stack<>();
		stack.push("1");
		stack.push("2");
		stack.push("3");
		assertEquals(stack.pop(), "3");
		assertEquals(stack.pop(), "2");
	}

	@Test
	public void testPushException(){
		Stack<String> stack = new Stack<>(0);
		Exception ex = null;
		try{ stack.push("asdfasdf");
		}catch(Exception e){
			ex = e;
		}
		assertNotNull(ex);
		if(ex != null){
			assertEquals(ex instanceof FullStackException, true);	
		}
	}
	
	@Test
	public void testPopException(){
		Stack<String> stack = new Stack<>();
		Exception ex = null;
		try{ stack.pop();
		}catch(Exception e) {
			ex = e;
		}
		assertNotNull(ex);
		if(ex != null){
		assertEquals(ex instanceof EmptyStackException, true);
		}
	}




}
