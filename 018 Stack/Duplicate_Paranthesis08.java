import java.util.*;

public interface Duplicate_Paranthesis08 {

    public static boolean findDuplicates(String str) {
        Stack<Character> s = new Stack<>();
        // int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // closing condition
            if (ch == ')') {
                int count = 0;
                while (s.peek() != '(') {
                    s.pop();
                    count++;
                }
                // we can use another while loop in which we can remove the peek and use pop
                // while (s.pop() != '(') // it will pop the element if the element is not a opening paranthesises
                // then it update the count
                // and if we use this then we donot want too use else conditon
                if (count < 1) {
                    return true; // duplicate found
                }
                else {
                    s.pop(); // poping opening pair
                }
            }

            // opening condition
            else {
                // opening
                s.push(ch);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "((a+b)+(a+b))";
        String strs = "(((a+b)+((B))))";
        System.out.println(findDuplicates(str));
        System.out.println(findDuplicates(strs));
    }
}
