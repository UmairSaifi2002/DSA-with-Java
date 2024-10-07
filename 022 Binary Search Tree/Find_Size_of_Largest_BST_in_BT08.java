
public class Find_Size_of_Largest_BST_in_BT08 {

    public static int maxBST = 0;

    public static Info BSTsize(Node root) {
        // If there's no tree (no node), return information saying it is valid, size is 0,
        // minimum is as big as possible, and maximum is as small as possible.
        if (root == null) {
            return new Info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
        }
    
        // Get information about the left side of the tree
        Info leftInfo = BSTsize(root.left);
        // Get information about the right side of the tree
        Info rightInfo = BSTsize(root.right);
    
        // Check if both left and right sides are "okay" or valid BSTs
        boolean isvalid = leftInfo.isValid && rightInfo.isValid;
    
        // Calculate the size of the current tree by adding left size, right size, and 1 (for the root)
        int size = leftInfo.size + rightInfo.size + 1;
    
        // Find the smallest number in the whole tree so far
        int min = Math.min(root.data, Math.min(leftInfo.min, rightInfo.min));
        // Find the biggest number in the whole tree so far
        int max = Math.max(root.data, Math.max(leftInfo.max, rightInfo.max));
    
        // If the current node's value is not in the right spot for a BST, mark it as not valid
        if (root.data >= rightInfo.min || root.data <= leftInfo.max) {
            return new Info(false, size, min, max);  // Missed semicolon added here
        }
    
        // If the left and right sides are "okay", update the maximum size of the BST we found so far
        if (isvalid) {
            maxBST = Math.max(max, size);
            return new Info(true, maxBST, min, max);
        }
    
        // If it's not valid, return false with the current size, min, and max values
        return new Info(false, size, min, max);
    }
    
    public static boolean isValidBST(Node root, Node min, Node max) {
        // If there's no node (empty tree), it's okay, so return true
        if (root == null) {
            return true;
        }
    
        // If there's a "min" and the current node's value is less than or equal to it, return false
        if (min != null && min.data <= root.data) {
            return false;
        }
    
        // If there's a "max" and the current node's value is greater than or equal to it, return false
        if (max != null && max.data >= root.data) {
            return false;
        }
    
        // Check if the left side and right side are both "okay" or valid BSTs
        return isValidBST(root.left, min, root) && isValidBST(root.right, root, max);
    }
    
    public static void main(String[] args) {
        /*  This is a Binary Tree
                50
               /  \
              30   60
             / \   / \
            5  20 45  70
                      / \
                     65  80
        */
        Node root = new Node(50);
        root.left = new Node(30);
        root.left.left = new Node(5);
        root.left.right = new Node(20);

        root.right = new Node(60);
        root.right.left = new Node(45);
        root.right.right = new Node(70);
        root.right.right.left = new Node(65);
        root.right.right.right = new Node(80);
    }
}

class Node {
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class Info{
    Boolean isValid;
    int size;
    int min;
    int max;
    Info(Boolean isValid, int size, int min, int max){
        this.isValid = isValid;
        this.size = 0;
        this.min = Integer.MIN_VALUE;
        this.max = Integer.MAX_VALUE;
    }
}
