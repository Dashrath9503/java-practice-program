package com.java.collection_lab_day1;

import java.util.Scanner;
import java.util.Vector;

public class LibraryManagement 
{

	public static void main(String[] args) 
	{
	
		Scanner sc = new Scanner(System.in);
		
//		int id=Integer.parseInt(sc.nextLine());
//		String name=sc.nextLine();
//		String author=sc.nextLine();
		
		Vector<Book> vector = new Vector<Book>();
		vector.add(new Book(101, "Core Java", "Mr James"));
		vector.add(new Book(102, "Adv Java", "Mr Robert"));
		vector.add(new Book(103,"Head First Java","Miss Kathy Sierra"));
		vector.add(new Book(104,"Programming in C","Mr Denis"));
		
		Library library = new Library();
		
		System.out.println("Select from the Menu :\r\n"
				+ "	 1) Display Books Available in the Library :\r\n"
				+ "	 2) Search a Book in the Library :\r\n"
				+ "	 3) Issue a Book from the Library :\r\n"
				+ "	 4) Exit from the application :");

		
		int choice = Integer.parseInt(sc.nextLine());
		
		switch(choice)
		{
		case 1 -> library.displayAvailableBooks(vector);
		case 3 -> library.issueBook(vector, sc);
		case 2 -> library.searchBook(vector, sc);
		case 4 -> System.out.println("Thank you for Visiting..");
		}
	}

}
