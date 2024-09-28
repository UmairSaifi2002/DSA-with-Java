import java.util.*;
import java.util.Queue;
import java.util.LinkedList;

public class Top_View_of_a_Tree03 {

    public static void TopView(Node root){
        // Level Order Traversal
        Queue<Info> q = new LinkedList<>();
        // we want to create a map for storing the data when we traverse horizontally
        HashMap<Integer, Node> map = new HashMap<>();   
        int min = 0, max = 0;
        // now we storing the root node in queue
        q.add(new Info(root, 0));
        q.add(null);

        while (!q.isEmpty()) {
            Info curr = q.remove();
            if (curr == null) {
                if (q.isEmpty()) {
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                if (!map.containsKey(curr.horizontal_diatancce)) {
                    map.put(curr.horizontal_diatancce, curr.node);
                }
                if (curr.node.left != null) {
                    q.add(new Info(curr.node.left, curr.horizontal_diatancce-1));
                    min = Math.min(min, curr.horizontal_diatancce-1);
                }
                if (curr.node.right != null) {
                    q.add(new Info(curr.node.right, curr.horizontal_diatancce+1));
                    max = Math.max(max, curr.horizontal_diatancce+1);
                }
            }
        }
        for (int i = min; i <= max; i++) {
            System.out.print(map.get(i).data+" ");
        }
    }

    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        int arr[] = {1,2,4,-1,-1,5,-1,-1,3,6,-1,-1,7,-1,-1};
        BinaryTree b = new BinaryTree();
        Node root = b.BuildTree(arr);

        TopView(root);
    }
}

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        this.right = null;
        this.left = null;
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

class Info{
    Node node;
    int horizontal_diatancce;
    Info(Node node, int horizontal_diatancce){
        this.node = node;
        this.horizontal_diatancce = horizontal_diatancce;
    }
}

// output 
// 4 2 1 3 7