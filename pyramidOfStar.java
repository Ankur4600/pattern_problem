package pattern_problem;

import java.util.Scanner;

/*program to print pyramid of star
 * ex:-      *
 *          ***
 *         *****
 *        *******
 */
public class pyramidOfStar {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number of row: ");
        int row =sc.nextInt();
        for(int i=0; i<row; i++){
            for(int j=0; j<row-i-1;j++){
                System.out.print(" ");
            }
            for(int j=0; j<2*i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
