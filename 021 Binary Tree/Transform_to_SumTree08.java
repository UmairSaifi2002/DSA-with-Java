public class Transform_to_SumTree08 {

    public static int toSumTree(Node root){
        // Base Case
        if (root == null) {
            return 0;
        }
        // our recursive call
        int leftSum = toSumTree(root.left);
        int rightSum = toSumTree(root.right);
        int data = root.data;
        int newLeft = root.left == null ? 0 : root.left.data;
        int newRight = root.right == null ? 0 : root.right.data;
        root.data = newLeft + leftSum + newRight + rightSum;
        return data;
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

    public static void main(String[] args) {
        int arr[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, 6, -1, -1, 7, -1, -1};
        BinaryTree b = new BinaryTree();
        Node root = b.BuildTree(arr);
        int height = height(root, 0);
        
        for (int i = 1; i <= height; i++) {
            levelOrder(root, 1, i);
            System.out.println();
        }
        toSumTree(root);
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
