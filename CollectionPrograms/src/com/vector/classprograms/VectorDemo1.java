package com.vector.classprograms;

import java.util.Vector;

public class VectorDemo1 
{

	public static void main(String[] args) 
	{
	
		Vector<String> fruits = new Vector<>();
		fruits.add("Orange");
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("Papaya");
		fruits.add("Pear");
		fruits.add("Banana");
		
		System.out.println("Printing the Data :");
		fruits.forEach(System.out::println);
		
		System.out.println("------------------");
		System.out.println("Removing based on the index : ");
		fruits.remove(2);
		fruits.forEach(System.out::println);

		System.out.println("------------------");
		System.out.println("Removing based on the Object : ");
		fruits.remove("Apple");
		fruits.forEach(System.out::println);
		
	}

}
