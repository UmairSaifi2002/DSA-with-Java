import java.util.*;

public class Push_at_the_Bottom_of_Stack04 {

    public static void PushAtBottom(Stack<Integer> s, int data) {
        // if the stack is empty then push the data into it
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        // pop and store the data untill the stack is empty
        int top = s.pop();
        PushAtBottom(s, data);
        // after adding the data at bottom now be 
        s.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        // System.out.println(s);
        PushAtBottom(s, 4);
        // System.out.println(s);
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}