package pattern_problem;
/*reverse half triangle of "*" 
 * ex:-   ****
 *        ***
 *        **
 *        *
*/
import java.util.*;
public class reverse_half_triangle {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of row: ");
        int row= sc.nextInt();
        for(int i=row; i>=0;i--){
            for(int j=0; j<=i;j++){
                System.out.print("*");
                
            }
            System.out.println();
        }

        
    }
}
