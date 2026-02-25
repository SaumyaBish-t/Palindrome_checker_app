package Java;

public class UseCase9PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "radar";

        if (isPalindrome(input, 0, input.length() - 1)) {
            System.out.println(input + " is a Palindrome");
        } else {
            System.out.println(input + " is NOT a Palindrome");
        }
    }

    // Recursive palindrome check
    static boolean isPalindrome(String str, int start, int end) {

        // Base condition: crossed pointers or single character
        if (start >= end) {
            return true;
        }

        // If characters don't match
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        // Recursive call
        return isPalindrome(str, start + 1, end - 1);
    }
}
