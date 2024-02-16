import java.util.Scanner;

public class Seasons {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        scan.close();
        printSeason(input);
    }

    public static void printSeason(int input) {

        switch (input) {
            case 1:
                System.out.println("January is in Winter"); break;
            case 2:
                System.out.println("February is in Winter"); break;
            case 3:
                System.out.println("March is in Spring"); break;
            case 4:
                System.out.println("April is in Spring"); break;
            case 5:
                System.out.println("May is in Spring"); break;
            case 6:
                System.out.println("June is in Summer"); break;
            case 7:
                System.out.println("July is in Summer"); break;
            case 8:
                System.out.println("August is in Summer"); break;
            case 9:
                System.out.println("September is in Autumn"); break;
            case 10:
                System.out.println("October is in Autumn"); break;
            case 11:
                System.out.println("November is in Autumn"); break;
            case 12:
                System.out.println("December is in Winter"); break;
            default:
                System.out.println("Invalid Month");
        }
    }
}
