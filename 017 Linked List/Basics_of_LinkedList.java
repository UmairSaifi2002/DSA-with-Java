public class Basics_of_LinkedList {
    public static class Node{
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node Head; // Creating a Head
    public static Node Tail; // Creating a Tail

    public void addFirst(int data) {
        // Step 1 : Create new Node
        Node newNode = new Node(data);
        
        if (Head == null) { // if there is no one node is present
            Head = Tail = newNode;
            return;
        }
        //Step 2 : newNode next = head
        newNode.next = Head;
        // Step 3 : head = newNode
        Head = newNode;
    }

    public static void main(String[] args) {
        
    }
}