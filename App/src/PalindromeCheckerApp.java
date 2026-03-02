import java.util.Scanner;
import java.util.Stack;
public class PalindromeCheckerApp {
    /**
     * Method 1: Check palindrome using reverse string
     */
    public static boolean isPalindromeUsingReverse(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equalsIgnoreCase(reversed);
    }

    /**
     * Method 2: Check palindrome using two-pointer technique
     */
    public static boolean isPalindromeTwoPointer(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (Character.toLowerCase(str.charAt(left)) != Character.toLowerCase(str.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter String : ");
        String s = scanner.nextLine();

        // -------- Method 1 --------
        long startTime1 = System.nanoTime();
        boolean result1 = isPalindromeUsingReverse(s);
        long endTime1 = System.nanoTime();

        long executionTime1 = (endTime1 - startTime1) / 1000000; // ms

        // -------- Method 2 --------
        long startTime2 = System.nanoTime();
        boolean result2 = isPalindromeTwoPointer(s);

        long endTime2 = System.nanoTime();

        long executionTime2 = (endTime2 - startTime2) / 1000000; // ms

        // Output
        System.out.println("Is Palindrome (Reverse Method): " + result1);
        System.out.println("Execution Time (Reverse): " + executionTime1 + " ms");

        System.out.println("Is Palindrome (Two Pointer): " + result2);
        System.out.println("Execution Time (Two Pointer): " + executionTime2 + " ms");

        scanner.close();
    }
}