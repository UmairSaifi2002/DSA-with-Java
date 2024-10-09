import java.util.*; // We need this to use ArrayList and other cool stuff

public class Find_kth_Smallest_Element_in_BST03 {

    // This method finds the k-th smallest number in the tree
    public static void kthSmallest(Node root, ArrayList<Integer> a) {
        if (root == null) { // If the tree is empty, do nothing
            return;
        }
        kthSmallest(root.left, a); // Check the left side of the tree
        a.add(root.data); // Add the current number to our list
        kthSmallest(root.right, a); // Check the right side of the tree
    }

    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        BST b = new BST(); // Let's make a new tree!
        Node root = null; // Start with no tree
        int arr[] = {8, 5, 3, 6, 11, 20}; // These are the numbers we'll put in the tree
        for (int i = 0; i < arr.length; i++) { // Put each number in the tree
            root = b.insert(root, arr[i]);
        }
        ArrayList<Integer> a = new ArrayList<>(); // A list to hold our numbers
        int k = 3; // We want to find the 3rd smallest number
        kthSmallest(root, a); // Find all the numbers in order
        System.out.println(a.get(k-1)); // Print the 3rd smallest number (lists start at 0, so we use k-1)
    }
}

class Node {
    int data; // The number we put in the tree
    Node left, right; // The tree can have branches to the left and right
    Node(int data) { // A new part of the tree
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class BST {
    public static Node insert(Node root, int val) {
        if (root == null) { // If there's no tree, make a new one!
            return new Node(val);
        }
        if (val < root.data) { // If our number is smaller, put it on the left
            root.left = insert(root.left, val);
        }
        if (val > root.data) { // If our number is bigger, put it on the right
            root.right = insert(root.right, val);
        }
        return root; // Done!
    }
}
