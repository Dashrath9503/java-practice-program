package com.java.collection_lab_day2;

import java.util.ArrayList;

public class CustomerService 
{

	private ArrayList<Customer> customers;
	
	public CustomerService()
	{
		 customers = new ArrayList<>();
	}
	
	public void addCustomer(Customer customer)
	{
		customers.add(customer);
	}
	
	private boolean isFirstCustomer(Customer customer)
	{
		for (Customer cust : customers) 
		{
            if (cust.phone().equals(customer.phone())) 
            {
                return false; 
            }
         }
		return true;
	}
	
	public double calculateBill(Customer customer)
	{
		boolean firstCustomer = isFirstCustomer(customer);

        if (firstCustomer) 
        {
            addCustomer(customer);
            return 0.0;
        }

        addCustomer(customer);

        int distance = customer.distance();
        
        if (distance <= 4)
            return 80.0;
        else
            return 80.0 + (distance - 4) * 6.0;
    }

    
    public void printBill(Customer customer) 
    {
        double bill = calculateBill(customer);
        System.out.println(customer.customerName() + " Please pay your bill of Rs." + bill);
    
	}
}
