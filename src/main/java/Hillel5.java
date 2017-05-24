import java.util.Scanner;

/**
 * Created by Ivan on 23.05.2017.
 */
public class Hillel5 {
    public static void main(String[] args) {
       stairCase();
    }

    public static void stairCase() {
        Scanner in = new Scanner(System.in);
        int height = in.nextInt();
        for (int i = 1; i <= height; i++) {

            for (int j = 0; j <= height; j++) {
                System.out.print("#");
            }
            System.out.println();

                if (i <= height){
                    height = height+2;
                }
                else {
                    height = height -2;
                }

            }
        }
    }
