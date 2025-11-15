// 44.Find the first non-repeating character in a string.

import java.util.*;
class FirstNonRepeatingChar 
{
    public static void main(String[] args) 
   {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = sc.nextLine();

        for (char ch : s.toCharArray()) 
	{
            if (s.indexOf(ch) == s.lastIndexOf(ch)) 
	    {
                System.out.println("First non-repeating character: " + ch);
                return;
            }
        }
        System.out.println("No unique character found.");
    }
}