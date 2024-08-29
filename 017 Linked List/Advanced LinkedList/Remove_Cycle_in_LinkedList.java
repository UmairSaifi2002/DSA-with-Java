public class Remove_Cycle_in_LinkedList {

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        // Add elements to the LinkedList
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        ll.addLast(7);
        ll.addLast(8);
        ll.addLast(9);
        System.out.println(ll.CheckForLoop());

        // print
        ll.print();

        // cerating a loop
        ll.CreateLoopInLinkedList(3);
        // ll.print();
        System.out.println(ll.CheckForLoop());

        // Remove a loop
        ll.RemoveCycle();
        System.out.println(ll.CheckForLoop());
        ll.print();
    }
}

class LinkedList {
    // Inner class representing a node in the linked list
    public static class Node {
        int data;
        Node next;

        // Constructor to create a new node with given data
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Head and Tail pointers to keep track of the start and end of the list
    public static Node Head;
    public static Node Tail;

    // Size of the linked list
    public static int size;

    // Method to add a new node at the beginning of the list
    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;

        // If the list is empty, set both Head and Tail to the new node
        if (Head == null) {
            Head = Tail = newNode;
        } else {
            // Otherwise, insert the new node at the beginning
            newNode.next = Head;
            Head = newNode;
        }
    }

    // Method to add a new node at the end of the list
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;

        // If the list is empty, set both Head and Tail to the new node
        if (Head == null) {
            Head = Tail = newNode;
        } else {
            // Otherwise, append the new node to the end
            Tail.next = newNode;
            Tail = newNode;
        }
    }

    // Method to create a loop in the linked list at a specified position
    public void CreateLoopInLinkedList(int position) {
        Node temp = Head;
        int i = 0;

        // Traverse the list to the specified position
        while (i < position) {
            temp = temp.next;
            i++;
        }

        // Create a loop by pointing the Tail to the node at the specified position
        Tail.next = temp;
    }

    // Method to detect if a loop exists in the linked list
    public boolean CheckForLoop() {
        Node slow = Head;
        Node Fast = Head;

        // Use Floyd's Cycle Detection algorithm to detect a loop
        while (Fast != null && Fast.next != null) {
            slow = slow.next;
            Fast = Fast.next.next;

            // If the slow and fast pointers meet, a loop exists
            if (slow == Fast) {
                return true;
            }
        }

        return false;
    }

    // Method to print the linked list
    public void print() {
        Node temp = Head;

        // Traverse the list and print each node's data
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    // Method to remove a loop from the linked list
    public void RemoveCycle() {
        Node slow = Head;
        Node fast = Head;

        // Detect the loop using Floyd's Cycle Detection algorithm
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            // If the slow and fast pointers meet, a loop exists
            if (slow == fast) {
                slow = Head;
                break;
            }
        }

        // Find the start of the loop
        while (slow.next != fast.next) {
            slow = slow.next;
            fast = fast.next;
        }

        // Remove the loop by pointing the last node to null
        fast.next = null;
    }
}
