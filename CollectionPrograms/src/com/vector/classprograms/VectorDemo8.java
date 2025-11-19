package com.vector.classprograms;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

record Customer(Integer id, String name)
{
	
}

public class VectorDemo8 
{

	public static void main(String[] args) 
	{
	
		Vector<Customer> vector = new Vector<>();

		vector.add(new Customer(111, "Scott"));
		vector.add(new Customer(333, "Alen"));
		vector.add(new Customer(555, "John"));
		vector.add(new Customer(222, "Ronnyy"));
		vector.add(new Customer(999, "Swapnil"));
		
		//Enumeration approach
		Enumeration<Customer> elements=vector.elements();
		
		//Backward Compatibility
		
		Iterator<Customer> asIterator = elements.asIterator();
		asIterator.forEachRemaining(System.out::println);
		
	}

}
