package com.vector.classprograms;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Spliterator;
import java.util.Vector;

public class PossibleWaysToRetrieveCollectionObject {

	public static void main(String[] args) 
	{
	
		Vector<String> vector = new Vector<>();
		vector.add("Hyderabad");
		vector.add("Kolkata");
		vector.add("Pune");
		vector.add("Mumbai");
		vector.add("Latur");
		
		System.out.println("1) By using toString() Method ");
		System.out.println(vector);
		
		System.out.println("2) By using Ordinary for loop ");
		for(int i=0;i<vector.size();i++)
		System.out.println(vector.get(i));
		
		System.out.println("3) By using for each loop ");
		for(String city: vector)
			System.out.println(city);
		
		System.out.println("4) By using Enumaration interface ");
		Enumeration<String> ele=vector.elements();
		while(ele.hasMoreElements())
			System.out.println(ele.nextElement());
		
		System.out.println("5) By using Iterator interface ");
		Iterator<String> iterator = vector.iterator();
		iterator.forEachRemaining(city -> System.out.println(city));
		
		System.out.println("6) By using ListIterator interface ");
		ListIterator<String> lst=vector.listIterator();
		
		System.out.println("In Forward Direction ");
		while(lst.hasNext())
			System.out.println(lst.next());
		
		System.out.println("In Backward Direction ");
		while(lst.hasPrevious())
			System.out.println(lst.previous());
		
		System.out.println("7) By using foreach method ");
		vector.forEach(city -> System.out.println(city));
		
		System.out.println("8) By using Spliterator interface ");
		Spliterator<String> spliterator = vector.spliterator();
		spliterator.forEachRemaining(city -> System.out.println(city));
		
		System.out.println("9) By using method reference ");
		vector.forEach(System.out::println);
		
		System.out.println("10) By using stream() method of Collection interface ");
		vector.stream().forEach(System.out::println);
		
		System.out.println("11) By using parallelStream() method of collection interface ");
		vector.parallelStream().forEach(System.out::println);
	}

}
