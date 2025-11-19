package com.java.collection_lab_day2;

public class CabCustomerServiceTester 
{

	public static void main(String[] args) 
	{
		CustomerService service = new CustomerService();

        try 
        {
            
            Customer c1 = new Customer(111, "JOHN", "Latur", "Pune", 200, "9503473615");
            service.printBill(c1);

           
            Customer c2 = new Customer(112, "SMITH", "Chtr.Sambhaji Nagar", "Hyderabad", 100, "9998887776");
            service.printBill(c2);

            
            Customer c3 = new Customer(113, "JOHN", "Latur", "Parbhani", 14, "9503473615");
            service.printBill(c3);

        } 
        catch (IllegalArgumentException e) 
        {
            System.out.println(e.getMessage());
        }

       
        try 
        {
            new Customer(-111, "JOHN", "Latur", "Pune", 200, "9503473615");
        } 
        catch (IllegalArgumentException e) 
        {
            System.out.println(e.getMessage());
        }

        try 
        {
            new Customer(112, " ", "Latur", "Pune", 200, "9503473615");
        } 
        catch (IllegalArgumentException e) 
        {
            System.out.println(e.getMessage());
        }

        try
        {
            new Customer(113, "JOHN", "", "Pune", 100, "9503473615");
        } 
        catch (IllegalArgumentException e) 
        {
            System.out.println(e.getMessage());
        }

        try 
        {
            new Customer(114, "JOHN", "Latur", "", 150, "9503473615");
        } 
        catch (IllegalArgumentException e) 
        {
            System.out.println(e.getMessage());
        }

        try 
        {
            new Customer(5, "JOHN", "Parbhani", "Latur", -100, "9503473615");
        }
        catch (IllegalArgumentException e) 
        {
            System.out.println(e.getMessage());
        }

        try 
        {
            new Customer(10, "JOHN", "Dubali", "India", 10, "950347");
        }
        catch (IllegalArgumentException e) 
        {
            System.out.println(e.getMessage());
        }
	}
}
