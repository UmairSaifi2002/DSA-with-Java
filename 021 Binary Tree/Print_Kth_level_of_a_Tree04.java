import java.util.LinkedList;
import java.util.Queue;
public class Print_Kth_level_of_a_Tree04 {

    // Level-order traversal: Traverse each level of the tree
    // iterative method
    public static void levelOrder(Node root, int k) {
        if (root == null) {
            return;  // Base case: if the root is null, return
        }

        // Queue to store the nodes at each level
        Queue<Node> q = new LinkedList<>();
        q.add(root);  // Start with the root node
        q.add(null);  // Add a null marker to indicate the end of the current level

        // iterator for level
        int level = 1;

        // Loop until the queue is empty
        while (!q.isEmpty() && level<=k) {
            Node currNode = q.remove();  // Get the front node in the queue

            // If we encounter a null, we reached the end of a level
            if (currNode == null) {
                level++;
                // System.out.println();  // Move to the next line for the new level
                if (q.isEmpty()) {
                    break;  // If queue is empty, all levels are printed
                } else {
                    q.add(null);  // Add another null to mark the end of the next level
                }
            } else {
                // Print the current node's data
                if (level == k) {
                    System.out.print(currNode.data + " ");
                }

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

    // Level-Order Traversing: Travel each level of the Tree
    // using Recursion
    public static void levelOrderRecursion(Node root, int level, int k){
        // Base Case :- When root is reached to the end
        if (root == null) {
            return;
        }
        // if level is reached 
        if (level == k) {
            System.out.print(root.data+" ");
        }
        // call recursion function
        levelOrderRecursion(root.left, level+1, k); // left nodes
        levelOrderRecursion(root.right, level+1, k); // right nodes
    }

    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        int arr[] = {1,2,4,-1,-1,5,-1,-1,3,6,-1,-1,7,-1,-1};
        BinaryTree b = new BinaryTree();
        Node root = b.BuildTree(arr);
        levelOrder(root, 3);
        System.out.println();
        levelOrderRecursion(root, 1, 3);
    }
}

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class BinaryTree{
    static int index = -1;
    public static Node BuildTree(int arr[]){
        
        index++;

        if (arr[index] == -1) {
            return null;
        }

        Node newNode = new Node(arr[index]);
        newNode.left = BuildTree(arr);
        newNode.right = BuildTree(arr);

        return newNode;
    }
}