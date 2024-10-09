//Here's the code with comments that a 5-year-old can understand:
// This is a special program to find the closest friend (number) to a given number in a tree.

public class Find_the_Closest_Element_of_K_in_BST02 {

    // This is a helper function to find the closest friend.
    public static int closestElement(Node root, int k, int diff, int closest) {
        // If we've reached the end of the tree, stop looking.
        if (root == null) {
            return closest;
        }

        // Calculate how far away this friend is from our target number.
        int currentDiff = Math.abs(root.data - k);

        // If this friend is closer than the previous closest friend, remember them!
        if (currentDiff < diff) {
            closest = root.data; 
        }

        // If our target number is smaller than this friend's number, 
        // look for friends on the left side of the tree.
        if (k < root.data) {
            closest = closestElement(root.left, k, currentDiff, closest);
        } 
        // If our target number is bigger than this friend's number, 
        // look for friends on the right side of the tree.
        else {
            closest = closestElement(root.right, k, currentDiff, closest);
        }

        // Return the closest friend we found.
        return closest;
    }

    // This is the main part of the program.
    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        // Create a special tree called a Binary Search Tree (BST).
        BST b = new BST();

        // Start with an empty tree.
        Node root = null;

        // Add some friends (numbers) to the tree.
        int arr[] = {8, 5, 3, 6, 11, 20};
        for (int i = 0; i < arr.length; i++) {
            root = b.insert(root, arr[i]);
        }

        // Find the closest friend to the number 19.
        System.out.println(closestElement(root, 19, Integer.MAX_VALUE, Integer.MAX_VALUE));
    }
}

// This is a special class to represent each friend (node) in the tree.
class Node {
    int data; // This is the friend's number.
    Node left, right; // These are the friend's left and right neighbors.

    // Create a new friend with a given number.
    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

// This is a special class to help create and manage the tree.
class BST {
    // Add a new friend to the tree.
    public static Node insert(Node root, int val) {
        // If the tree is empty, create a new friend.
        if (root == null) {
            return new Node(val);
        }

        // If the new friend's number is smaller, add them to the left side.
        if (root.data > val) {
            root.left = insert(root.left, val);
        } 
        // If the new friend's number is bigger, add them to the right side.
        else if (root.data < val) {
            root.right = insert(root.right, val);
        }

        // Return the updated tree.
        return root;
    }
}
