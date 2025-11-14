//5.Swap two numbers without using a third variable.

import java.util.*;
class SwapNumbers 
{
    public static void main(String[] args) 
   {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        int a = sc.nextInt(), b = sc.nextInt();

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}