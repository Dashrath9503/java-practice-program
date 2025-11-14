//1.Check if a number is even or odd.

import java.util.*;
class EvenOdd 
{
    public static void main(String[] args) 
   {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if (n % 2 == 0)
            System.out.println(n + " is Even");
        else
            System.out.println(n + " is Odd");
    }
}