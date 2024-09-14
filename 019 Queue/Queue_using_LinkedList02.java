import java.util.*;

public class Queue_using_LinkedList02 {
    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);

        while (!q.isEmpty()) {
            System.out.print(q.Head.data+" ");
            q.remove();
        }
    }
}

class Node{
    int data;
    Node next;

    // Constructor
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Queue{
    static Node Head = null;
    static Node Tail = null;

    // checking the queue is empty?
    public static boolean isEmpty() {
        return Head == null && Tail == null;
    }

    // adding the element in the queue
    public static void add(int data) {
        Node newNode = new Node(data);
        if (Head == null) {
            Head = Tail = newNode;
            return;
        }
        Tail.next = newNode;
        Tail = newNode;
    }

    // removing the head from the queue
    public static int remove() {
        // if the queue is empty
        if (isEmpty()) {
            System.out.println("Your Queue is Empty");
            return -1;
        }
        // storing the head data 
        int front = Head.data;
        // only single element is present
        if (Tail == Head) {
            Tail = Head = null;
        }
        // if the queue contains more than one element
        else {
            Head = Head.next;
        }
        return front; // return the head
    }

    // returning the Head
    public static int peek() {
        // checking the queue is empty
        if (isEmpty()) {
            System.out.println("Empty Queue");
            return -1;
        }
        return Head.data;
    }
}