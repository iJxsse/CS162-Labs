import java.util.Scanner;

public class PrimePalindrome {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        scan.close();

        while (!isPrime(num) || !isPalindrome(num)) {
            num++;
        }

        System.out.println("The next prime Palindrome is " + num);
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

    public static boolean isPalindrome(int num) {

        int temp = num;
        int reverse = 0;

        while (temp != 0) {
            int remainder = temp % 10;
            reverse = reverse * 10 + remainder;
            temp = temp / 10;
        }

        if (num == reverse) {
            return true;
        }

        return false;
    }
}
