package com.vector.classprograms;

import java.util.Collections;
import java.util.Vector;

public class VectorDemo3 
{

	public static void main(String[] args) 
	{
	
		int [] arr= {10,20,30,05,9};
		
		Vector<Integer> numbers = new Vector<>();
		
		//Convert array to vector
		
		for(int i=0; i<arr.length;i++)
			numbers.add(arr[i]);
		
		
		System.out.println("Min Value: "+Collections.min(numbers));
		System.out.println("Max Value :"+Collections.max(numbers));
		
		Collections.sort(numbers);
		System.out.println("Sorted an array in ascending order: "+numbers);
		Collections.reverse(numbers);
		System.out.println("Sorted an array in ascending order: "+numbers);
		
		//convert vector to array
		
		Object[] array = numbers.toArray();
		
		System.out.println("Printing object array: ");
		for(Object obj:array)
			System.out.println(obj);
		
	}

}
