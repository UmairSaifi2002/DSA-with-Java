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
        // Time complexity: O(n), where n is the number of nodes in the tree.
    }

    // Pre-order traversal: Root -> Left -> Right
    public static void preOrder(Node root) {
        if (root == null) {
            return;  // Base case: if the node is null, return
        }

        System.out.print(root.data + " "); // Print the current node
        preOrder(root.left);  // Recur on the left subtree
        preOrder(root.right); // Recur on the right subtree
        // Time complexity: O(n), where n is the number of nodes in the tree.
    }

    // In-order traversal: Left -> Root -> Right
    public static void inOrder(Node root) {
        if (root == null) {
            return;  // Base case: if the node is null, return
        }

        inOrder(root.left);  // Recur on the left subtree
        System.out.print(root.data + " "); // Print the current node
        inOrder(root.right); // Recur on the right subtree
        // Time complexity: O(n), where n is the number of nodes in the tree.
    }

    // Post-order traversal: Left -> Right -> Root
    public static void ppostOrder(Node root) {
        if (root == null) {
            return;  // Base case: if the node is null, return
        }

        ppostOrder(root.left);  // Recur on the left subtree
        ppostOrder(root.right); // Recur on the right subtree
        System.out.print(root.data + " "); // Print the current node
        // Time complexity: O(n), where n is the number of nodes in the tree.
    }

    // Level-order traversal: Traverse each level of the tree
    public static void levelOrder(Node root) {
        if (root == null) {
            return;  // Base case: if the root is null, return
        }

        // Queue to store the nodes at each level
        Queue<Node> q = new LinkedList<>();
        q.add(root);  // Start with the root node
        q.add(null);  // Add a null marker to indicate the end of the current level

        // Loop until the queue is empty
        while (!q.isEmpty()) {
            Node currNode = q.remove();  // Get the front node in the queue

            // If we encounter a null, we reached the end of a level
            if (currNode == null) {
                System.out.println();  // Move to the next line for the new level
                if (q.isEmpty()) {
                    break;  // If queue is empty, all levels are printed
                } else {
                    q.add(null);  // Add another null to mark the end of the next level
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
        // Time complexity: O(n), where n is the number of nodes in the tree.
    }

    // Method to count the total number of nodes in the tree
    public static int countOfNodes(Node root){
        if (root == null) {
            return 0; // Base case: if the root is null, return 0
        }

        int leftNodes = countOfNodes(root.left);   // Count nodes in the left subtree
        int rightNodes = countOfNodes(root.right); // Count nodes in the right subtree

        return leftNodes + rightNodes + 1; // Total nodes = left + right + current
        // Time complexity: O(n), where n is the number of nodes in the tree.
    }

    // Method to calculate the sum of all nodes in the tree
    public static int sumOfNodes(Node root){
        if (root == null) {
            return 0;  // Base case: if the root is null, return 0
        }

        int leftNodesSum = sumOfNodes(root.left);   // Sum of nodes in the left subtree
        int rightNodesSum = sumOfNodes(root.right); // Sum of nodes in the right subtree

        return leftNodesSum + rightNodesSum + root.data; // Total sum = left + right + current node's data
        // Time complexity: O(n), where n is the number of nodes in the tree.
    }

    // Method to calculate the height of the binary tree
    public static int height(Node root){
        if (root == null) {
            return 0;  // Base case: if the root is null, height is 0
        }

        int leftHeight = height(root.left);   // Height of the left subtree
        int rightHeight = height(root.right); // Height of the right subtree

        // Return the maximum height of either subtree plus one (for the root)
        int max = Math.max(leftHeight, rightHeight) + 1;

        return max;
        // Time complexity: O(n), where n is the number of nodes in the tree.
    }

    // Method to calculate the diameter of the tree (O(n^2) solution)
    public static int Diameter01(Node root){ // O(n^2)
        // Base case: if the root is null, the diameter is 0
        if (root == null) {
            return 0;
        }

        // Case 1: Diameter is in the left subtree
        int d1 = Diameter01(root.left);

        // Case 2: Diameter is in the right subtree
        int d2 = Diameter01(root.right);

        // Case 3: Diameter passes through the root (height of left + height of right + 1)
        int d3 = height(root.left) + height(root.right) + 1;

        // Return the maximum diameter among the three cases
        int myDiameter = Math.max(d1, Math.max(d2, d3));

        return myDiameter;
        // Time complexity: O(n^2), where n is the number of nodes (height calculation is O(n) for each node).
    }

    // Helper class to store both height and diameter
    static class TreeInfo {
        int ht;    // Height of the tree
        int diam;  // Diameter of the tree

        // Constructor to initialize height and diameter
        TreeInfo(int ht, int diam){
            this.ht = ht;
            this.diam = diam;
        }
    }

    // Method to calculate the diameter using an optimized approach (O(n) solution)
    public static TreeInfo Diameter02(Node root){ // O(n)
        // Base case: if the root is null, return height and diameter as 0
        if (root == null) {
            return new TreeInfo(0, 0);
        }

        // Recursively find the height and diameter of the left and right subtrees
        TreeInfo left = Diameter02(root.left);
        TreeInfo right = Diameter02(root.right);

        // Calculate the height of the current node
        int myHeight = Math.max(left.ht, right.ht) + 1;

        // Calculate the diameter of the current node (similar to Diameter01)
        int d1 = left.diam;
        int d2 = right.diam;
        int d3 = left.ht + right.ht + 1;

        int myDiameter = Math.max(Math.max(d2, d3), d1);

        // Return a new TreeInfo object with the calculated height and diameter
        TreeInfo myInfo = new TreeInfo(myHeight, myDiameter);
        return myInfo;
        // Time complexity: O(n), where n is the number of nodes in the tree.
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

        // Perform and print the diameter
        int diameter = Diameter01(root);
        System.out.println(diameter);

        //
        TreeInfo diameter1 = Diameter02(root);
        System.out.println(diameter1.diam);
    }
}
