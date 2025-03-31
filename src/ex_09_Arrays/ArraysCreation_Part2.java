package ex_09_Arrays;

public class ArraysCreation_Part2 {
    public static void main(String[] args) {
        String[] names = {"name1","name2","name3"};

        for (int i = 0; i < names.length; i++)
        {
            System.out.println(names[i]);
        }
        String[] names1 = new String[3];
        names1[0] = "Sumt";
        names1[1] = "CSOD";
        names1[2] = "Edcast";
        for (int i = 0; i < names1.length; i++)
        {
            System.out.println(names1[i]);
        }
    }
}
