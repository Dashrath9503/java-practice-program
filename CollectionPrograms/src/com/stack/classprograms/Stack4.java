package com.stack.classprograms;

import java.util.Stack;

public class Stack4 
{

	public static void main(String[] args) 
	{
	
		Stack<String> stack = new Stack<>();
		stack.push("Apple");
		stack.push("Grapes");
		stack.push("Mango");
		
		System.out.println("Offset Position is: "+stack.search("Mango"));
		System.out.println("Offset Position is: "+stack.search("Banana"));
		System.out.println("Is stack empty ? "+stack.empty());
		
		System.out.println("Index Position is :"+stack.indexOf("Mango"));

	}

}
