import java.util.Scanner;
import java.util.StringTokenizer;


class Printer{

    private void printRow(int rows){


        String text = "##########################################";
        int positionStart = 3;
        int i = 0;
        for (i = positionStart; i < rows + positionStart; i++){
            System.out.println(text.subSequence(1, i) + " " + text.subSequence(1, i));
        }
    }

    public void printTower(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pleace enter row number");
        int floors = scanner.nextInt();
        while (floors <= 0 || floors > 1000 ){
            System.out.println("Pleace enter correct number of the rows");
            floors = scanner.nextInt();
        }
        System.out.println("Got correct number");
        printRow(floors);
    }

}

public class Hillel3 {

    public static void main(String[] args) {
        //stairCase();
        Printer printer = new Printer();
        printer.printTower();
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