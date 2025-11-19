package com.labprgram.mcqs_day1;

import java.util.Vector;

public class VectorDemo5 
{

	public static void main(String[] args) 
	{ 
	Vector<String> v1 = new Vector<>(); 
	Vector<String> v2 = new Vector<>(); 
	v1.add("Java"); 
	v1.add("Technology"); 
	v2.add("Java"); 
	v2.add("Technology"); 
	System.out.println(v1.equals(v2)); 
	System.out.println(v1.hashCode()); 
	System.out.println(v2.hashCode()); 
	} 
}
