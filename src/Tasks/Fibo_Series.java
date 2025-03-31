package Tasks;

public class Fibo_Series {
    public static void main(String[] args) {
        //fibo series : 0,1,1,2,3,5
        int first=0, second  = 1, next = 0;

        System.out.println(first);
        System.out.println(second);
        for(int i =1; i <= 10; i++)
        {
            next = first + second;
            first = second;
            second = next;
            System.out.println(next);
        }
    }
}
