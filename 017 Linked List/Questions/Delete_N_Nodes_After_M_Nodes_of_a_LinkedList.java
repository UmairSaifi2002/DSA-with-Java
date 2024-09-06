public class Delete_N_Nodes_After_M_Nodes_of_a_LinkedList {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(6);
        ll.addLast(7);
        ll.addLast(8);
        ll.print();
        ll.deleteNnodes(2, 2);
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
        System.out.println("null");
    }

    public void Delete(Node temp) {
        Node temp1 = Head;
        while (temp1.next != temp) {
            temp1 = temp1.next;
        }
        temp1.next = temp.next;
    }

    // Method to Delete Nodes from linkedlist after stepping some node untill the end
    public void deleteNnodes(int step, int delete) {
        Node temp = Head;
        int i = 0;
        int j = 0;
        while (temp != null) {
            while (i < step) {
                temp = temp.next;
                i++;
            }
            i = 0;
            while (j < delete) {
                Delete(temp);
                temp = temp.next;
                j++;
            }
            j = 0;
        }
    }

}

