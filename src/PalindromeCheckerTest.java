public class PalindromeCheckerTest {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase(); // ignore case sensitivity
        int left = 0, right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

