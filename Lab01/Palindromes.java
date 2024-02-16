import java.util.Scanner;

public class Palindromes {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String palindrome = scan.nextLine();
        scan.close();

        if (isPalindrome(palindrome)) {
            System.out.println(palindrome.toUpperCase() + " is a Palindrome");
        } else {
            System.out.println(palindrome + " is NOT a Palindrome");
        }
    }

    public static boolean isPalindrome(String palindrome) {
       
        palindrome = palindrome.toLowerCase();
        char extract;
        String reverse = "";

        for (int i = 0; i < palindrome.length(); i++) {
            extract = palindrome.charAt(i);
            reverse = extract + reverse;
        }

        return palindrome.equals(reverse);
    }
}
