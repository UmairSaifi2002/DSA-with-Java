// Main class to test the LinkedList functionality
public class Odd_Even_LinkedList {
    public static void main(String[] args) {
        // Create a new LinkedList instance
        LinkedList ll = new LinkedList();
        
        // Add nodes to the LinkedList
        ll.addNode(8);
        ll.addNode(12);
        ll.addNode(10);
        ll.addNode(5);
        ll.addNode(4);
        ll.addNode(1);
        ll.addNode(6);
        
        // Print the original LinkedList
        ll.print();
        
        // Call the OddEven method to separate odd and even nodes
        ll.OddEven(ll);
    }
}

// Node class representing each element in the LinkedList
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// LinkedList class with methods to add nodes, print the list, and separate odd and even nodes
class LinkedList {
    // Head and Tail pointers to keep track of the LinkedList
    Node Head;
    Node Tail;

    // Method to add a new node to the list
    public void addNode(int data) {
        Node newNode = new Node(data);
        if (Head == null) {
            Head = newNode;
            return;
        }
        Node lastNode = Head;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }
        lastNode.next = newNode;
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

    // Method to separate odd and even nodes and print the result
    public void OddEven(LinkedList ll) {
        // Create separate LinkedLists for odd and even nodes
        LinkedList odd = new LinkedList();
        LinkedList even = new LinkedList();

        // Traverse the original LinkedList
        Node temp = ll.Head;

        // Separate odd and even nodes
        while (temp != null) {
            if (temp.data % 2 == 0) {
                even.addNode(temp.data);
            } else {
                odd.addNode(temp.data);
            }
            temp = temp.next;
        }

        // Combine the even and odd LinkedLists
        even.Tail.next = odd.Head;

        // Print the resulting LinkedList
        LinkedList result = even;
        result.print();
    }
}

