//16.Check if a number is an Armstrong number.

import java.util.*;
class Armstrong 
{
    public static void main(String[] args) 
   {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt(), temp = n, sum = 0;

        while (n != 0) 
	{
            int d = n % 10;
            sum += d * d * d;
            n /= 10;
        }
        System.out.println(sum == temp ? "Armstrong" : "Not Armstrong");
    }
}