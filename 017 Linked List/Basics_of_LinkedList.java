public class Basics_of_LinkedList {
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
    public static Node Head; // Creating a Head
    public static Node Tail; // Creating a Tail

    // Method to add a new element at the beginning of the LinkedList
    public void addFirst(int data) {
        // Step 1: Create a new Node with the given data
        Node newNode = new Node(data);

        // If the LinkedList is empty, set both Head and Tail to the new Node
        if (Head == null) {
            Head = Tail = newNode;
            return;
        }

        // Step 2: Set the new Node's next reference to the current Head
        newNode.next = Head;

        // Step 3: Update the Head reference to point to the new Node
        Head = newNode;
    }

    // Method to add a new element at the end of the LinkedList
    public void addLast(int data) {
        // Step 1: Create a new Node with the given data
        Node newNode = new Node(data);

        // If the LinkedList is empty, set both Head and Tail to the new Node
        if (Head == null) {
            Head = Tail = newNode;
            return;
        }

        // Step 2: Set the current Tail's next reference to the new Node
        Tail.next = newNode;

        // Step 3: Update the Tail reference to point to the new Node
        Tail = newNode;
    }

    // Method to print the elements of the LinkedList
    public void print() {
        // Start from the Head and traverse the LinkedList until the end
        Node temp = Head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print("null");
    }
}


