public class Print_in_Range02 {

    // This method prints all the values in the tree that are between two numbers (k1 and k2)
    public static void printRange(Node root, int k1, int k2) {
        // If the current node is empty (no value), stop and return
        if (root == null) {
            return;
        }

        // If the current node's value is between k1 and k2, we need to check both sides
        if (root.data >= k1 && root.data <= k2) {
            // First, check and print values in the left side (smaller values)
            printRange(root.left, k1, k2);

            // Print the current node's value because it is in the range
            System.out.print(root.data + " ");

            // Then, check and print values in the right side (larger values)
            printRange(root.right, k1, k2);
        }
        // If the current node's value is smaller than k1, we only need to check the right side
        else if (root.data < k1) {
            printRange(root.right, k1, k2);
        }
        // If the current node's value is larger than k2, we only need to check the left side
        else {
            printRange(root.left, k1, k2);
        }
    }

    // This method is used to print all the values in the tree in sorted order
    public static void inOrder(Node root) {
        // If the current node is empty (no value), stop and return
        if (root == null) {
            return;
        }

        // First, print everything in the left side of the current node (smaller values)
        inOrder(root.left);

        // Print the value of the current node
        System.out.print(root.data + " ");

        // Finally, print everything in the right side of the current node (larger values)
        inOrder(root.right);
    }

    // Main method, where our program starts
    public static void main(String[] args) {
        // Array of numbers we want to add to our tree
        int arr[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};

        // Define the range we want to print (k1 to k2)
        int k1 = 5, k2 = 12;
        // You can also try other ranges by uncommenting the following lines:
        // int k1 = 1, k2 = 6;
        // int k1 = 10, k2 = 14;

        // Create an empty tree (root is null)
        Node root = null;

        // Create a new Binary Search Tree (BST) object
        BST b = new BST();

        // Add each number from the array to the tree
        for (int i = 0; i < arr.length; i++) {
            root = b.insert(root, arr[i]);
        }

        // Print all the values in the tree in sorted order
        inOrder(root);
        System.out.println();

        // Print the values in the tree that are between k1 and k2
        printRange(root, k1, k2);
    }
}

// This class is used to create nodes for the tree
class Node {
    int data; // This is the value of the node
    Node right; // This points to the right child of the node (larger values)
    Node left; // This points to the left child of the node (smaller values)

    // Constructor to create a new node with the given value
    Node(int data) {
        this.data = data;
        this.left = null; // Start with no left child
        this.right = null; // Start with no right child
    }
}

// This class is used to manage the Binary Search Tree (BST)
class BST {
    // Method to add a new value to the tree
    public static Node insert(Node root, int val) {
        // If the tree is empty, create a new node and make it the root
        if (root == null) {
            root = new Node(val);
            return root;
        }

        // If the value is smaller than the current node's value, add it to the left side
        if (root.data > val) {
            root.left = insert(root.left, val);
        }
        // If the value is greater than the current node's value, add it to the right side
        else if (root.data < val) {
            root.right = insert(root.right, val);
        }

        // Return the root of the tree
        return root;
    }
}
