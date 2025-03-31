package ex_09_Arrays;

public class Arrays_first {
    public static void main(String[] args) {
       //First way to create array
        int[] progressreport = {90,89,80,70,100};
        System.out.println(progressreport.length);
        System.out.println(progressreport[1]);
        System.out.println(progressreport[4]);
        System.out.println(progressreport[-1]); //Array index out of bounds exception

        //second way to create array
        int[] marks = new int[5];  //fixed length
        int marks1[] = new int[5];
        String[] names = new String[4];
        names[0] = "Srikanth";
        names[1] = "Rangavarjula";
    }
}
