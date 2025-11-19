package com.labprgram.mcqs_day2;


public class CollectionExample18 
{ 
	public static void main(String[] args) 
	{ 
		Moof one = new Moof(8); 
		Moof two = new Moof(8); 
		if(one.equals(two)) 
		{ 
			System.out.println("Equal ..."); 
		} 
		else 
		{ 
			System.out.println("Not Equal ..."); 
		} 
	} 
} 

class Moof 
{ 
	private int moofValue; 
	Moof(int val) 
	{ 
		moofValue=val; 
	} 
	public int getMoofValue() 
	{ 
		return moofValue; 
	} 
	public boolean equals(Object o) 
	{ 
		if((o instanceof Moof)&&(((Moof)o).getMoofValue()==this.moofValue)) 
		{ 
			return true; 
		} 
		else 
		{ 
			return false;
		} 
	} 
} 

