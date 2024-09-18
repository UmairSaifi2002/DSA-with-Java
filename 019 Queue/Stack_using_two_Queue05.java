import java.util.LinkedList;
import java.util.Queue;

public class Stack_using_two_Queue05 {
    // Inner static class that implements the stack using two queues
    static class MyStack {
        // Two queues to simulate the behavior of a stack
        static Queue<Integer> q1 = new LinkedList<>(); // First queue
        static Queue<Integer> q2 = new LinkedList<>(); // Second queue

        // Method to check if the stack is empty
        public static boolean isEmpty() {
            // Stack is empty if both queues are empty
            return q1.isEmpty() && q2.isEmpty();
        }

        // Method to push an element onto the stack
        public static void push(int data) {
            // If q1 is not empty, push the element into q1
            // Otherwise, push it into q2
            if (!q1.isEmpty()) {
                q1.add(data);  // Add to q1 if q1 is not empty
            } else {
                q2.add(data);  // Add to q2 if q1 is empty
            }
        }

        // Method to pop the top element from the stack
        public static int pop() {
            // If both queues are empty, the stack is empty
            if (isEmpty()) {
                System.out.println("empty stack");
                return -1;  // Return -1 to indicate stack is empty
            }

            int top = -1;  // Variable to hold the top element

            // Case 1: If q1 is not empty, move elements from q1 to q2,
            // leaving the last element in q1 to pop it
            if (!q1.isEmpty()) {
                while (!q1.isEmpty()) {
                    top = q1.remove();  // Remove from q1
                    if (q1.isEmpty()) {
                        break;  // Break once the last element is removed (the top)
                    }
                    q2.add(top);  // Move all other elements to q2
                }
            } 
            // Case 2: If q2 is not empty, move elements from q2 to q1,
            // leaving the last element in q2 to pop it
            else {
                while (!q2.isEmpty()) {
                    top = q2.remove();  // Remove from q2
                    if (q2.isEmpty()) {
                        break;  // Break once the last element is removed (the top)
                    }
                    q1.add(top);  // Move all other elements to q1
                }
            }
            return top;  // Return the top element (popped element)
        }

        // Method to return the top element of the stack without popping it
        public static int peek() {
            // If both queues are empty, the stack is empty
            if (isEmpty()) {
                System.out.println("empty stack");
                return -1;  // Return -1 to indicate stack is empty
            }

            int top = -1;  // Variable to hold the top element

            // Case 1: If q1 is not empty, move elements from q1 to q2 and find the top
            if (!q1.isEmpty()) {
                while (!q1.isEmpty()) {
                    top = q1.remove();  // Remove from q1
                    q2.add(top);  // Move all elements to q2 (including the top)
                }
            } 
            // Case 2: If q2 is not empty, move elements from q2 to q1 and find the top
            else {
                while (!q2.isEmpty()) {
                    top = q2.remove();  // Remove from q2
                    q1.add(top);  // Move all elements to q1 (including the top)
                }
            }
            return top;  // Return the top element (without removing it from the stack)
        }
    }

    public static void main(String[] args) {
        // Create an instance of MyStack
        MyStack s = new MyStack();

        // Push elements onto the stack
        s.push(1);  // Push 1
        s.push(2);  // Push 2
        s.push(3);  // Push 3
        s.push(4);  // Push 4

        // Pop and print all elements until the stack is empty
        while (!s.isEmpty()) {  // Loop until the stack is empty
            System.out.println(s.peek());  // Print the top element
            s.pop();  // Remove the top element
        }
    }
}
