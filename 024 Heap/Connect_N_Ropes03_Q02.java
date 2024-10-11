import java.util.PriorityQueue;

public class Connect_N_Ropes03_Q02 {
    public static void main(String[] args) {
        // Question Description 
        // Given are N ropes of different lengths, the task is to connect these ropes
        // into one rope with minimum cost,
        // such that the "Cost to Connect two ropes is equal to the Sum of their Length"
        int ropes[] = {4, 3, 2, 6};
        PriorityQueue<Integer> p = new PriorityQueue<>();
        for (int i = 0; i < ropes.length; i++) {
            p.add(ropes[i]);
        }
        int newCost = 0;
        while (p.size() > 1) {
            int minOne = p.remove();
            int minTwo = p.remove();
            newCost += minOne + minTwo;
            p.add(minOne+minTwo);
        }
        System.out.println(newCost);
    }
}
