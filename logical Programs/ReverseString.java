//29.Reverse a string.

import java.util.*;
class ReverseString 
{
    public static void main(String[] args) 
   {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = sc.nextLine();
        String rev = new StringBuilder(s).reverse().toString();

        System.out.println("Reversed: " + rev);
    }
}