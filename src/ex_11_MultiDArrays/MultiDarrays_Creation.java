package ex_11_MultiDArrays;

public class MultiDarrays_Creation {
    public static void main(String[] args) {
        int[][] array_2d_old = {{1,2,3},
                                {4,5,6},
                                {7,8,9}};
//Whenever rows are not equal to columns, then it's called Jagged array
        int[][] array_2d_1 =    {{1,2},
                                {4,5,6},
                                {7,9}};
        int[][] array_2d = new int[3][3];  //2nd way
        array_2d[0][0] = 1;
        array_2d[0][1] = 2;
        array_2d[0][2] = 3;
        array_2d[1][0] = 4;
        array_2d[1][1] = 5;
        array_2d[1][2] = 6;
        array_2d[2][0] = 7;
        array_2d[2][1] = 8;
        array_2d[2][2] = 9;
        for (int i=0; i < array_2d.length;i++){
            for (int j=0; j< array_2d[i].length;j++)  //looping the j with j< array_2d[i] becuse in case of different columns present.
            {
                System.out.print(array_2d[i][j]+" ");
            }
            System.out.println("");

        }

    }
}
