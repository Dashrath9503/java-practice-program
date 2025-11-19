package com.vector.classprograms;

import java.util.Vector;

public class VectorCapacity 
{

	public static void main(String[] args) 
	{
	
		Vector<Integer> listOfNumber = new Vector<Integer>(100,10);
		
		System.out.println("Initial Capacity is: "+listOfNumber.capacity());
		
		for(int i=0; i<=99; i++)
		
			listOfNumber.add(i);
		
		System.out.println("Vector Capicity after adding 100 elements : "+listOfNumber.capacity());
		
		listOfNumber.add(999);
		System.out.println("Vector capacity after adding 101 elements: "+listOfNumber.capacity());
		
		System.out.println("Vector Size after adding 101 elements: "+listOfNumber.size());
		

	}

}
