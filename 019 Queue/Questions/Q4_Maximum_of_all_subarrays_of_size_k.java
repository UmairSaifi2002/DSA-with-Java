import java.util.*;

public class Q4_Maximum_of_all_subarrays_of_size_k {

    // This method implements a brute-force approach to find the maximum of all subarrays of size 'k'
    public static void BruteForceApproach(int arr[], int k, int size) {
        // Initialize a deque (double-ended queue) to store the elements of the array
        Deque<Integer> q = new LinkedList<>();
        int j = 0;
        
        // Add all elements from the array into the deque
        while (j < size) {
            q.addLast(arr[j]);
            j++;
        }
        // Now 'q' contains all elements from the input array
        // e.g., for {1, 2, 3, 1, 4, 5, 2, 3, 6}, 'q' becomes [1, 2, 3, 1, 4, 5, 2, 3, 6]

        // Initialize a stack to temporarily hold elements during processing
        Stack<Integer> s = new Stack<>();
        
        // Continue the process until there are fewer than 'k' elements in the deque
        // As long as we have at least 'k' elements in the deque, we can form a subarray of size 'k'
        while (q.size() > k-1) {
            int i = 0;
            
            // Push the first 'k' elements from the deque into the stack
            // These represent a subarray of size 'k'
            while (!q.isEmpty() && i < k) {
                s.push(q.peek());  // Get the first element without removing it
                q.removeFirst();   // Remove the first element from the deque
                i++;
            }
            
            // Find the maximum element in the current subarray (stored in the stack)
            int max = Collections.max(s);
            System.out.print(max + ", ");  // Print the maximum value in the current subarray
            
            int l = 0;
            
            // Restore the first 'k-1' elements back to the front of the deque
            // We need these elements to form the next subarray
            while (!s.isEmpty()) {
                if (l < k - 1) {
                    q.addFirst(s.pop());  // Restore the element to the front of the deque
                    l++;
                } else {
                    s.pop();  // Pop the last element from the stack (it's no longer needed)
                }
            }
        }
        // After this process, the maximum of each subarray of size 'k' has been printed
    }

    public static void main(String[] args) {
        // Sample array and subarray size 'k'
        int arr[] = { 1, 2, 3, 1, 4, 5, 2, 3, 6 };
        int k = 3;  // Size of the subarray
        int size = arr.length;  // Size of the input array
        
        // Call the brute-force approach function to print the maximum of all subarrays of size 'k'
        BruteForceApproach(arr, k, size);
    }
}
