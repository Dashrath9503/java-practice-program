package com.stack.classprograms;

import java.util.Stack;

public class Stack3 
{

	public static void main(String[] args) 
	{
	
		Stack<String> stack = new Stack<>();
		stack.push("Apple");
		stack.push("Grapes");
		stack.push("Mango");
		stack.push("Orange");
		System.out.println("Stack: "+stack);
		
		String fruit=stack.peek();
		System.out.println("Element at top: "+fruit);
		System.out.println("Stack elements are: "+stack);

	}

}
