import java.util.*;

public class Palindrome_or_not{
    public static boolean palindrome(int n) {
        int original = n;
        int num = 0;
        while (n>0) {
            num = ((num*10) + (n%10));
            n=n/10;
        }
        if (num == original) return true;
        return false;
    }
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        boolean result = palindrome(num);
        if (result) System.out.println("Your Number is palindrome");
        else System.out.println("Your Number is not a palindrome");
    }
}