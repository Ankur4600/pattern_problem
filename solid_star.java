package pattern_problem;

import java.util.Scanner;
/*for solid pattern of "*"
 *    ex:-      *****
 *              *****
                ***** */
public class solid_star{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number of rows and column respectively: ");
        int row =sc.nextInt();
        int col =sc.nextInt();
        for(int i=0;i<row;i++){
            for(int j=0; j<col; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}