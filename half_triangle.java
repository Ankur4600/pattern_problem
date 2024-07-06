package pattern_problem;

import java.util.Scanner;

/*program for printing half triangle with"*"
 * ex:-    *
 *         **
 *         ***
 *         ****
 */
public class half_triangle {
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        System.out.println("Enter the number of Row");
        int row=inp.nextInt();
        for(int i=0; i<row; i++){
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    
}
