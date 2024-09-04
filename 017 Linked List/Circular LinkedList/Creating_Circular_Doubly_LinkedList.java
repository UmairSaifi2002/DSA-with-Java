public class Creating_Circular_Doubly_LinkedList {
    public static void main(String[] args) {
        Circular_Doubly_LinkedList dll = new Circular_Doubly_LinkedList();
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.addLast(4);
        dll.addLast(5);
    }
}

class Circular_Doubly_LinkedList {
    // Inner class representing a node in the doubly linked list
    public class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    // Head and Tail references to keep track of the list
    public static Node Head;
    public static Node Tail;
    public static int size;

    // Method to add a new node at the beginning of the list
    public void addFirst(int data) {
        Node temp = new Node(data);
        size++;
        if (Head == null) {
            // If the list is empty, set both Head and Tail to the new node
            Head = Tail = temp;
            return;
        }
        // Otherwise, link the new node to the current Head
        temp.next = Head;
        Head.prev = temp;
        Head = temp;
    }

    // Method to add a new node at the end of the list
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (Head == null) {
            // If the list is empty, set both Head and Tail to the new node
            Head = Tail = newNode;
            return;
        }
        // Otherwise, traverse to the last node and link the new node
        Node temp = Head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
        Tail = newNode;
    }

    // Method to remove the first node from the list
    public int removeFirst() {
        if (size == 0) {
            // If the list is empty, return a special value
            System.out.println("LinkedList is Empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            // If the list has only one node, remove it and reset Head and Tail
            int val = Head.data;
            Head = Tail = null;
            size = 0;
            return val;
        }
        // Otherwise, remove the first node and update Head
        Node temp = Head;
        int val = temp.data;
        temp = temp.next;
        temp.prev = null;
        Head = temp;
        size--;
        return val;
    }

    // Method to remove the last node from the list
    public int removeLast() {
        if (size == 0) {
            // If the list is empty, return a special value
            System.out.println("LinkedList is Empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            // If the list has only one node, remove it and reset Head and Tail
            int val = Head.data;
            Head = Tail = null;
            size = 0;
            return val;
        }
        // Otherwise, remove the last node and update Tail
        Node temp = Tail.prev;
        int val = Tail.data;
        Tail.prev = null;
        temp.next = null;
        Tail = temp;
        size--;
        return val;
    }

    // Method to print the elements of the list in forward order
    public void print() {
        Node temp = Head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Method to print the elements of the list in reverse order
    public void printReverse() {
        Node temp = Tail;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.prev;
        }
        System.out.println("null");
    }

    // Method to reverse the doubly linked list
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
}
