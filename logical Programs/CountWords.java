//41.Count the number of words in a string.

import java.util.*;
class  
{
    public static void main(String[] args) 
   {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String s = sc.nextLine().trim();
        String[] words = s.split("\\s+");
        System.out.println("Word count = " + words.length);
    }
}