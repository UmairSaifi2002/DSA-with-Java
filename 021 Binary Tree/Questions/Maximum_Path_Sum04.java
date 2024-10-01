public class Maximum_Path_Sum04 {

    public static int Sum(Node root){
        if (root == null) {
            return 0;
        }
        int leftSum = Sum(root.left);
        int rightSum = Sum(root.right);
        int total = leftSum+rightSum+root.data;
        return total;
    }


    public static int MaxSum(Node root){
        if (root == null) {
            return 0;
        }
        MaxSum(root.left);
        MaxSum(root.right);
        int left = Sum(root.left);
        int right = Sum(root.right);
        int total = Math.max(left + right + root.data, Math.max(left + root.data, Math.max(right + root.data, Math.max(left, right))));
        return total;
    }

    public static void main(String[] args) {
        //
        // int arr[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, 6, -1, -1, 7, -1, -1};
        // int arr[] = {4, 2 , -1, -1, 7, -1, -1};
        int arr[] = {-10, 9, -1, -1, 20, 15, -1, -1, 7, -1, -1};
        BinaryTree b = new BinaryTree();
        Node root = b.BuildTree(arr);
        System.out.println(MaxSum(root));
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

