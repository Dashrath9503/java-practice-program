package com.labprgram.mcqs_day1;

import java.util.ArrayList; 
import java.util.Vector; 
class Person1 
{ 
	String name; 
	int age; 
	Person1(String name, int age) 
	{ 
		this.name = name; 
		this.age = age; 
	} 
} 

public class Test2 
{ 
	public static void main(String[] args) 
	{ 
		Vector<Person> v1 = new Vector<>(); 
		ArrayList<Person> a1 = new ArrayList<>(); 
		v1.add(new Person("Alice", 30)); 
		a1.add(new Person("Alice", 30)); 
		System.out.println(v1.equals(a1)); 
		System.out.println(v1.hashCode()); 
		System.out.println(a1.hashCode()); 
	} 
} 