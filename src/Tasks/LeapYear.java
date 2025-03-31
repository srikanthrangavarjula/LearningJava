package Tasks;

import java.sql.SQLOutput;
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year to calculate whether it's leap year or not"+'\n');
        int year = scanner.nextInt();
        if(year%4 == 0){
            System.out.println("Given year is a leap year");
        }
        else if (year%100 ==0 || year%400 == 0) {
            System.out.println("Not a leap year");
        }
    }
}
