import java.util.*;

public class Reverse_a_Stack05 {

    // Method to reverse a given string using a Stack
    public static String reverse(String str) {
        // Create a Stack to store characters
        Stack<Character> s = new Stack<>();
        int i = 0;
        while (i < str.length()) {
            s.push(str.charAt(i));
            // System.out.println(str.charAt(i));
            i++;
        }
        StringBuilder result = new StringBuilder("");
        while (!s.isEmpty()) {
            char c = s.pop();
            // System.out.println(c);
            result.append(c);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String a = "ifias riamu";
        System.out.println(reverse(a));
    }
}
