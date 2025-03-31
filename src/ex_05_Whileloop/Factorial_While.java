package ex_05_Whileloop;

import java.util.Scanner;

public class Factorial_While {
    public static void main(String[] args) {
        //factorial with for loop
        int factorial = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value of number to find the factorial of it:");
        int number  = scanner.nextInt();
        if(number <=0){
            System.out.println(factorial);
            }
        else{
            while(number > 1){
                factorial = factorial * number;
                number--;
                }
            System.out.println("The factorial of given number is "+factorial);
        }
    }
}
