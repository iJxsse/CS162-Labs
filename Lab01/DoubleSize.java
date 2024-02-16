import java.util.Scanner;

public class DoubleSize {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();
        scan.close();

        determineSize(num1, num2);
    }

    public static void determineSize(double num1, double num2) {

        if (num1 > num2) {
            System.out.println("Largest = " + num1);
            System.out.println("Smallest = " + num2);
        } else if (num2 > num1) {
            System.out.println("Largest = " + num2);
            System.out.println("Smallest = " + num1);
        } else {
            System.out.println("They are equal");
        }
    }
}
