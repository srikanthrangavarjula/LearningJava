package ex_01_JavaBasic;

public class Lab06_OperatorOverloading {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        System.out.println(a+b);

        String s = "Srikanth";
        String s2 = "R";
        System.out.println(s+s2);

        //+ behaves differently when use with integers and string
        System.out.println(a+b + s+s2);
        System.out.println(s+s2 + a+b);
        System.out.println((s+s2) + '\t'+(a+b));

    }
}
