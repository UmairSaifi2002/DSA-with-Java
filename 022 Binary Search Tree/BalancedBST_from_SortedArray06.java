public class BalancedBST_from_SortedArray06 {

    public static Node arrayToBST(int arr[], int start, int end){
        if (start > end) {
            return null;
        }
        int mid = (start+end)/2;
        Node root = new Node(arr[mid]);
        root.left = arrayToBST(arr, start, mid-1);
        root.right = arrayToBST(arr, mid+1, end); 
        return root;
    }

    public static void inOrder(Node root){
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    public static void main(String[] args) {
        int arr[] = {3, 5, 6, 8, 10, 11, 12};
        int len = arr.length;
        Node root = arrayToBST(arr, 0, len-1);
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


