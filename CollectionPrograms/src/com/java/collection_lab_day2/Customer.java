package com.java.collection_lab_day2;

public record Customer(int custId, String customerName, String pickupLocation, String dropLocation, int distance, String phone) 
{

	public Customer
	{
		if(custId<=0)
			throw new IllegalArgumentException("Validation Error: Customer ID must be positive.");
		if(customerName == null ||  customerName.trim().isEmpty())
			throw new IllegalArgumentException("Customer name cannot be null or blank.");
		if(pickupLocation==null || pickupLocation.trim().isEmpty())
			throw new IllegalArgumentException("Validation Error: Pickup location cannot be null or blank.");
		if(dropLocation==null || dropLocation.trim().isEmpty())
			throw new IllegalArgumentException("Validation Error: Drop location cannot be null or blank.");
		if(distance<0)
			throw new IllegalArgumentException("Validation Error: Distance cannot be negative.");
		if(phone==null || !phone.matches("\\d{10}"))
			throw new IllegalArgumentException("Validation Error: Phone number must be 10 digits only.");
	}
}
