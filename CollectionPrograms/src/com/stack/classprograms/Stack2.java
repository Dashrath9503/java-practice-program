package com.stack.classprograms;

import java.util.Stack;

public class Stack2 
{

	public static void main(String[] args) 
	{
	
		Stack<Integer> stack1 = new Stack<>();
		
		stack1.add(10);
		stack1.add(20);
		stack1.forEach(x -> System.out.println(x));
		
Stack<String> stack2 = new Stack<>();
		
		stack2.add("Java");
		stack2.add("is");
		stack2.add("programming");
		stack2.add("language");
		stack2.forEach(x -> System.out.println(x));
		
Stack<Character> stack3 = new Stack<>();
		
		stack3.add('A');
		stack3.add('B');
		stack3.forEach(x -> System.out.println(x));
		
Stack<Double> stack4 = new Stack<>();
		
		stack4.add(10.5);
		stack4.add(20.5);
		stack4.forEach(x -> System.out.println(x));
		
		
	}

}
