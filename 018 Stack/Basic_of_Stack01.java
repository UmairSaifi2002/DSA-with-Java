import java.util.*;

public class Basic_of_Stack01 {

    static class Stack{

        static ArrayList<Integer> List = new ArrayList<>();

        // Method to check that stack is empty or what
        public static boolean isEmpty() {
            // finding that stack is empty or what
            return List.size() == 0;
        }

        // push :- Method to push element in the stack at the last position
        public static void push(int data) {
            List.add(data);
        }

        // pop :- Method to pop element form the starting of the stack
        public static int pop() {
            // case :- When our Stack is Empty
            if (isEmpty()) {
                return -1;
            }
            // When stack is not Empty
            int top = List.get(List.size()-1);
            List.remove(List.size()-1);
            return top;
        }

        // peek :- Method to get the its first element
        public static int peek() {
            // case :- When our Stack is Empty
            if (isEmpty()) {
                return -1;
            }
            // when stack is not empty
            return List.get(List.size()-1);
        }
    }

    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);

        while (!s.isEmpty()) {
            System.out.print(s.peek()+", ");
            s.pop();
        }
    }
}
