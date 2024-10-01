public class Delete_Leaf_Node_having_X_value03 {

    public static void deleteLeafNodes(Node root, int data) {
        if (root == null) {
            return;
        }
        // Traverse left and right subtrees first
        deleteLeafNodes(root.left, data);
        deleteLeafNodes(root.right, data);
    
        // Check and delete left leaf
        if (root.left != null && root.left.left == null && root.left.right == null && root.left.data == data) {
            root.left = null;
        }
    
        // Check and delete right leaf
        if (root.right != null && root.right.left == null && root.right.right == null && root.right.data == data) {
            root.right = null;
        }
    }
    

    public static void preOrder(Node root){
        if (root == null) {
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String[] args) {
         // Array representing the nodes of the tree. -1 means null node
         int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, 6, -1, -1, 7, -1, -1};

         // Creating a BinaryTree object
         BinaryTree tree = new BinaryTree();
 
         // Building the binary tree using the nodes array
         Node root = tree.BuildTree(nodes);
         preOrder(root);
         deleteLeafNodes(root, 7);
         System.out.println();
         preOrder(root);
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
        if (arr[index ]== -1) {
            return null;
        }
        Node newNode = new Node(arr[index]);
        newNode.left = BuildTree(arr);
        newNode.right = BuildTree(arr);
        return newNode;
    }
}
