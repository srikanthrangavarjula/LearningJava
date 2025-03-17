package Tasks;

public class FindEvenOdd {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(args[0]);
        System.out.println((num1%2)==0?"Given number is even:" +num1 : "Given number is odd number:"+num1);
    }
}
