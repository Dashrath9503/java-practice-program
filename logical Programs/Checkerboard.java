// 74.Print checkerboard pattern using 0 and 1.

import java.util.*;
class Checkerboard {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size: ");
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print((i+j)%2 + " ");
            }
            System.out.println();
        }
    }
}