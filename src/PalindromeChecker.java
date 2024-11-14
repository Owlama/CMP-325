

import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String org_str = sc.nextLine();

        if (isPalindrome(org_str)) {
            System.out.println(org_str + " is a Palindrome");
        } else {
            System.out.println(org_str + " is not a Palindrome");
        }
        sc.close();
    }

    public static boolean isPalindrome(String str) {
        if (str == null)
            return false;

        String reverse_str = new StringBuilder(str).reverse().toString();
        return str.equals(reverse_str);
    }
}
