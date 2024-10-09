public class Range_Sum_of_BST01 {

    public static int rangeSum(Node root, int start, int end){
        if (root == null) {
            return 0; // If the node is null, return 0
        }

        int sum = 0; // Initialize sum for this call

        // If the current node's value is within the range, add it to sum
        if (root.data <= end && root.data >= start) {
            sum += root.data;
            // System.out.println(sum);
        }

        // Recursively calculate the sum of nodes in the left and right subtrees
        sum += rangeSum(root.left, start, end);
        sum += rangeSum(root.right, start, end);

        return sum; // Return the accumulated sum
    }

    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(5);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right = new Node(11);
        root.right.right = new Node(20);
        int rangesum = rangeSum(root, 3, 6);
        System.out.println(rangesum);
    }
}

class Node{
    int data;
    Node left, right;
    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class BST{
    public static Node insert(Node root, int val){
        if (root == null) {
            return new Node(val);
        }

        if (root.data > val) {
            root.left = insert(root.left, val);
        }
        else if (root.data < val) {
            root.right = insert(root.right, val);
        }

        return root;
    }
}
