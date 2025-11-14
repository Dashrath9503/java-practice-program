//23.Count the number of vowels and consonants in a string.

import java.util.*;
class CountVowelsConsonants 
{
    public static void main(String[] args) 
   {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine().toLowerCase();
        int v = 0, c = 0;

        for (char ch : str.toCharArray()) 
	{
            if (Character.isLetter(ch)) 
	    {
                if ("aeiou".indexOf(ch) != -1) v++;
                else c++;
            }
        }
        System.out.println("Vowels: " + v + ", Consonants: " + c);
    }
}