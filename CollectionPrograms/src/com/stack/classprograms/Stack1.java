package com.stack.classprograms;

import java.util.EmptyStackException;
import java.util.Stack;

public class Stack1 
{

	public static void main(String[] args) 
	{
	
		Stack<Integer> stack = new Stack<>();
		try
		{
			stack.push(12);
			stack.push(15);
			stack.push(22);
			stack.push(33);
			stack.push(44);
			System.out.println("After insertion elements are :"+stack);
			
			System.out.println("Fetching the elements using pop method");
			
			System.out.println(stack.pop());
			System.out.println(stack.pop());
			System.out.println(stack.pop());
			System.out.println(stack.pop());
			System.out.println(stack.pop());
			
			System.out.println("After deletion elements are: "+stack);
			
			System.out.println("Is the Stack empty ? : "+stack.empty());
		}
		catch (EmptyStackException e) 
		{
		
			e.printStackTrace();
		}
	}

}
