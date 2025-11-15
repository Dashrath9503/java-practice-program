//33.Remove all vowels from a string.

import java.util.*;
class RemoveVowels 
{
    public static void main(String[] args) 
   {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = sc.nextLine();

        s = s.replaceAll("(?i)[aeiou]", "");
        System.out.println("Without vowels: " + s);
    }
}