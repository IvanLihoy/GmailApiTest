import java.util.Scanner;
import java.util.StringTokenizer;


public class Hillel3 {

    public static void main(String[] args) {
        stairCase();


    }

    public static void stairCase() {
        Scanner in = new Scanner(System.in);
        int space = 3;
        int height = in.nextInt();
        for (int i = 1; i <= height; i++) {

            for (int j = 0; j <= height; j++) {


            if (height - i - 1 < j) {
                System.out.print("#");
            } else {
                System.out.print(" ");
            }

            if (j <= i) {
                System.out.print("#");
            } else {
                System.out.print(" ");
            }

            }
                System.out.println();
        }
    }
}