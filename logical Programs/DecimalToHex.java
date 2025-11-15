// 51.Convert decimal to hexadecimal.

import java.util.*;
class DecimalToHex 
{
    public static void main(String[] args) 
   {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter decimal number: ");
        int n = sc.nextInt();

        String hex = "";
        char[] map = "0123456789ABCDEF".toCharArray();

        while (n > 0) 
	{
            hex = map[n % 16] + hex;
            n /= 16;
        }
        System.out.println("Hexadecimal = " + hex);
    }
}
