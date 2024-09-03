/**
 * Print_LinkedList_in_Zig_Zag_pattern
 */
public class Print_LinkedList_in_Zig_Zag_pattern {

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addFirst(0);
        ll.print();
        ll.zig_zag_pattern();
        ll.print();
    }
}

class LinkedList {

    public static class Node {
        int data;
        Node next;

        // constructor
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node Head;
    public static Node Tail;
    public static int size;

    public void addFirst(int data) {
        Node temp = new Node(data);
        size++;
        if (Head == null) {
            Head = Tail = temp;
            return;
        }
        temp.next = Head;
        Head = temp;
    }

    public void addLast(int data) {
        Node temp = new Node(data);
        size++;
        if (Head == null) {
            Head = Tail = temp;
            return;
        }
        while (Head.next != null) {
            Head = Head.next;
        }
        Head.next = temp;
        Tail = temp;
    }

    public void print() {
        Node temp = Head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.err.println("null");
    }

    public Node getMid() {
        Node slow = Head, fast = Head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public void zig_zag_pattern() {
        // finding mid
        Node mid = getMid();

        // reverse remaining half LinkedList
        Node prev = null;
        Node curr = mid.next;
        mid.next = null;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // linking for the zig zag pattern
        Node left = Head, right = prev;
        Node nextL, nextR;

        // While both left and right pointers are not null, keep merging the nodes
        while (left != null && right != null) {

            // Store the next node of the current left node
            nextL = left.next;

            // Link the current left node to the current right node
            left.next = right;

            // Store the next node of the current right node
            nextR = right.next;

            // Link the current right node to the next left node (stored earlier)
            right.next = nextL;

            // Move the left pointer to the next node in the original left half
            left = nextL;

            // Move the right pointer to the next node in the original right half
            right = nextR;
        }

    }
}