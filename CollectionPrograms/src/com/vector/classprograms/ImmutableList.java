package com.vector.classprograms;

import java.util.Arrays;
import java.util.List;

public class ImmutableList
{

	public static void main(String[] args) 
	{
	
		List<Integer> list=List.of(1,2,3,4,5,6,7);

//		list.add(12); //java.lang.UnsupportedOperationException
//		list.remove(0); //java.lang.UnsupportedOperationException
//		list.set(0, 100); //java.lang.UnsupportedOperationException
		
		System.out.println(list);

	}

}
