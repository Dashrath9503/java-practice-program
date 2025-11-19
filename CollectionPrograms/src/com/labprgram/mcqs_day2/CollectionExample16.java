package com.labprgram.mcqs_day2;

import java.util.ArrayList;

public class CollectionExample16 
{

	public static void main(String[] args) 
	{
	
		ArrayList list = new ArrayList(); 
		ArrayList listStr = list; 
		ArrayList listBuf = list; 
		listStr.add(0, "Hello"); 
		StringBuffer buff =listBuf.get(0); 
		System.out.println(buff.toString());
	}

}
