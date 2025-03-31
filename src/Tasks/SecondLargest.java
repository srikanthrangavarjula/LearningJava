package Tasks;

public class SecondLargest {
    public static void main(String[] args) {
        int[] array = {6,3,65,23,100,4,101};
        int max = 0;
        int secondmax = 0;
        for(int i=0; i< array.length; i++){
            if(array[i] > max){
                secondmax = max;
                max = array[i];
                }
            else if(array[i]>secondmax && array[i]!=max){
                secondmax = array[i];
            }

        }

        System.out.println(max);
        System.out.println(secondmax);
    }
}
