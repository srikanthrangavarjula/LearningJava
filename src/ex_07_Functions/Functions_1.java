package ex_07_Functions;

import static java.lang.Math.max;

public class Functions_1 {
    public static void main(String[] args) {  //main is also a method called by JVM
        //Math functions
//        int a =4, b =5;
//        int result = max(a,b);
//        System.out.println("Max is:" +result);

       //Rules for functions
        //step2 - calling
        int result = f2();
        System.out.println(result);
    }
        //Step1 - definition
        static void f1(){
            System.out.println("Non return function");
        }
        static int f2(){
            System.out.println("Returning function");
            return 10;
        }
        static boolean f3(){
            System.out.println("Returning function");
            return true;
        }
        static float f4(){
            System.out.println("Returning function");  //can return byte and string as well
            return 3.14f;
        }
        static byte f5(){
            System.out.println("Returning function");  //can return byte and string as well
            return 3;
        }
        static String f6(){
            System.out.println("Returning function");  //can return byte and string as well
            return "Srikanth";
        }

    }
