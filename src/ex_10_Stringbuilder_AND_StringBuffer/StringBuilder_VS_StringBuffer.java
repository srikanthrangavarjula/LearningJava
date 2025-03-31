package ex_10_Stringbuilder_AND_StringBuffer;
import java.lang.*;

public class StringBuilder_VS_StringBuffer {
    public static void main(String[] args) {
        String s0 = "Srikanth";
        String s1 = new String("Srikanth");
        StringBuilder sb = new StringBuilder("SB_Srikanth");
        //StringBuffer sbf = new StringBuffer("SBF_Srikanth");
        System.out.println(s0);
        System.out.println(s1);
        System.out.println(sb);
        //System.out.println(sbf);
    }
}
