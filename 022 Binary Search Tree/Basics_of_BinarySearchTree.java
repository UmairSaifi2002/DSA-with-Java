public class Basics_of_BinarySearchTree {

    // This method is used to print the values of the tree in a sorted order
    public static void inOrderTraverse(Node root) { // O(n)
        // If the current node is empty (null), then stop and go back
        if (root == null) {
            return;
        }

        // First, go to the left side of the current node
        inOrderTraverse(root.left);

        // Print the value of the current node
        System.out.print(root.data + " ");

        // Then, go to the right side of the current node
        inOrderTraverse(root.right);
    }

    public static boolean search(Node root, int key) { // O(H) H-> Height of the Tree
        // If the current node is empty (null), the key is not found
        if (root == null) {
            return false;
        }
    
        // If the current node's value is equal to the key, we've found it
        if (root.data == key) {
            return true;
        }
    
        // If the key is smaller than the current node's value, search in the left side
        if (root.data > key) {
            return search(root.left, key);
        } else {
            // Otherwise, search in the right side
            return search(root.right, key);
        }
    }
    

    // Main method, where our program starts
    @SuppressWarnings("static-access")
    public static void main(String[] args) { // Toatal Time Complexity O(n^2)
        // Array of numbers we want to add to our tree
        int arr[] = {5, 1, 3, 4, 2, 7};

        // Start with an empty tree (root is null)
        Node root = null;

        // Create a new Binary Search Tree object
        BST b = new BST();

        // Loop through each number in our array
        /*
            Loop in main method for inserting elements:
                Average Case: O(n * log n)
                Worst Case: O(n^2)
        */
        for (int i = 0; i < arr.length; i++) {
            // Add each number to the tree
            root = b.insert(root, arr[i]);
        }

        // Print the numbers of the tree in sorted order
        inOrderTraverse(root);
        System.out.println();

        if (search(root, 8)) {
            System.out.println("Found.");
        }else{
            System.out.println("Not Found.");
        }
    }
}

// This class is used to create nodes for the tree
class Node {
    int data; // This is the value of the node
    Node left; // This points to the left child of the node
    Node right; // This points to the right child of the node

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
    /*
     insert method:
        Average Case: O(log n)
        Worst Case: O(n)
    */
    public static Node insert(Node root, int val) {
        // If the tree is empty, create a new node and make it the root
        if (root == null) {
            root = new Node(val);
            return root;
        }

        // If the value is smaller than the current node's value, go to the left side
        if (root.data > val) {
            root.left = insert(root.left, val);
        }

        // If the value is larger than the current node's value, go to the right side
        if (root.data < val) {
            root.right = insert(root.right, val);
        }

        // Return the root of the tree
        return root;
    }
}
