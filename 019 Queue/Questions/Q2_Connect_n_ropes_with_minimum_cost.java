import java.util.*;

public class Q2_Connect_n_ropes_with_minimum_cost {

    public static int connectRopes(int[] arr) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int totalCost = 0;

        // Enqueue rope lengths
        for (int length : arr) {
            pq.add(length);
        }

        // Connect ropes
        while (pq.size() > 1) {
            // Dequeue two shortest ropes
            int rope1 = pq.poll();
            int rope2 = pq.poll();

            // Calculate connection cost
            int connectionCost = rope1 + rope2;

            // Add connection cost to total cost
            totalCost += connectionCost;

            // Enqueue new rope length
            pq.add(connectionCost);
            System.out.println(pq);
        }

        return totalCost;
    }


    public static void main(String[] args) {
        int arr[] = {4,3,2,6};
        System.out.println(connectRopes(arr));
    }
}
