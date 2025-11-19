package com.vector.classprograms;

import java.util.Iterator;
import java.util.Vector;

class Concurrent extends Thread
{
	private Vector<String> listofFruits;
	
	public Concurrent(Vector<String> listofFruits)
	{
		this.listofFruits=listofFruits;
	}
	
	@Override
	public void run() 
	{
		try
		{
			Thread.sleep(2000);
		}
		catch (InterruptedException e) 
		{
		
			e.printStackTrace();
		}
		listofFruits.add("Pear");
	}
}

public class VectorDemo5 
{

	public static void main(String[] args) 
	{
	
		Vector<String> vector = new Vector<>();
		
		vector.add("Orange");
		vector.add("Mango");
		vector.add("Banana");
		vector.add("Apple");
		vector.add("Papaya"); //java.util.ConcurrentModificationException
		
		Concurrent concurrent = new Concurrent(vector);
		concurrent.start();
		
		Iterator<String> iterator = vector.iterator();
		
		while(iterator.hasNext())
		{
			try
			{
			System.out.println(iterator.next());
			Thread.sleep(1000);
			}
			catch (InterruptedException e) 
			{
				
				e.printStackTrace();
			}
		}
		
	}

}
