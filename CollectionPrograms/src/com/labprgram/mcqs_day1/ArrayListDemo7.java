package com.labprgram.mcqs_day1;

import java.util.ArrayList;

public class ArrayListDemo7 
{

	public static void main(String[] args) 
	{
	
		ArrayList<String> list = new ArrayList<>(); 
		list.add(12); 
		list.add(16); 
		list.add(34); 
		list.add(78); 
		list.remove(12); 
		System.out.println(list);
	}

}
