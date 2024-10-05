public class Deleting_Node_in_BST01 {

    // This method is used to print the values of the tree in sorted order
    public static void inOrder(Node root) {
        // If the current node is empty, do nothing and return
        if (root == null) {
            return;
        }

        // First, print everything in the left side of the current node
        inOrder(root.left);

        // Then, print the value of the current node
        System.out.print(root.data + " ");

        // Finally, print everything in the right side of the current node
        inOrder(root.right);
    }

    // This method is used to find if a value is present in the tree
    public static boolean search(Node root, int val) {
        // If the current node is empty, we did not find the value
        if (root == null) {
            return false;
        }

        // If the current node's value is equal to the value we're looking for, we found it
        if (root.data == val) {
            return true;
        }

        // If the value is smaller, search on the left side of the tree
        if (root.data > val) {
            return search(root.left, val);
        } else {
            // Otherwise, search on the right side of the tree
            return search(root.right, val);
        }
    }

    // This method is used to delete a value from the tree
    public static Node deleteNode(Node root, int val) {
        // If the value is smaller than the current node, go to the left side to delete it
        if (root.data > val) {
            root.left = deleteNode(root.left, val);
        }
        // If the value is greater, go to the right side to delete it
        else if (root.data < val) {
            root.right = deleteNode(root.right, val);
        } 
        // If the value is equal, we have found the node we want to delete
        else {
            // Case 1: Node has no children (leaf node)
            if (root.right == null && root.left == null) {
                return null; // Delete the node by making it null
            }

            // Case 2: Node has only one child
            if (root.left == null) {
                return root.right; // Replace the node with its right child
            } else if (root.right == null) {
                return root.left; // Replace the node with its left child
            }

            // Case 3: Node has two children
            // Find the smallest value in the right subtree (in-order successor)
            Node inOrderSuccessor = findInOrderSuccesor(root.right, val);
            // Replace the current node's value with the in-order successor's value
            root.data = inOrderSuccessor.data;
            // Delete the in-order successor from the right subtree
            root.right = deleteNode(root.right, inOrderSuccessor.data);
        }

        // Return the updated root
        return root;
    }

    // This method is used to find the in-order successor, which is the smallest value in the right subtree
    private static Node findInOrderSuccesor(Node root, int val) {
        // Keep going left until there are no more left nodes
        while (root.left != null) {
            root = root.left;
        }
        // Return the node that has the smallest value
        return root;
    }

    // Main method, where our program starts
    public static void main(String[] args) {
        // Array of numbers we want to add to our tree
        int arr[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};

        // Start with an empty tree (root is null)
        Node root = null;

        // Create a new Binary Search Tree object
        BST b = new BST();

        // Loop through each number in our array to add it to the tree
        for (int i = 0; i < arr.length; i++) {
            root = b.insert(root, arr[i]);
        }

        // Print the tree values in sorted order before deleting a node
        inOrder(root);
        System.out.println();

        // Delete the node with value 10 from the tree
        deleteNode(root, 10);

        // Print the tree values in sorted order after deleting a node
        inOrder(root);
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

        // If the value is greater than the current node's value, go to the right side
        else if (root.data < val) {
            root.right = insert(root.right, val);
        }

        // Return the root of the tree
        return root;
    }
}
