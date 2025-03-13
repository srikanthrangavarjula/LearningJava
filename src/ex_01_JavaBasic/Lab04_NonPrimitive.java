package ex_01_JavaBasic;

public class Lab04_NonPrimitive {
    public static void main(String[] args) {

        //primitive types - defined by java guys
        //Max, min size is defined
        int a= 60;    // 4 byte - 32 bits
        byte b = 10;  // 1 byte - 8 bits

        //Non primitive - defined by users, reference data types
        //No max,min size
        //String, Array,Classess, enum...
        String name = "Srikanth";  //bunch of characters
        int[] array = new int[10];

        char c = 'A'; //65
        char d = 'B';  //66
        System.out.println(c+d);  //131

        short s = 10;
        System.out.println(s+d);  //75
    }
}
