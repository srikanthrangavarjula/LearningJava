package ex_10_Stringbuilder_AND_StringBuffer;
import java.lang.*;

public class StringBuffer {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Srikanth");
        sb.append("R");
        System.out.println(sb); //here only one string will b available in memory because string builder is mutable in nature


    }
}
