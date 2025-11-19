package com.vector.classprograms;

import java.util.Collections;
import java.util.List;
import java.util.Vector;

record Product(Integer id, String name, Double price) implements Comparable<Product>
{

	@Override
	public int compareTo(Product p2)
	{
	
		return this.id().compareTo(p2.id);
	}
	
}

public class VectorDemo4 
{

	public static void main(String[] args) 
	{
	
		List<Product> listofProduct=new Vector<>();
		
		listofProduct.add(new Product(105, "Mobile", 25000d));
		listofProduct.add(new Product(102, "Laptop", 25000d));
		listofProduct.add(new Product(109, "Camera", 25000d));
		listofProduct.add(new Product(100, "Cooler", 25000d));
		
		System.out.println("Printing original data: ");
		listofProduct.forEach(System.out::println);

		Collections.sort(listofProduct);
		System.out.println("----------------");
		System.out.println("Printing data after sorting based on id: ");
		listofProduct.forEach(System.out::println);
		System.out.println("----------------");
		listofProduct.sort((p1,p2) -> p1.name().compareTo(p2.name()));
		System.out.println("Printing data after sorting based on name: ");
		listofProduct.forEach(System.out::println);
		
	}

}
