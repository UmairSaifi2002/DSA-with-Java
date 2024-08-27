public class Remove_Node_from_LinkedList {

    public static void main(String[] args) {
        // Create a new LinkedList object
        LinkedList ll = new LinkedList();

        // Add elements to the LinkedList
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);

        // Print the LinkedList
        ll.print();

        // Removing the first Node
        System.out.println(ll.removeFirst());
        ll.print();

        // Removing the Last Node
        System.out.println(ll.removeLast());
        ll.print();
    }
}

class LinkedList {
    // Define a static inner class Node to represent each element in the LinkedList
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Declare Head and Tail references to keep track of the LinkedList
    public static Node Head;
    public static Node Tail;
    public static int size; // Creating a variable which stores the size of the LinkedList

    // Method to add a new element at the beginning of the LinkedList
    public void addFirst(int data) {
        // Create a new Node with the given data
        Node newNode = new Node(data);
        size++;

        // If the LinkedList is empty, set both Head and Tail to the new Node
        if (Head == null) {
            Head = Tail = newNode;
            return;
        }

        // Link the new Node to the current Head
        newNode.next = Head;

        // Update the Head reference to point to the new Node
        Head = newNode;
    }

    // Method to add a new element at the end of the LinkedList
    public void addLast(int data) {
        // Create a new Node with the given data
        Node newNode = new Node(data);
        size++;

        // If the LinkedList is empty, set both Head and Tail to the new Node
        if (Head == null) {
            Head = Tail = newNode;
            return;
        }

        // Link the current Tail to the new Node
        Tail.next = newNode;

        // Update the Tail reference to point to the new Node
        Tail = newNode;
    }

    // Method to add a new element at the specified index in the middle of the LinkedList
    public void AddInTheMiddle(int index, int data) {
        // If the index is 0, add the element at the beginning
        if (index == 0) {
            addFirst(data);
            return;
        }

        // Create a new Node with the given data
        Node newNode = new Node(data);
        size++;

        // Find the node before the insertion point
        Node temp = Head;
        int i = 0;
        while (i < index - 1) {
            temp = temp.next;
            i++;
        }

        // Insert the new Node at the specified index
        newNode.next = temp.next;
        temp.next = newNode;
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

    // Method to Remove First Node from the LinkedList
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
        int val = Head.data;
        Head = Head.next;
        size--;
        return val;
    }

    // Method to Remove Last Node from LinkedList
    public int removeLast() {
        if (size == 0) {
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
        int i = 0;
        while (i < size-2) {
            temp = temp.next;
            i++;
        }
        int val = temp.next.data;
        temp.next = null;
        Tail = temp;
        size--;
        return val;
    }
}
