package pattern_problem;

import java.util.Scanner;

// program to print diamond star
public class diamond_star {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number of row of half shape :");
        int row=sc.nextInt();
        for(int i=0; i<row; i++){
            for(int j=0; j<row-i; j++){
                System.out.print(" ");
            }
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            for(int j=0; j<=i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0; i<row; i++){
            for(int j=0; j<=i; j++){
                System.out.print(" ");
            }
            for(int j=0; j<row-i; j++){
                System.out.print("*");
            }
            for(int j=0; j<row-i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
