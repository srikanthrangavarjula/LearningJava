package Tasks;

public class TriangleClassifier {
    public static void main(String[] args) {
        int s1 = Integer.parseInt(args[0]);
        int s2 = Integer.parseInt(args[1]);
        int s3 = Integer.parseInt(args[2]);

        if(s1 == s2 && s1 == s3 && s2 == s3)
        {
            System.out.println("All sides are equal, so this is equilateral triangle");
        }
        else if (s1 == s2 || s1 == s3 || s2 == s3)
        {
            System.out.println("Exactly two sides are equal, so this is isoceles triangle");
        }
        else
            System.out.println("No sides are equal, this is scalene");
    }
}
