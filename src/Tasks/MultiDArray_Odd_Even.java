package Tasks;

public class MultiDArray_Odd_Even {
    public static void main(String[] args) {
        int[][] array = {{1,5,4},{3,4,6},{23,66,3}};
        for(int i = 0; i< array.length; i++){
            for(int j=0; j< array.length;j++){
                if(array[i][j]%2 == 0){
                    System.out.println("Even number:"+array[i][j]);
                }
                else
                    System.out.println("Odd number:"+array[i][j]);
            }
        }

    }
}
