import java.util.ArrayList;

public class Lowest_Common_Ancestor05 {

    public static boolean getPath(Node root, int n, ArrayList<Node> path){
        if (root == null) {
            return false;
        }
        path.add(root);
        if (root.data == n) {
            return true;
        }
        boolean foundLeft = getPath(root.left, n, path);
        boolean foundRight = getPath(root.right, n, path);
        if (foundRight || foundLeft) {
            return true;
        }
        path.remove(path.size()-1);
        return false;
    }

    // Approch 1
    public static Node LCA(Node root, int n1, int n2){
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();
        getPath(root, n1, path1);
        getPath(root, n2, path2);
        int i=0;
        for (; i < path1.size() && i < path2.size(); i++) {
            if (path1.get(i) != path2.get(i)) {
                break;
            }
        }
        // last equal node
        Node lca = path1.get(i-1);
        return lca;
    }

    // Approach 2 :- Using Recurrsion
    public static Node LCA2(Node root, int n1, int n2){
        if (root == null || root.data == n1 || root.data == n2) {
            return root;
        }
        Node leftLCA = LCA2(root.left, n1, n2);
        Node rightLCA = LCA2(root.right, n1, n2);
        if (leftLCA == null) {
            return rightLCA;
        }
        if (rightLCA == null) {
            return leftLCA;
        }
        return root;
    }

    @SuppressWarnings("static-access")
    public static void main(String[] args){
        // start to build a binary tree
        int arr[] = {1,2,4,-1,-1,5,-1,-1,3,6,-1,-1,7,-1,-1};
        BinaryTree b = new BinaryTree();
        Node root = b.BuildTree(arr);

        int n1 = 4, n2 = 7;
        System.out.println(LCA(root,n1,n2).data);
        System.out.println(LCA2(root, n1, n2).data);
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
