import java.util.Scanner;

/**
 * Created by Ivan on 22.05.2017.
 */
public class Hillel4 {
    public static void main(String[] args) {
        stairCase();
    }

    public static void stairCase() {
        Scanner in = new Scanner(System.in);
        int height = in.nextInt();
        for (int i = 1; i <= height; i++) {

            for (int j = 0; j <= height; j++) {

                if (height - i - 1 < j) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

            for (int x = 1; x <= height; x++) {
                for (int k = 0; k <= height; k++) {
                    if (k <= x) {
                        System.out.print("#");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }

}
