// import java.util.*;
import java.util.Stack;

public class Queue_using_two_Stack04 {

    static class Queue{
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public static boolean isEmpty() {
            return s1.isEmpty();
        }

        //add function  o(n)
        public static void add(int data) {
            // transfering the elements from s1 to s2
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
            // now add the element to s1
            s1.push(data);
            // now afain transfer the data from s2 to s1
            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }

        //  remove function o(1)
        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            return s1.pop();
        }

        // peek function o(1)
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            return s1.peek();
        }
    }

    public static class Queue1 {
        static Stack<Integer> s11 = new Stack<>();
        static Stack<Integer> s21 = new Stack<>();

        public static boolean isEmpty() {
            return s11.isEmpty();
        }

        // Add elements in O(1) time
        public static void add(int data) {
            s11.push(data);
        }

         // Remove elements in O(n) time
         public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            // Transfer elements from s11 to s21
            while (!s11.isEmpty()) {
                s21.push(s11.pop());
            }
            // Get the front element
            int data = s21.pop();
            // Transfer the remaining elements back to s11
            while (!s21.isEmpty()) {
                s11.push(s21.pop());
            }
            return data;
        }

        // Peek element in O(n) time
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            // Transfer elements from s11 to s21
            while (!s11.isEmpty()) {
                s21.push(s11.pop());
            }
            // Get the front element
            int data = s21.peek();
            // Transfer all elements back to s11
            while (!s21.isEmpty()) {
                s11.push(s21.pop());
            }
            return data;
        }
    }

    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }

        Queue1 q1 = new Queue1();
        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);
        q1.add(5);
        while (!q1.isEmpty()) {
            System.out.println(q1.peek());
            q1.remove();
        }
    }
}
