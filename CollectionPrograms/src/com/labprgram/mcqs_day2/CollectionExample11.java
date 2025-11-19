package com.labprgram.mcqs_day2;

import java.util.ArrayList;
import java.util.List;

public class CollectionExample11 
{

	public static void main(String[] args) 
	{
	
		List<String> list = new ArrayList<String>(); 
		list.add("a"); 
		list.add("b"); 
		list.add("c"); 
		System.out.println(list.indexOf("a")); 
		System.out.println(list.indexOf("c")); 
		System.out.println(list.indexOf("d"));
	}

}
