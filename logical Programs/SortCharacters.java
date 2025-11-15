// 45.Sort characters in a string alphabetically.

import java.util.*;
class SortCharacters 
{
    public static void main(String[] args) 
   {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = sc.nextLine().replaceAll("\\s+", "");

        char[] arr = s.toCharArray();
        Arrays.sort(arr);

        System.out.println("Sorted: " + new String(arr));
    }
}