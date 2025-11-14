//21.Check if a character is a vowel or consonant.

import java.util.*;
class VowelConsonant 
{
    public static void main(String[] args) 
   {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().toLowerCase().charAt(0);

        if ("aeiou".indexOf(ch) != -1)
            System.out.println("Vowel");
        else
            System.out.println("Consonant");
    }
}