package Java;

// Service class responsible only for palindrome checking
class PalindromeChecker {

    // Public method exposed to clients
    public boolean checkPalindrome(String input) {

        if (input == null) {
            return false;
        }

        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        int start = 0;
        int end = normalized.length() - 1;

        while (start < end) {
            if (normalized.charAt(start) != normalized.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}

// Application entry point
public class UseCase11PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "Never Odd Or Even";

        PalindromeChecker checker = new PalindromeChecker();

        if (checker.checkPalindrome(input)) {
            System.out.println("\"" + input + "\" is a Palindrome");
        } else {
            System.out.println("\"" + input + "\" is NOT a Palindrome");
        }
    }
}
