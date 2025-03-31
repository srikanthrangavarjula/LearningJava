package ex_03_Switch;
import java.util.Scanner;

public class SwitchStatements {
    public static void main(String[] args) {
//        char ch = 'A';
//        switch (ch) {
//            case 65:
//                System.out.println("Matching the ascii value");
//                break;
//        }

        //Below one is not supported
//        boolean b = true;
//        System.out.println("Enter value for boolean");
//        switch (b){
//            case true:
//                System.out.println("true");
//                break;
//            case false:
//                System.out.println("false");
//        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value for integer");
        int a;
        a = scanner.nextInt();
        switch (a){
            case 1,2,3:
                System.out.println("Printing mutiple numbers");
                break;
            case 4:
                System.out.println("Printing 4");
                break;
            case 5:
                System.out.println("printing 5");
                break;
            default :
                System.out.println("No match");
                break;
        }
        scanner.close();


    }
}
