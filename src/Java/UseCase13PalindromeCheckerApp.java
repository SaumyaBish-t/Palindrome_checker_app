package Java;

import java.util.*;

public class UseCase13PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = generateLargePalindrome(10000);

        // Two-pointer approach
        long startTime = System.nanoTime();
        boolean result1 = twoPointerCheck(input);
        long endTime = System.nanoTime();
        long duration1 = endTime - startTime;

        // Stack approach
        startTime = System.nanoTime();
        boolean result2 = stackCheck(input);
        endTime = System.nanoTime();
        long duration2 = endTime - startTime;

        // Deque approach
        startTime = System.nanoTime();
        boolean result3 = dequeCheck(input);
        endTime = System.nanoTime();
        long duration3 = endTime - startTime;

        System.out.println("Two-Pointer Result: " + result1 + " | Time: " + duration1 + " ns");
        System.out.println("Stack Result: " + result2 + " | Time: " + duration2 + " ns");
        System.out.println("Deque Result: " + result3 + " | Time: " + duration3 + " ns");
    }

    // Generate large palindrome string
    private static String generateLargePalindrome(int size) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < size; i++) {
            sb.append("a");
        }

        return sb.toString();
    }

    // Two-pointer approach
    private static boolean twoPointerCheck(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Stack approach
    private static boolean stackCheck(String str) {
        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
            stack.push(ch);
        }

        for (char ch : str.toCharArray()) {
            if (ch != stack.pop()) {
                return false;
            }
        }
        return true;
    }

    // Deque approach
    private static boolean dequeCheck(String str) {
        Deque<Character> deque = new ArrayDeque<>();

        for (char ch : str.toCharArray()) {
            deque.addLast(ch);
        }

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }
        return true;
    }
}
