package com.labprgram.mcqs_day1;

import java.util.ArrayList;

public class ArrayListDemo6 
{

	public static void main(String[] args) 
	{
	
		ArrayList<String> list = new ArrayList<String>(); 
		list.add(null); 
		list.add(0, "A"); 
		list.add(null); 
		list.add(2, "B"); 
		list.add("20"); 
		list.add(1, "C"); 
		System.out.println(list); 
	}

}
