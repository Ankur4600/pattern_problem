package pattern_problem;
/*prgoram to print halo rectangle
******
*    *
*    *
*    *
******
 */
import java.util.Scanner;

public class halo_rectangle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of row and colunm respectively:");
        int row=sc.nextInt();
        int col=sc.nextInt();
        for(int i=0;i<row;i++){
            for(int j=0; j<col; j++){
                if(i==0||i==row-1||j==0||j==col-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
