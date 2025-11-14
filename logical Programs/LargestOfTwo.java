//2.Find the largest of two numbers.

import java.util.*;
class LargestOfTwo 
{
    public static void main(String[] args) 
   {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt(), b = sc.nextInt();
        System.out.println("Largest = " + (a > b ? a : b));
    }
}