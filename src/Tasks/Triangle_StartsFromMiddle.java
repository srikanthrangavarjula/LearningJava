package Tasks;

public class Triangle_StartsFromMiddle {
    public static void main(String[] args) {
        //                 *
        //             *   *   *
        //          *  *   *   *   *
        patternmiddle(4);
    }


    static void patternmiddle(int n) {

        for (int row = 1; row <= n; row++) {
            for (int noofspaces = 1; noofspaces <= n - row; noofspaces++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= 2 * row - 1; col++) {

                System.out.print("* ");
            }
            System.out.println();
        }

    }
}

