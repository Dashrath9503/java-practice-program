package com.labprgram.mcqs_day2;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionExample10
{

	public static void main(String[] args) 
	{
	
		 
		Collection c = new ArrayList(); 
		c.add("1"); 
		c.add("2"); 
		c.add("3"); 
		
		Collection c1 = new ArrayList(); 
		c1.add("1"); 
		c.retainAll(c1); 
		System.out.println(c);
	}

}
