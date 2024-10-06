public class Mirror_Of_BST05 {

    public static void inOrder(Node root){
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    public static Node mirrorImage(Node root){
        if (root == null) {
            return null;
        }
        Node leftSubtree = mirrorImage(root.left);
        Node rightSubtree = mirrorImage(root.right);

        root.left = rightSubtree;
        root.right = leftSubtree;
        return root;
    }

    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        // Array of numbers we want to add to our tree
        int arr[] = {5, 1, 3, 4, 2, 7};
        Node root = null;
        BST b = new BST();
        for (int i = 0; i < arr.length; i++) {
            root = b.insert(root, arr[i]);
        }
        inOrder(root);
        System.out.println();
        mirrorImage(root);
        inOrder(root);
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
            return new Node(val);
        }
        if (root.data > val) {
            root.left = insert(root.left, val);
        }
        else if (root.data < val) {
            root.right = insert(root.right, val);
        }
        return root;
    }
}
