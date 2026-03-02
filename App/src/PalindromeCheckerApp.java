import java.util.Scanner;
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s;
        System.out.println("Welcome to Palindrome Checker App Management System");
        System.out.println("Enter a string:");
        s = sc.nextLine();

        s = s.toLowerCase();

        boolean isPalindrome = true;

        for( int i=0; i<s.length()/2; i++){
            if(s.charAt(i) != s.charAt(s.length()-1-i)) {

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
