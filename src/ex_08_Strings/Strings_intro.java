package ex_08_Strings;

import java.util.Locale;

public class Strings_intro {
    public static void main(String[] args) {
        //String creation
        String s1 = "Srikanth"; //going to create in string constant poool
       // s1 = s1.concat("R");
        String s2 = new String("Srikanth"); //going to create in string object area
        System.out.println(s1 == s2);  // result is false because == operator looks for the reference, hence two are avilable in dofferent memory

        //Instead of reference if we need tocheck the compare the content then use equals method.
        System.out.println(s1.equals(s2)); //result is true
        s2 = s2.toUpperCase();
        System.out.println(s2);
        System.out.println(s1.equals(s2)); //false because this is in uppercase
        System.out.println(s1.equalsIgnoreCase(s2));//this is now true

        //concat - can also done by + operator
        //equals
        //equalsignorecase
        //indexOf("char")
        //lastindexof("char")
        //length()
        //replace
        //split
        String name = "srangavarjula@csod.com@123";
          String[] split = name.split("@");

        System.out.println(split[0]);
        System.out.println(split[1]);
        System.out.println(split[2]);
        //startswith
        //endswith
        //trim()
        String name1 = "  Srikanth rangavarjula ";
        System.out.println(name1.trim());
        //compareto()
        //substring( , )
        //Substring : extracts a portion of the string

    }
}
