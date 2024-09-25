import java.util.LinkedList;
import java.util.Queue;
public class Basics_of_BinaryTree01 {

    // Node class representing each node of the binary tree
    static class Node {
        int data;    // Value of the node
        Node left;   // Pointer to the left child
        Node right;  // Pointer to the right child

        // Constructor to initialize the node
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // BinaryTree class that contains methods to build and traverse the tree
    static class BinaryTree {
        static int index = -1; // Index used to track position in the array

        // Method to build the binary tree recursively
        public static Node BuildTree(int nodes[]) {
            index++;  // Move to the next element in the array

            // Base case: if the current value is -1, this is a null node
            if (nodes[index] == -1) {
                return null;
            }

            // Create a new node with the current value
            Node newNode = new Node(nodes[index]);

            // Recursively build the left and right subtrees
            newNode.left = BuildTree(nodes);
            newNode.right = BuildTree(nodes);

            // Return the created node (root of this subtree)
            return newNode;
        }
    }

    // Pre-order traversal: Root -> Left -> Right
    public static void preOrder(Node root) {
        if (root == null) {
            return;  // Base case: if the node is null, return
        }

        System.out.print(root.data + " "); // Print the current node
        preOrder(root.left);  // Recur on the left subtree
        preOrder(root.right); // Recur on the right subtree
    }

    // In-order traversal: Left -> Root -> Right
    public static void inOrder(Node root) {
        if (root == null) {
            return;  // Base case: if the node is null, return
        }

        inOrder(root.left);  // Recur on the left subtree
        System.out.print(root.data + " "); // Print the current node
        inOrder(root.right); // Recur on the right subtree
    }

    // Post-order traversal: Left -> Right -> Root
    public static void ppostOrder(Node root) {
        if (root == null) {
            return;  // Base case: if the node is null, return
        }

        ppostOrder(root.left);  // Recur on the left subtree
        ppostOrder(root.right); // Recur on the right subtree
        System.out.print(root.data + " "); // Print the current node
    }

    // Level-order traversal: Traverse each level of the tree
    public static void levelOrder(Node root) {
        if (root == null) {
            return;  // Base case: if the root is null, return
        }

        // Queue to store the nodes at each level
        Queue<Node> q = new LinkedList<>();
        q.add(root);  // Start with the root node
        q.add(null);  // Add a null marker to indicate end of the current level

        // Loop until the queue is empty
        while (!q.isEmpty()) {
            Node currNode = q.remove();  // Get the front node in the queue

            // If we encounter a null, we reached the end of a level
            if (currNode == null) {
                System.out.println();  // Move to the next line for new level
                if (q.isEmpty()) {
                    break;  // If queue is empty, all levels are printed
                } else {
                    q.add(null);  // Add another null to mark the end of next level
                }
            } else {
                // Print the current node's data
                System.out.print(currNode.data + " ");

                // If the current node has a left child, add it to the queue
                if (currNode.left != null) {
                    q.add(currNode.left);
                }

                // If the current node has a right child, add it to the queue
                if (currNode.right != null) {
                    q.add(currNode.right);
                }
            }
        }
    }

    public static int countOfNodes(Node root){
        if (root == null) {
            return 0;
        }
        int leftNodes = countOfNodes(root.left);
        int rightNodes = countOfNodes(root.right);
        return leftNodes+rightNodes+1;
    }

    public static int sumOfNodes(Node root){
        if (root == null) {
            return 0;
        }
        int leftNodesSum = sumOfNodes(root.left);
        int rightNodesSum = sumOfNodes(root.right);
        return leftNodesSum+rightNodesSum+root.data;
    }

    // Main method: Entry point of the program
    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        // Array representing the nodes of the tree. -1 means null node
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

        // Creating a BinaryTree object
        BinaryTree tree = new BinaryTree();

        // Building the binary tree using the nodes array
        Node root = tree.BuildTree(nodes);

        // Print the root node data to verify the tree is built correctly
        System.out.println(root.data);

        // Perform and print pre-order traversal
        preOrder(root);
        System.out.println();

        // Perform and print in-order traversal
        inOrder(root);
        System.out.println();

        // Perform and print post-order traversal
        ppostOrder(root);
        System.out.println();

        // Perform and print level-order traversal
        levelOrder(root);

        // Perform and print the count of Nodes
        int count = countOfNodes(root);
        System.out.println(count);

        // Perform and print the Sum of Nodes
        int sum = sumOfNodes(root);
        System.out.println(sum);
    }
}
