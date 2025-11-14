//30.Check if a string is a palindrome.

import java.util.*;
class StringPalindrome 
{
    public static void main(String[] args) 
   {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = sc.nextLine();
        String rev = new StringBuilder(s).reverse().toString();

        System.out.println(s.equalsIgnoreCase(rev) ? "Palindrome" : "Not Palindrome");
    }
}