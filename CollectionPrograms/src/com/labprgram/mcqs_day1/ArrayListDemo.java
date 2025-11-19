package com.labprgram.mcqs_day1;

import java.util.ArrayList;

public class ArrayListDemo
{

	public static void main(String[] args) 
	{
	
		ArrayList<String> obj1 = new ArrayList<String>(); 
		ArrayList<String> obj2 = new ArrayList<String>(); 
		obj1.add("A"); 
		obj1.add("B"); 
		obj2.add("A"); 
		obj2.add(1, "B"); 
		System.out.println(obj1.equals(obj2)); 
		System.out.println(obj1.hashCode()); 
		System.out.println(obj2.hashCode());
	}
}
