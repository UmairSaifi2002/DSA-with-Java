public class Creating_Doubly_Circular_LinkedList {

    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        Doubly_LinkedList dll = new Doubly_LinkedList();
        dll.addLast(5);
        dll.addFirst(4);
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.print();
        System.out.println(dll.Head.prev == dll.Tail);
        System.out.println(dll.Tail.next == dll.Head);
        dll.toCircular();
        System.out.println(dll.Head.prev == dll.Tail);
        System.out.println(dll.Tail.next == dll.Head);
    }
}

class Doubly_LinkedList{

    public class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node Head;
    public static Node Tail;
    public static int size;

    public void addFirst(int data) {
        Node temp = new Node(data);
        size++;
        if (Head == null) {
            Head = Tail = temp;
            return;
        }
        temp.next = Head;
        Head.prev = temp;
        Head = temp;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (Head == null) {
            Head = Tail = newNode;
            return;
        }
        Node temp = Head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
        Tail = newNode;
    }

    public int removeFirst() {
        if (size == 0) { // if the LinkedList is Empty
            System.out.println("LinkedList is Empty");
            return Integer.MIN_VALUE;
        }
        else if (size == 1) { // if the LinkedList have only one Node
            int val = Head.data;
            Head = Tail = null;
            size = 0;
            return val;
        }
        Node temp = Head;
        int val = temp.data;
        temp = temp.next;
        temp.prev = null;
        Head = temp;
        size--;
        return val;
    }

    public int removeLast() {
        if (size == 0) { // if the LinkedList is Empty
            System.out.println("LinkedList is Empty");
            return Integer.MIN_VALUE;
        }
        else if (size == 1) { // if the LinkedList have only one Node
            int val = Head.data;
            Head = Tail = null;
            size = 0;
            return val;
        }
        Node temp = Tail.prev;
        int val = Tail.data;
        Tail.prev = null;
        temp.next = null;
        Tail = temp;
        size--;
        return val;
    }

    // Method to print the elements of the LinkedList
    public void print() {
        // Start from the Head and traverse the LinkedList until the end
        Node temp = Head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void printReverse() {
        Node temp = Tail;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.prev;
        }
        System.out.println("null");
    }

    public void reverseDoublyLinkedList() {
        if (size == 0) {
            System.out.println("Doubly LinkedList is Empty");
            return;
        }
        if (size == 1) {
            System.out.println("Your LinkedList is already reversed");
            return;
        }
        Node prev = null;
        Node curr = Head;
        Node next;
        Tail = curr;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }
        Head = prev;
    }

    public void toCircular() {
        Tail.next = Head;
        Head.prev = Tail;
    }

}