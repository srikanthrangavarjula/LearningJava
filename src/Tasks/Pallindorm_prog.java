package Tasks;

import java.util.Scanner;

public class Pallindorm_prog{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to check pallindorme or not");
        String userinput = scanner.next();
        String newstring = reverseString(userinput);
        if(newstring.equalsIgnoreCase(userinput)){
            System.out.println("Pallindrome");
        } else {
            System.out.println("Not a pallindorme");
        }
    }

    private static String reverseString(String userinput) {
        String reversed = "";
        for(int i=userinput.length()-1; i >= 0; i--){
            reversed = reversed + userinput.charAt(i);
        }
        return reversed;
    }
}
