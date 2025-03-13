package ex_01_JavaBasic;

public class Lab05_Operators {
    public static void main(String[] args) {
        int age = 10;  // = is called operator, age is identifier, 10 is literal
        //Arithmetic operators
        // +
         // -
         //*
        // /
        // %
        //unary operators
        int a = +20;
        int b = -12;

        //modulus

        int d = 20;
        int e = 10;

        System.out.println(d%e);

        //relational operators <,>, <=,>=, ==, !=

        //Logical operators !, ||, &&

        //&& - if both are true then only reslt is true
        //|| - if both are false then only result is false

        System.out.println(true||true);
        System.out.println(true||false);
        System.out.println(false||true);
        System.out.println(false||false);
        System.out.println("\n");
        System.out.println(true&&true);
        System.out.println(true&&false);
        System.out.println(false&&true);
        System.out.println(false&&false);

        //Compound operators +=, -=,/= , *=,//

        //Ternary operator  ?: - nothing but if-else
        int myage = 10;
        String canivote = myage>=18 ? "You can vote" : "No you can't";
        System.out.println(canivote);

        //Nested ternary :
        //result = condition1 ? expression1 : (condition2? expression2 : expresssion3)

        int number =5;
        String result = (number > 10) ? (number > 20 ? "N>20":"N<20"):"B";
        System.out.println(result);

        //New operator - oops concept

    }
}
