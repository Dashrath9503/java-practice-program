// 47.Find the power of a number (without using built-in function).

import java.util.*;
class PowerOfNumber 
{
    public static void main(String[] args) 
   {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base and exponent: ");
        int base = sc.nextInt(), exp = sc.nextInt();
        long result = 1;

        for (int i = 1; i <= exp; i++) result *= base;
        System.out.println("Result = " + result);
    }
}