package Tasks;

public class IncrementDecrement_14March {
    public static void main(String[] args) {
        int a = 10;
        int ExpA = ++a; //11
        int ExpB = a++; //11
        int ExpC = a++; //12
        int result = ExpA + ExpB + ExpC;
        System.out.println(result);
    }
}
