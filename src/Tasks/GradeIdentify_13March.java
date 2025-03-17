package Tasks;

public class GradeIdentify_13March {
    public static void main(String[] args) {
        int grade = Integer.parseInt(args[0]);
        //Using if-else statements
       /* if(grade >= 90 && grade <=100)
            System.out.println("Grade is: A");
        else if (grade >=80 && grade <= 89)
            System.out.println("Grade is: B");
        else if (grade >=70 && grade <= 79)
            System.out.println("Grade is: C");
        else
            System.out.println("No grade is provided");*/
        //Using expression statement
        String result = (grade >= 90 && grade <= 100) ? "A" : (grade >= 80 && grade <= 89) ? "B":(grade >= 70 && grade <= 79) ? "C":(grade >= 60 && grade <= 69) ? "D": "E";
        System.out.println("Grade is:"+ result);
    }
}
