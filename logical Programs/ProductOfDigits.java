//15.Find the product of digits of a number.

import java.util.*;
class ProductOfDigits 
{
    public static void main(String[] args) 
   {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt(), prod = 1;

        while (n != 0) 
	{
            prod *= n % 10;
            n /= 10;
        }
        System.out.println("Product of digits = " + prod);
    }
}