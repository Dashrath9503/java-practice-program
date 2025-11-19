package com.labprgram.mcqs_day1;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo2
{

	public static void main(String[] args) 
	{
	
		List<String> list = new ArrayList<String>(); 
		list.add("Orange"); 
		list.add(0, "Banana"); 
		ArrayList<String> arList = new ArrayList<>(); 
		arList.add("Apple"); 
		list.add("Grapes"); 
		list.addAll(3, arList); 
		System.out.println(list); 

	}

}
