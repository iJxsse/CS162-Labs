import java.util.Scanner;

public class Primes {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
      
        if (scan.hasNextInt()) {
            int num = scan.nextInt();

            if (isPrime(num)) {
                System.out.println(num + " is a Prime number");
            } else {
                System.out.println(num + " is not a Prime number");
            }
        } else {
            System.out.println("Invalid number. Please enter a valid number");
            scan.nextInt();
        }

        scan.close();
    }

    public static boolean isPrime(int num) {

        if (num < 2) {
            return false;
        }

        int i = 2;

        do {
            if (num % i == 0) {
                return false;
            }
            i++;
        } while (i * i <= num);

        return true;
    }
}
