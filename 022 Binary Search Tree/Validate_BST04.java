public class Validate_BST04 {

    public static void inOrder(Node root){
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.err.print(root.data+" ");
        inOrder(root.right);
    }

    public static boolean isValidate(Node root, Node min, Node max) {
        // If we reach an empty spot (no node), it means everything is okay so far, return true
        if (root == null) {
            return true;
        }
    
        // If there is a "min" value and the current node's value is less than or equal to it, return false
        if (min != null && root.data <= min.data) {
            return false;
        }
    
        // If there is a "max" value and the current node's value is greater than or equal to it, return false
        if (max != null && root.data >= max.data) {
            return false;
        }
    
        // Check both sides: 
        // - For the left side, the current node becomes the new "max" (must be smaller than this).
        // - For the right side, the current node becomes the new "min" (must be bigger than this).
        return isValidate(root.left, min, root) && isValidate(root.right, root, max);
    }
    
    

    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        int arr[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};
        // int arr[] = {1,1,1};
        Node root = null;
        BST b = new BST();
        for (int i = 0; i < arr.length; i++) {
            root = b.insert(root, arr[i]);
        }
        inOrder(root); // till now we created a BST which is always be a valid tree
        root.left.left.data = 40; // now manipulate this
        System.out.println();
        inOrder(root);
        System.out.println();
        System.out.println(isValidate(root,null,null));
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

class BST{
    public static Node insert(Node root, int val){
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (root.data > val) {
            root.left = insert(root.left, val);
        }
        if (root.data < val) {
            root.right = insert(root.right, val);
        }
        return root;
    }
}
