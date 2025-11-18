// 81.Find sum of upper triangle.  
 
public class UpperTriangleSum  
{ 
    public static void main(String[] args)  
   { 
        int[][] matrix = { 
            {1, 2, 3}, 
            {0, 4, 5}, 
            {0, 0, 6} 
        }; 
        int sum = 0; 
 
        for (int i = 0; i < matrix.length; i++) 
            for (int j = i; j < matrix[0].length; j++) 
                sum += matrix[i][j]; 
 
        System.out.println("Sum of upper triangle = " + sum); 
    } 
}