package Tasks;

import java.sql.SQLOutput;
import java.util.Scanner;

public class RightTrainglePyramid {
    public static void main(String[] args) {
        //How the pattern would be
//                n=3
//                *
//                **
//                ***
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to print triangle ");
        int input = scanner.nextInt();
        for (int i = 0; i<input;i++){
            for(int j=0; j<=i;j++){
                System.out.print("*");
            }
            System. out.println("");

        }
    }
}
