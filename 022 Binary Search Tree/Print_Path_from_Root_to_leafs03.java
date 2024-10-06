import java.util.*;
public class Print_Path_from_Root_to_leafs03 {

    public static void printPaths(Node root, ArrayList<Integer> arr){
        // start returning if the root find as null
        if (root == null) {
            return;
        }
        arr.add(root.data);
        if (root.left == null && root.right == null) {
            for (int i = 0; i < arr.size(); i++) {
                System.out.print(arr.get(i)+" ");
            }
            System.out.println();
        }
        printPaths(root.left, arr);
        printPaths(root.right, arr);
        arr.remove(arr.size()-1);
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

    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        // Array of numbers we want to add to our tree
        int arr[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};
        Node root = null;
        BST b = new BST();
        for (int i = 0; i < arr.length; i++) {
            root = b.insert(root, arr[i]);
        }
        printPaths(root, new ArrayList<Integer>());
        // inOrder(root);
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
