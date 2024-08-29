
public class Detecting_Cycle_in_LinkedList {
    
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
    }
}

class LinkedList{

    public static class Node{
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node Head;
    public static Node Tail;
    public static int size;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (Head == null) {
            Head = Tail = newNode;
        }
        newNode.next = Head;
        Head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (Head == null) {
            Head = Tail = newNode;
        }
        Tail.next = newNode;
        Tail = newNode;
    }

    public void CreateLoopInLinkedList(int position) {
        Node temp = Head;
        int i = 0;
        while (i < position) {
            temp = temp.next;
            i++;
        }
        Tail.next = temp;
    }

    public boolean CheckForLoop() {
        Node slow = Head;
        Node Fast = Head;
        while (Fast != null && Fast.next != null) {
            slow = slow.next;
            Fast = Fast.next.next;
            if (slow == Fast) {
                return true;
            }
        }
        return false;
    }

    public void print(){
        Node temp = Head;
        while (temp != null) {
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

}