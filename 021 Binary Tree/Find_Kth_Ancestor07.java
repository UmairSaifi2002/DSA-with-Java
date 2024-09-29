public class Find_Kth_Ancestor07 {

    public static int KAncestor(Node root, int n, int k){
        if (root == null) {
            return -1;
        }
        if (root.data == n) {
            return 0;
        }
        int leftDist = KAncestor(root.left, n, k);
        int rightDist = KAncestor(root.right, n, k);

        int max = (Math.max(leftDist, rightDist)+1);

        if (max == k) {
            System.out.println(root.data);
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree b = new BinaryTree();
        Node root = b.BuildBinaryTree(arr);
        int n = 5, k = 2;
        KAncestor(root, n, k);
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
    static int index  = -1;
    public static Node BuildBinaryTree(int arr[]){
        index++;
        if (arr[index] == -1) {
            return null;
        }
        Node newNode = new Node(arr[index]);
        newNode.left = BuildBinaryTree(arr);
        newNode.right = BuildBinaryTree(arr);
        return newNode;
    }
}