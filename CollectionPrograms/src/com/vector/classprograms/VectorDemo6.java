package com.vector.classprograms;

import java.util.Vector;

public class VectorDemo6 
{

	public static void main(String[] args)
	{
	
		Vector<String> vector = new Vector<>();
		
		vector.add("Orange");
		vector.add("Mango");
		vector.add("Banana");
		vector.add("Apple");
		vector.add("Papaya");
		
		for(String s1:vector)
		{
			System.out.println(s1);
			vector.add("Pear"); //java.util.ConcurrentModificationException
		}
	}
}
