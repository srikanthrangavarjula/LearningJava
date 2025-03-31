package Tasks;

import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string to count vowels"+'\n');
        String input = scanner.nextLine().toLowerCase();
        int vowelcount = 0;
        for(int i=0; i<input.length();i++){
            char ch = input.charAt(i);
            if (ch == 'a'|| ch =='e'|| ch=='i' || ch=='o' || ch=='u'){
                vowelcount++;
            }
        }
        System.out.println("Number of vowels:"+vowelcount);
        scanner.close();
    }
}
