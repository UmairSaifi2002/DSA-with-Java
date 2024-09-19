import java.util.*;
import java.util.LinkedList;

public class Q3_Reversing_First_K_elements_of_Queue {

    public static void reverseUptoK(Queue<Integer> q, int k){
        int temp = k;
        Stack<Integer> s = new Stack<>();
        while (k>0) {
            s.push(q.peek());
            q.remove();
            k--;
        }
        while (!s.isEmpty()) {
            q.add(s.pop());
        }
        while (temp>0) {
            int element = q.remove();
            q.add(element);
            temp--;
        }
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
        q.add(7);
        q.add(8);
        int k =4;
        reverseUptoK(q, k);
    }    
}
