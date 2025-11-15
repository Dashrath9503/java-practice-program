// 50.Convert decimal to octal.

import java.util.*;
class DecimalToOctal 
{
    public static void main(String[] args) 
   {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter decimal number: ");
        int n = sc.nextInt();
        String oct = "";

        while (n > 0) 
	{
            oct = (n % 8) + oct;
            n /= 8;
        }
        System.out.println("Octal = " + oct);
    }
}