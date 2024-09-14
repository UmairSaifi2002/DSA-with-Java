import java.util.*;
import java.util.Queue;
import java.util.LinkedList;

public class Queue_by_JCF03 {
    public static void main(String[] args) {
        // Queue is an interface so we cannot make objects of the interface
        // so we have to make it from LinkedList or ArrayDeque

        // using LinkedList
        Queue<Integer> q1 = new LinkedList<>();
        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);
        q1.add(5);
        q1.add(6);

        // Use peek() to get the head of the queue without removing it
        while (!q1.isEmpty()) {
            System.out.print(q1.peek() + " "); // Access the head of the queue
            q1.remove(); // Remove the head of the queue
        }
        System.out.println();

        // using ArrayDeque
        Queue<Character> q2 = new ArrayDeque<>();
        q2.add('A');
        q2.add('B');
        q2.add('C');
        q2.add('D');
        q2.add('E');
        while (!q2.isEmpty()) {
            System.out.print(q2.peek() + " "); // Access the head of the queue
            q2.remove(); // Remove the head of the queue
        }
    }
}
