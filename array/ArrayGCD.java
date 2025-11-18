// Algorithm-Based Array Problems
// 88.Find GCD of array elements.  
 
public class ArrayGCD  
{ 
    public static int gcd(int a, int b)  
   { 
        return b == 0 ? a : gcd(b, a % b); 
    } 
 
    public static void main(String[] args)  
   { 
        int[] arr = {12, 24, 18}; 
        int result = arr[0]; 
 
        for (int i = 1; i < arr.length; i++) 
            result = gcd(result, arr[i]); 
 
        System.out.println("GCD of array elements = " + result); 
    } 
} 