import java.util.Queue;
import java.util.LinkedList;

public class Interleave_of_Two_half_Queue07 {

    public static void InterLeave(Queue<Integer> q, int size) {
        // Create a temporary queue to store the first half of elements.
        Queue<Integer> first = new LinkedList<>();
        
        // Divide the queue into two halves and store the first half in 'first'.
        for (int i = 0; i < size / 2; i++) {
            // Remove elements from the original queue and add them to 'first'.
            first.add(q.remove());
        }
        
        // Interleave the elements of 'first' with the remaining elements in 'q'.
        while (!first.isEmpty()) {
            // Add the front element of 'first' to the end of 'q'.
            q.add(first.peek());
            
            // Remove the front element from 'q' and add it back to the end.
            int element = q.remove();
            q.add(element);
            
            // Remove the front element from 'first' (now processed).
            first.remove();
        }
        
        // Print the interleaved queue.
        System.out.println(q);
    }
    

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        int size = q.size();
        InterLeave(q, size);
    }
}
