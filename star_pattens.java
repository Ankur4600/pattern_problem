package pattern_problem;
/* program for pattern printing
*        *
**      **
***    ***
****  ****
**********
****  ****
***    ***
**      **
*        *
 */
import java.util.*;
public class star_pattens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the half number of row :");
        int row = sc.nextInt();
        for(int i=0; i<row; i++){
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            for(int j=0; j<2*(row-i-1); j++){
                System.out.print(" ");
            }
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0; i<row-1; i++){
            for(int j=0; j<row-i-1; j++){
                System.out.print("*");
            }
            for(int j=0; j<=2*i+1; j++){
                System.out.print(" ");
            }
            for(int j=0; j<row-i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}
