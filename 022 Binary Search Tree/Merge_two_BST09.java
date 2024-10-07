import java.util.*;

public class Merge_two_BST09 {

    public static void BSTtoArray(Node root, ArrayList<Integer> arr){
        if (root == null) {
            return;
        }
        BSTtoArray(root.left, arr);
        arr.add(root.data);
        BSTtoArray(root.right, arr);
    }

    public static Node createBST(ArrayList<Integer> arr, int s, int e){
        if (s > e) {
            return null;
        }
        int mid = (s+e)/2;
        Node root = new Node(arr.get(mid));
        root.left = createBST(arr, s, mid-1);
        root.right = createBST(arr, mid+1, e);
        return root;
    }

    @SuppressWarnings("static-access")
    public static Node mergeBST(Node root1, Node root2){
        Node newRoot = null;
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();

        // first convert BST's to sorted array's
        BSTtoArray(root1, arr1);
        BSTtoArray(root2, arr2);

        // now merge two array as a single
        ArrayList<Integer> arr = new ArrayList<>();

        // now sort the array
        // Collections.sort(arr); // by built in function
        int i=0,j=0;
        while (i<arr1.size() && j<arr2.size()) {
            if (arr1.get(i) <= arr2.get(j)) {
                arr.add(arr1.get(i));
                i++;
            }
            else{
                arr.add(arr2.get(j));
                j++;
            }
        }
        while (i<arr1.size()) {
            arr.add(arr1.get(i));
            i++;
        }
        while (j<arr2.size()) {
            arr.add(arr2.get(j));
            j++;
        }

        newRoot = createBST(arr, 0, arr.size()-1);
        return newRoot;
    }
    
    public static void inorder(Node root){
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.err.print(root.data+" ");
        inorder(root.right);
    }

    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        int arr1[] = {1,2,4};
        int arr2[] = {3, 9, 12};
        BST b1 = new BST();
        BST b2 = new BST();
        Node root1 = null;
        Node root2 = null;
        for (int i = 0; i < arr1.length; i++)  root1 = b1.insert(root1, arr1[i]);
        for (int i = 0; i < arr2.length; i++)  root2 = b2.insert(root2, arr2[i]);
        Node root = mergeBST(root1, root2);
        inorder(root);
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
