import java.util.Scanner;
import java.util.LinkedList;
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s;
        System.out.println("Welcome to Palindrome Checker App Management System");
        System.out.println("Enter a string(lower case):");
        s=sc.nextLine();

        LinkedList<Character> list = new LinkedList<>();

        // Push each character of the string into the list
        for (char c : s.toCharArray()) {
            list.addLast(c);
        }

        // Assume palindrome initially
        boolean isPalindrome = true;

        // Iterate again through original string
        while (list.size() > 1) {
            if (list.removeFirst() != list.removeLast()) {
                isPalindrome = false;
                break;
            }
        }

        if(isPalindrome){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Is not a Palindrome");
        }
        sc.close();
    }
}