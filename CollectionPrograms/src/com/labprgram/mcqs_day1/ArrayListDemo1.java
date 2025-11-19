package com.labprgram.mcqs_day1;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo1 
{

	public static void main(String[] args) 
	{

			List<String> list = new ArrayList<String>(); 
			list.add("Patna"); 
			list.add(0, "New York"); 
			list.add("Mumbai"); 
			list.add(2, "Sydney"); 
			System.out.println(list);
	}

}
