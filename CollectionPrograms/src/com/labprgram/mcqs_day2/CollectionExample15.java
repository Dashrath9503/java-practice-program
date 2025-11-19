package com.labprgram.mcqs_day2;

import java.util.ArrayList;
import java.util.List;

public class CollectionExample15 
{

	public static void main(String[] args) 
	{
	
		List<String> list1 = new ArrayList<String>(); 
		list1.add("Dohni"); 
		list1.add("Sahwag"); 
		list1.add("Bumrah"); 
		list1.set(0, "Virat"); 
		list1.add(0, "Rohit"); 
		System.out.println(list1);
	}

}
