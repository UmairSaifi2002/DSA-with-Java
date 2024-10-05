import java.util.*;
import java.util.Queue;
import java.util.LinkedList;

public class Top_View_of_a_Tree03 {

    public static void TopView(Node root) {
        // Level Order Traversal using a Queue
        Queue<Info> q = new LinkedList<>(); // Queue to perform level order traversal, holding nodes and their horizontal distances
        // HashMap to store nodes appearing first at each horizontal distance
        HashMap<Integer, Node> map = new HashMap<>();
        int min = 0, max = 0; // Track minimum and maximum horizontal distances for later use
    
        // Add the root node to the queue with a horizontal distance of 0
        q.add(new Info(root, 0));
        // Adding a null to the queue to mark the end of each level
        q.add(null);
    
        // Traverse the tree until the queue is empty
        while (!q.isEmpty()) {
            // Remove the front element from the queue
            Info curr = q.remove();
    
            if (curr == null) {
                // If the current element is null, it means we have reached the end of a level
                if (q.isEmpty()) {
                    // If the queue is empty after removing the null, traversal is complete, break the loop
                    break;
                } else {
                    // If the queue still has elements, add another null to mark the end of the next level
                    q.add(null);
                }
            } else {
                // If the current horizontal distance is not in the map, add the node to the map
                // This ensures we only store the first node seen at each horizontal distance
                if (!map.containsKey(curr.horizontal_diatancce)) {
                    map.put(curr.horizontal_diatancce, curr.node);
                }
                // If the current node has a left child, add it to the queue with its horizontal distance (current - 1)
                if (curr.node.left != null) {
                    q.add(new Info(curr.node.left, curr.horizontal_diatancce - 1));
                    // Update minimum horizontal distance
                    min = Math.min(min, curr.horizontal_diatancce - 1);
                }
                // If the current node has a right child, add it to the queue with its horizontal distance (current + 1)
                if (curr.node.right != null) {
                    q.add(new Info(curr.node.right, curr.horizontal_diatancce + 1));
                    // Update maximum horizontal distance
                    max = Math.max(max, curr.horizontal_diatancce + 1);
                }
            }
        }
    
        // Print the top view of the binary tree by iterating from min to max horizontal distance
        for (int i = min; i <= max; i++) {
            System.out.print(map.get(i).data + " ");
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