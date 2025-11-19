package com.vector.classprograms;

import java.util.Vector;
import java.util.function.Consumer;

public class FetchTheElements_using3Cases 
{

	public static void main(String[] args) 
	{
	
		Vector<String> vector = new Vector<>();
		vector.add("Hyderabad");
		vector.add("Kolkata");
		vector.add("Pune");
		vector.add("Mumbai");
		vector.add("Latur");
		
		
	/*	//Using Anonymous inner class  Case1
		Consumer<String> consumer = new Consumer<String>() 
		{

			@Override
			public void accept(String city) 
			{
			
				System.out.println(city);
			}
		};
		vector.forEach(consumer);
		
		
		
		//Using Lambda Case2
		
		Consumer<String> consumer = city -> System.out.println(city);
		
		vector.forEach(consumer);
		
		*/
		
		//Case 3
		
		vector.forEach(city -> System.out.println(city));
	}

}
