import java.util.Comparator;
import java.util.PriorityQueue;

public class Priority_Queue01 {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // it arranges the element in the ascending order
        PriorityQueue<Integer> p = new PriorityQueue<>(Comparator.reverseOrder()); // it arranges the element in the descending order

        pq.add(3);//O(logn)
        pq.add(4);
        pq.add(1);
        pq.add(6);
        pq.add(9);
        
        while (!pq.isEmpty()) {
            System.out.print(pq.peek()+" ");//O(1)
            pq.remove();//O(logn)
        }
        // System.out.println("hii");

        p.add(3);
        p.add(1);
        p.add(5);
        p.add(8);
        p.add(4);
        p.add(10);
        System.out.println();

        while (!p.isEmpty()) {
            System.out.print(p.peek()+" ");
            p.remove();
        }
    }
}
  