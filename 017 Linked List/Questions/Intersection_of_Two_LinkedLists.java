/**
 * Intersection_of_Two_LinkedLists
 */
public class Intersection_of_Two_LinkedLists {

    public static void main(String[] args) {

        // Create two linked lists
        LinkedList listA = new LinkedList();
        listA.addNode(1);
        listA.addNode(2);
        listA.addNode(3);
        listA.addNode(6);
        listA.addNode(7);

        LinkedList listB = new LinkedList();
        listB.addNode(4);
        listB.addNode(5);
        // listB.addNode(8);
        // listB.addNode(9);

        // Print the lists before intersection
        System.out.println("List A before intersection:");
        listA.printList();
        System.out.println("List B before intersection:");
        listB.printList();

        // Intersect the lists at nodes 3 and 8
        listA.intersect(listB, listA, 5, 6);

        // Print the lists after intersection
        System.out.println("List A after intersection:");
        listA.printList();
        System.out.println("List B after intersection:");
        listB.printList();

        // Print the size of LinkedList
        int sizeA = listA.size();
        int sizeB = listB.size();

        // Method to Detect the intersection
        int diff = 0;
        // int diff = (sizeA > sizeB) ? (sizeA - sizeB) : (sizeB - sizeA);
        // System.out.println(diff);

        if (sizeA >= sizeB) {
            diff = sizeA - sizeB;
            System.out.println(listA.isIntersect(listA, listB, diff));
        } else {
            diff = sizeB - sizeA;
            System.out.println(listB.isIntersect(listB, listA, diff));
        }

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

// LinkedList class
class LinkedList {
    Node head;

    // Method to add a new node to the list
    public void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node lastNode = head;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }
        lastNode.next = newNode;
    }

    // Method to intersect two lists at a specified node
    public void intersect(LinkedList FirstList, LinkedList SecondList, int nodeA, int nodeB) {
        Node currentA = FirstList.head;
        Node currentB = SecondList.head;
        while (currentA.data != nodeA) {
            currentA = currentA.next;
        }
        while (currentB.data != nodeB) {
            currentB = currentB.next;
        }
        currentA.next = currentB;
    }

    // Method to print the list
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Method to Finding
    public int size() {
        Node temp = head;
        int size = 0;
        while (temp != null) {
            temp = temp.next;
            size++;
        }
        return size;
    }

    // Method to Find Interssection
    public boolean isIntersect(LinkedList A, LinkedList B, int diff) {
        Node tempA = A.head;
        Node tempB = B.head;
        int i = 0;
        while (i < diff) {
            tempA = tempA.next;
            i++;
        }
        while (tempB != null) {
            if (tempA == tempB) {
                return true;
            }
            tempA = tempA.next;
            tempB = tempB.next;
        }
        return false;
    }

}
