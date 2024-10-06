import java.util.*;

public class BSTtoBalancedBST07 {

    // This method gets the inorder traversal of the BST and stores it in an ArrayList
    public static void getInorder(Node root, ArrayList<Integer> arr) {
        if (root == null) {
            return;
        }
        getInorder(root.left, arr);
        arr.add(root.data);  // Corrected: Add the node's value to the array
        getInorder(root.right, arr);
    }

    // This method converts a sorted array to a balanced BST
    public static Node toBST(ArrayList<Integer> arr, int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = (start + end) / 2;
        Node root = new Node(arr.get(mid));
        root.left = toBST(arr, start, mid - 1);
        root.right = toBST(arr, mid + 1, end);
        return root;
    }

    // This method converts an unbalanced BST to a balanced BST
    public static Node BSTtoBalancedBST(Node root) {
        // Get inorder sequence of the BST
        ArrayList<Integer> inorder = new ArrayList<>();
        getInorder(root, inorder);
        // Convert the sorted inorder sequence to a balanced BST
        root = toBST(inorder, 0, inorder.size() - 1);
        return root;
    }

    // This method prints the inorder traversal of a BST
    public static void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(6);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3);
        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(12);

        root = BSTtoBalancedBST(root);
        inOrder(root);
    }
}

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
