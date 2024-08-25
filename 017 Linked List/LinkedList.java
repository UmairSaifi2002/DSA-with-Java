public class LinkedList {
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
        newNode.next = Head; // Linking our newNode to head of the linked list
        // Step 3 : head = newNode
        Head = newNode;
    }

    public void addLast(int data){
        // Step 1 :- Create new Node
        Node newNode = new Node(data);

        if (Head == null) { // if there is no one node is present
            Head = Tail = newNode;
            return;
        }

        // Step 2 :- newNode next = null
        Tail.next = newNode; // changing Tail

        // Step 3:- Tail = newNode
        Tail = newNode;
    }

    public void print(){
        Node temp = Head;
        while (temp != null) {
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.print();
    }
}