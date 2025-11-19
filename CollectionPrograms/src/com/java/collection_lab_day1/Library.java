package com.java.collection_lab_day1;

import java.util.Scanner;
import java.util.Vector;

public class Library
{

	public void displayAvailableBooks(Vector<Book> book)
	{
		System.out.println("Available Books in the Library :");
		
		book.forEach(System.out::println);
		
	}
	
	public void issueBook(Vector<Book> book, Scanner sc)
	{
		System.out.println("Enter Book id which for Book issue :");
		int bid=sc.nextInt();
		boolean found=false;
		for(Book b: book)
		{
			if(b.id()==bid)
			{
				System.out.println("Issued : "+b);
				book.remove(b);
				found=true;
				
				break;
			}
		}
		if(!found) 
		{
		System.out.println("Book with Id "+bid+" not found.");
		}
	}
	public void searchBook(Vector<Book> book, Scanner sc)
	{
		System.out.println("Enter keyword to search by title or author:");
		String bookname=sc.nextLine();
		boolean found=false;
		
		for(Book b: book)
		{
			if(b.author().equals(bookname) || b.title().endsWith(bookname))
			{
				System.out.println("Found: "+b);
				found=true;
			}
		}
		if(!found) 
		{
			System.out.println(bookname+" No matching books found.");
		}
		
	}
}
