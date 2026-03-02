import java.util.Scanner;
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s;
        System.out.println("Welcome to Palindrome Checker App Management System");
        System.out.println("Enter a string:");
        s = sc.nextLine();

        s = s.toLowerCase();

        boolean result = PalindromeService.check(s);

        System.out.println("Is Palindrome?: " + result);

        sc.close();
    }
}

class PalindromeService {
    public static boolean check(String s) {

        int start = 0;
        int end = s.length() - 1;
        // Base case: pointers have crossed or met
        while (start < end) {
            // If characters do not match
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            // Recursive call moving inward
            start++;
            end--;
        }
        return true;
    }
}
