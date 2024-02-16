import java.util.Scanner;

public class StarTriangle {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int rows = scan.nextInt();
        scan.close();
        
        printStarTriangle(rows);
    }

    public static void printStarTriangle(int rows) {

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
