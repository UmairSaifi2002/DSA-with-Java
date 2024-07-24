import java.util.*;

public class Check_if_a_String_is_palindrome {

    public static boolean IsPalindrome(String str) {
        int n = str.length()-1;
        // for (int i = 0; i < (n+1)/2; i++) {
        //     if (str.charAt(i) != str.charAt(n-i)) {
        //         return false;
        //     }
        // }
        int i = 0;
        while (i <= n) {
            if (str.charAt(i) != str.charAt(n)) {
                return false;
            }
            i++;
            n--;
        }
        return true;
    }

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        boolean result = IsPalindrome(str);
        if (result) System.out.println("Your String '"+str+"' is Palindrome.");
        else System.out.println("Your String '"+str+"' is not a Palindrome.");
        // char b = str.charAt(0);
        // char a = str.charAt(str.length()-1);

        // System.out.println(str.charAt(0)!=str.charAt(str.length()-2));
    }
}