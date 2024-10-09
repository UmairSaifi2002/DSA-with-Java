public class Basics_0f_AVL_Tree {

    public static Node root;

    public static int height(Node root){
        if (root == null) {
            return 0;
        }
        return root.height;
    }

    public static int getBalance(Node root){
        if (root == null) {
            return 0;
        }
        return height(root.left)-height(root.right);
    }

    //Right rotate
    public static Node rightRotate(Node y){
        Node x = y.left;
        Node T2 = x.right;

        //Rotation using 3 Nodes
        x.right = y;
        y.left = T2;

        //Update Height
        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        // x is a new root
        return x;
    }

    //Left rotate
    public static Node leftRotate(Node x){
        Node y = x.right;
        Node T2 = y.left;

        // Rotate the Node
        y.left = x;
        x.right = T2;

        // update the heights
        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        // y is a new root
        return y;
    }

    public static Node insert(Node root, int key){
        if (root == null) {
            return new Node(key);
        }

        if (key < root.data) {
            root.left = insert(root.left, key);
        }
        else if (key > root.data) {
            root.right = insert(root.right, key);
        }
        else return root;

        //update height
        root.height = Math.max(height(root.left), height(root.right)) + 1;

        // get Balanced Factor
        int BalancedFactor = getBalance(root);

        // Left Left Case
        if (BalancedFactor > 1 && root.left.data > key) {
            return rightRotate(root);
        }

        // Right Right Case
        if (BalancedFactor < -1 && root.right.data < key ) {
            return leftRotate(root);
        }

        // Left Right Case
        if (BalancedFactor > 1 && root.left.data < key) {
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }

        // Right Left Case
        if (BalancedFactor < -1 && root.right.data > key) {
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }

        return root;
    }

    public static void preOrder(Node root){
        if (root == null) {
            return;
        }
        System.out.println(root.data);
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String[] args) {
        root = insert(root, 10);
        root = insert(root, 20);
        root = insert(root, 30);
        root = insert(root, 40);
        root = insert(root, 50);
        root = insert(root, 25);

        preOrder(root);
    }    
    
}


class Node{
    int data, height;
    Node left, right;
    Node(int data){
        this.data = data;
        this.height = 1;
        this.left = null;
        this.right = null;
    }
}