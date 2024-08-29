public class Remove_Node_from_End {

    @SuppressWarnings("static-access")
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
        System.out.println(ll.size);

        // remove 3rd node from end
        ll.deleteNthfromEnd(3);
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

    // Searching a Node by iteration
    public int search(int data){
        Node temp = Head;
        int i = 0;
        while (i<size) {
            if (temp.data == data) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    // Searching a Node by Recursively
    // Helper function for the recursion.
    public int Search(int data, Node Temp, int index) {
        // Base Case
        if (Temp == null) {
            return -1;
        }
        // Kaam
        if (Temp.data == data) {
            return index;
        }
        else return Search(data, Temp.next, index+1);// yaha index++ nhi hoga kyuki index to pass kr rhe ho vo pass by value ho rha h.
    }
    // it call the helper to search the data/key from the LinkedList 
    // it only return the data which is returned by the helper function
    public int Search(int data){
        return Search(data, Head, 0);
    }

    // Reverse of the LinkedList
    public void reverse() {
        // Initialize three pointers: previous, current, and next
        Node prev = null; // previous node
        Node curr = Tail = Head; // current node, also set Tail to Head for later use
        Node next; // next node
    
        // Traverse the list until the end
        while (curr != null) {
            // Store the next node before we change curr.next
            next = curr.next;
    
            // Reverse the link of the current node
            curr.next = prev;
    
            // Move prev and curr one step forward
            prev = curr;
            curr = next;
        }
    
        // After the loop, prev is the new head of the reversed list
        Head = prev;
    }

    public void deleteNthfromEnd(int position) {
        if (position == size) {
            removeFirst();
            return;
        }
        if (position == 1) {
            removeLast();
            return;
        }
        int index = size - position - 1 ;
        int i = 0;
        Node prev = Head;
        while (i < index) {
            // System.out.println(prev.data);
            prev = prev.next;
            // System.out.println(prev.data);
            i++;
        }
        // System.out.println(prev.data);
        Node curr = prev.next;
        // System.out.println(curr.data);
        prev.next = curr.next;
    }
    
}