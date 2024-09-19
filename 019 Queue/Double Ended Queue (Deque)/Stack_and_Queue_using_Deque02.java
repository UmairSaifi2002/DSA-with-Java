import java.util.*;
import java.util.LinkedList;
public class Stack_and_Queue_using_Deque02 {

    static class stack{
        Deque<Integer> deque = new LinkedList<>();

        public void push(int data) {
            deque.addLast(data);
        }

        public int pop() {
            return deque.removeLast();
        }

        public int peek() {
            return deque.getLast();
        }

        public boolean isEmpty(){
            return deque.size() == 0;
        }
    }

    static class queue{
        Deque<Integer> deque = new LinkedList<>();
        public void add(int data) {
            deque.addLast(data);
        }
        public int remove() {
            return deque.removeFirst();
        }
        public int peek() {
            return deque.getFirst();
        }
        public boolean isEmpty() {
            return deque.size() == 0;
        }
    }
    
    public static void main(String[] args) {
        // making a Stack Using Deque
        stack s = new stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        // System.out.println(s);
        while (!s.isEmpty()) {
            System.out.print(s.peek()+" ");
            s.pop();
        }

        System.out.println();

        // Making a Queue using Deque
        queue q = new queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        // System.out.println(q);
        while (!q.isEmpty()) {
            System.out.print(q.peek()+" ");
            q.remove();
        }

    }
}
