package ex_09_Arrays;

public class Array_Reverse {
    public static void main(String[] args) {
        int[] array = {23,54,12,34,32,87,34,90,2};
        for(int i = array.length; i >= 0 ; i--){
            System.out.println(array[i]);
        }
    }
}
