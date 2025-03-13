package ex_01_JavaBasic;

public class Lab07_TypeCasting {
    public static void main(String[] args) {
        //widening
        //Narrowing

        //This is implicit casting in case of widening
        byte b = 10;
        int a = b; //valid syntax -> smaller type into bigger one

        byte c = 20;
        int d = (int)c; //Explicit casting - widening (not required)

        int val = 300;
        //byte bt = val; //Invalid - narrowing - implcit casting not allowed
        byte bt = (byte)val ; //valid - Narrowing - explicit casting is allowed.
        System.out.println(bt);

        long phno = 9288342211L;
    }
}