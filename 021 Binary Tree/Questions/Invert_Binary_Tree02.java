import java.util.*;
public class Invert_Binary_Tree02 {

    public static void preOrder(Node root,Deque<Integer> q){
        if (root == null) {
            return;
        }
        // System.out.print(root.data+" ");
        q.addFirst(root.data);
        preOrder(root.left,q);
        preOrder(root.right,q);
    }

    // traverse the tree level-wise in recursive manner
    public static void levelOrder(Node root, int level, int height){
        if (root == null) {
            return;
        }
        if (level == height) {
            System.out.print(root.data+" ");
        }
        levelOrder(root.left, level+1, height);
        levelOrder(root.right, level+1, height);
    }

    public static int height(Node root, int height){
        if (root == null) {
            return 0;
        }
        int leftHeight = height(root.left, height);
        int rightHeight = height(root.right, height);
        int max = Math.max(leftHeight,rightHeight)+1;
        return max;
    }

    public static void inverseTree(Node root){
        if (root == null) {
            return;
        }
        if (root.left != null && root.right != null) {
            // invert kr do
            int leftNodeData = root.left.data,rightNodeData = root.right.data;
            root.left.data = rightNodeData;
            root.right.data = leftNodeData;
        }
        else if (root.left == null && root.right != null) {
            // make right node to left node
            int leftNodeData = root.left.data;
            root.left = null;
            root.right = new Node(leftNodeData);
        }
        else if (root.right == null && root.left != null) {
            // make left node to right node
            int rightNodeData = root.right.data;
            root.right = null;
            root.left = new Node(rightNodeData);
        }
        inverseTree(root.left);
        inverseTree(root.right);
        /* original
            1 
           2 3
         4 5 6 7
         inverted
            1
           3 2
         5 4 7 6
        */
    }

    public static void inverseBinaryTree(Node root, Deque<Integer> q){
        if (root == null) {
            return;
        }
        inverseBinaryTree(root.left, q);
        inverseBinaryTree(root.right, q);
        if (root != null) {
            int data = q.removeFirst();
            root.data = data;
        }
    }

    public static void main(String[] args) {
        //
        int arr[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, 6, -1, -1, 7, -1, -1};
        BinaryTree b = new BinaryTree();
        Node root = b.BuildTree(arr);
        Deque<Integer> q = new LinkedList<>();
        int height = height(root, 0);
        
        // for (int i = 1; i <= height; i++) {
        //     levelOrder(root, 1, i);
        //     System.out.println();
        // }

        // inverseTree(root);

        for (int i = 1; i <= height; i++) {
            levelOrder(root, 1, i);
            System.out.println();
        }

        preOrder(root,q);
        System.out.println(q);
        inverseBinaryTree(root, q);

        for (int i = 1; i <= height; i++) {
            levelOrder(root, 1, i);
            System.out.println();
        }
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

