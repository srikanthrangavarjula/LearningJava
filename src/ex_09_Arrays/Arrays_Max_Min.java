package ex_09_Arrays;

public class Arrays_Max_Min {
    public static void main(String[] args) {
        int[] array = {23,54,12,34,32,87,34,90,2};
        int max = givememax(array);

    }

    private static int givememax(int[] array) {
        int max = array[0];
        for(int i = 0; i< array.length-1; i++){
            if(array[i]> max)
            {
                max = array[i];
            }

        }
        return max;
    }
}
