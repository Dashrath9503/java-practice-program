// Mathematical / Logical Manipulations 
// 1.Find the sum of even and odd elements separately. 
 
class SumEvenOdd  
{ 
    public static void main(String[] args)  
   { 
        int[] arr = {3, 5, 2, 8, 7, 4}; 
        int evenSum = 0, oddSum = 0; 
 
        for (int x : arr)  
 { 
            if (x % 2 == 0)  
        evenSum += x; 
            else  
        oddSum += x; 
        } 
        System.out.println("Even Sum: " + evenSum); 
        System.out.println("Odd Sum: " + oddSum); 
    } 
} 