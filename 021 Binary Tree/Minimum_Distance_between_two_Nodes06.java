public class Minimum_Distance_between_two_Nodes06 {

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

    public static int lcaDistance(Node root, int n){
        if (root == null) {
            return -1;
        }
        if (root.data == n) {
            return 0;
        }
        int leftDistance = lcaDistance(root.left, n);
        int rightDistance = lcaDistance(root.right, n);
        if (leftDistance == -1 && rightDistance == -1) {
            return -1;
        }
        else if(leftDistance == -1){
            return rightDistance+1;
        }
        else return leftDistance+1;
    }

    public static int minDistance(Node root, int n1, int n2){
        Node lca = LCA2(root, n1, n2);
        int left_distance = lcaDistance(lca, n1);
        int right_distance = lcaDistance(lca, n2);
        return left_distance + right_distance;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,4,-1,-1,5,-1,-1,3,6,-1,-1,7,-1,-1};
        BinaryTree b = new BinaryTree();
        Node root = b.BuildTree(arr);

        int n1 = 4, n2 = 6;
        int distance = minDistance(root, n1, n2);
        System.out.println(distance);
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
