import java.util.*;

public class Simplify_Path {

    public static void simplifyPath(String str) {
        Stack<Character> s = new Stack<>();
        int len = 0;
        while (len < str.length()-1) {
            s.push(str.charAt(len));
            len++;
        }
        if (s.peek() == '/') {
            s.pop();
        }
        if (s.peek() == '.') {
            //
        }
    }

    public static void main(String[] args) {
        String str = "/apnacollege/";
    }
}