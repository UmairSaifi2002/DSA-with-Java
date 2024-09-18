// import java.util.*;

public class Basic_of_Queue01 {
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.print(q.peek()+" ");
            q.remove();
        }

        CircularQueue cq = new CircularQueue(5);
        cq.add(1);
        cq.add(2);
        cq.add(3);
        cq.add(4);

        System.out.println();

        while (!cq.isEmpty()) {
            System.out.print(cq.peek()+" ");
            cq.remove();
        }
    }
}

// Normal Queue
class Queue {
    static int arr[];
    static int size;
    static int rear;

    Queue(int n) {
        arr = new int[n];
        size = n;
        rear = -1;
    }

    // Method : Checking the Queue is Empty
    public boolean isEmpty() {
        return rear == -1;
    }

    // Method : Adding a new Element & side by side cecking that Queue is full
    public void add(int data) {
        if (rear == size-1) {
            System.out.println("queue is full");
            return;
        }
        rear = rear+1;
        arr[rear] = data;
    }

    // Method : Removing an Element from the Queue
    public int remove() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        int front = arr[0];
        for (int i = 0; i < rear; i++) {
            arr[i] = arr[i+1];
        }
        rear--;
        return front;
    }

    // Method : to return peek
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        return arr[0];
    }
}

// Circular Queue
class CircularQueue{
    static int arr[];
    static int size;
    static int front;
    static int rear;

    // constructor having same name as the class
    CircularQueue(int n) {
        arr = new int[n];
        size = n;
        front = -1;
        rear = -1;
    }

    // Method to detect the Queue is Empty
    public boolean isEmpty() {
        return rear == -1 && front == -1;
    }

    // Method to detect that Queue is full
    public boolean isFull() {
        return (rear+1)%size == front;
    }

    // Method : to add an element in the Queue
    public void add(int data) {
        if (isFull()) {
            System.out.println("Your Queue is full");
            return;
        }
        // when we are adding our 1st element
        if (front == -1) {
            front = 0;
        }
        rear = (rear+1)%size;
        arr[rear] = data;
    }

    // Method : to remove an element from the Queue
    public int remove() {
        if (isEmpty()) {
            System.out.println("Your Queue is Empty");
            return -1;
        }
        int result = arr[front];

        // when we are removing the last element
        if (rear == front) {
            rear = front = -1;
        }
        else { // else update the front
            front = (front+1) % size;
        }
        return result;
    }

    // Method : to access the peek
    public int peek() {
        if (isEmpty()) {
            System.out.println("Your Queue is Empty");
            return -1;
        }
        return arr[front];
    }
}