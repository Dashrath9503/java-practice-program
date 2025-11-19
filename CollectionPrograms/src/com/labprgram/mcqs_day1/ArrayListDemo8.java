package com.labprgram.mcqs_day1;

import java.util.ArrayList;

public class ArrayListDemo8 
{

	public static void main(String[] args) 
	{
	
		ArrayList<Character> list = new ArrayList<>(); 
		list.add('a'); 
		list.add('b'); 
		list.add('c'); 
		list.add('d'); 
		list.remove('c'); 
		System.out.println(list);
	}

}
