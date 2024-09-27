public class SubTree_of_another_tree02 {

    // Method to check if two trees are identical
    public static boolean isIdentical(Node root, Node subRoot) {
        // Base case: if both trees are empty, they are identical
        if (root == null && subRoot == null) {
            return true;
        }
        // If one is null and the other is not, or the values do not match, they are not identical
        else if (root == null || subRoot == null || root.data != subRoot.data) {
            return false;
        }
        // Recursively check if left and right subtrees are identical
        // if (!isIdentical(root.left, subRoot.left)) {
        //     return false;
        // }
        // if (!isIdentical(root.right, subRoot.right)) {
        //     return false;
        // }
        // return true;
        return isIdentical(root.left, subRoot.left) && isIdentical(root.right, subRoot.right);
    }

    // Method to check if one tree is a subtree of another
    public static boolean isSubtree(Node root, Node subRoot) {
        // Base case: if the main tree is empty, the subtree cannot exist in it
        if (root == null) {
            return false;
        }

        // If the current node matches the root of the subtree, check if the trees are identical
        if (root.data == subRoot.data) {
            if (isIdentical(root, subRoot)) {
                return true;
            }
        }

        // Recursively check in the left and right subtrees
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);                 
    }

    public static void main(String[] args) {
                // we are creating a trees
                /*  Main Tree
                            1
                           / \
                          2   3
                         /\  /\
                        4 5 6 7
                */
                /*
                           2
                          /\
                         4  5
                */
        // Create the main tree
        int arr1[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, 6, -1, -1, 7, -1, -1};
        BinaryTree b1 = new BinaryTree();
        // Reset the static index before building the tree
        BinaryTree.index = -1;
        Node node1 = b1.BuildTree(arr1);

        // // Create the subtree
        int arr2[] = {2, 4, -1, -1, -1};
        // Create the subtree
        // int arr2[] = {2, 4, -1, -1, 5, -1, -1};
        BinaryTree b2 = new BinaryTree();
        // Reset the static index again before building the subtree
        BinaryTree.index = -1;
        Node node2 = b2.BuildTree(arr2);

        // Check if the second tree is a subtree of the first
        boolean result = isSubtree(node1, node2);
        System.out.println(result);  // Output: true if node2 is a subtree of node1
    }
}

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class BinaryTree {
    static int index = -1;

    // Method to build the tree from an array representation
    public Node BuildTree(int arr[]) {
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
