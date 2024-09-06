public class Odd_Even_LinkedList {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addNode(8);
        ll.addNode(12);
        ll.addNode(10);
        ll.addNode(5);
        ll.addNode(4);
        ll.addNode(1);
        ll.addNode(6);
        ll.print();
        ll.OddEven(ll);
    }
}

// Node class
class Node {
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    // Define a static inner class Node to represent each element in the LinkedList
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

    public void OddEven(LinkedList ll){
        LinkedList odd = new LinkedList();
        LinkedList even = new LinkedList();
        // ll.print();
        Node temp = ll.Head;
        // System.out.println(temp.data);
        while (temp != null) {
            if (temp.data%2 == 0) {
                even.addNode(temp.data);
            } else {
                odd.addNode(temp.data);
            }
            temp = temp.next;
        }
        // odd.print();
        // even.print();
        // System.out.println(odd.Tail.data);
        // System.out.println(even.Tail.data);
        even.Tail.next = odd.Head;
        LinkedList result = even;
        result.print(); 
    }

}

