package com.vector.classprograms;

import java.util.Arrays;
import java.util.List;

public class FixedLengthList 
{

	public static void main(String[] args) 
	{
	
		List<Integer> list=Arrays.asList(1,2,3,4,5);

//		list.add(6); //java.lang.UnsupportedOperationException
//		list.remove(0); //java.lang.UnsupportedOperationException
//		
		list.set(0, 100); //valid
		list.forEach(System.out::println);
	
	}

}
