//34.Remove all white spaces from a string.

import java.util.*;
class RemoveSpaces 
{
    public static void main(String[] args) 
   {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = sc.nextLine();
        System.out.println("Without spaces: " + s.replaceAll("\\s+", ""));
    }
}