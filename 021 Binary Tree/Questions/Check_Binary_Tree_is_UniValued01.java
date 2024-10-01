import java.util.*;

public class Check_Binary_Tree_is_UniValued01 {

    public static boolean isTrue(ArrayList<Integer> array){
        for (int i = 0; i < array.size(); i++) {
            for (int j = i+1; j < array.size(); j++) {
                if (array.get(i) == array.get(j)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void isUniValued(Node root, ArrayList<Integer> array){
        // storing the value in queue
        if (root == null) {
            return;
        }
        array.add(root.data);
        isUniValued(root.left, array);
        isUniValued(root.right, array);
    }

    public static void preOrder(Node root){
        if (root == null) {
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static int countNodes(Node root, int count){
        if (root == null) {
            return 0;
        }
        int leftCount = countNodes(root.left, count);
        int righCount = countNodes(root.right, count);
        count = leftCount + righCount + 1;
        return count;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 4, -1, -1, 3, -1, -1, 3, 6, -1, -1, 7, -1, -1};
        BinaryTree b = new BinaryTree();
        Node root = b.BuildTree(arr);
        preOrder(root);
        System.out.println();
        System.out.println(countNodes(root, 0));
        ArrayList<Integer> array = new ArrayList<>();
        isUniValued(root, array);
        System.out.println(array);
        System.out.println(isTrue(array));
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
