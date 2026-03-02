import java.util.Scanner;
import java.util.Stack;
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s;
        System.out.println("Welcome to Palindrome Checker App Management System");
        System.out.println("Enter a string:");
        s = sc.nextLine();

        s = s.toLowerCase();

        PalindromeStrategy strategy = new StackStrategy();

        boolean result = strategy.check(s);

        System.out.println("Is Palindrome?: " + result);

        sc.close();
    }
}

interface PalindromeStrategy{
    boolean check(String s);
}

class StackStrategy implements PalindromeStrategy{
    @Override
    public boolean check(String s) {

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            stack.push(c);
        }

        for (char c : s.toCharArray()) {
            if (c != stack.pop()){
                return false;
            }
        }
        return true;
    }
}